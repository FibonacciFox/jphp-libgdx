<?php

use packager\cli\Console;
use packager\Colors;
use packager\Event;
use packager\Package;
use php\format\ProcessorException;
use php\format\YamlProcessor;
use php\io\IOException;
use php\lib\fs;
use php\lib\arr;

/**
 * @jppm-description initialize new package libgdx
 * @jppm-task libgdx:init
 *
 * @param Event $event
 */

function task_libgdxInit(Event $event)
{
    if (arr::count($event->args()) >= 1) {
        $template = new TemplatePlugin();
        $template->init($event);
    } else {

        $version = "1.0.0";
        $dir = fs::abs("./modules");
        $name = null;

        Console::log(Colors::withColor("JPHP Packager", 'silver') . " " . Colors::withColor($event->packager()->getVersion(), 'bold'));
        Console::log("Init new libgdx package in '$dir':");

        do {
            $name = Console::read("Enter the jphp-" . Colors::withColor('name', 'green') . "-ext of the new libgdx jppm package:");
        } while ($name == null);

        $name = "jphp-$name-ext";
        $dir = fs::abs("./modules/$name");

        if (fs::exists($dir . '/' . Package::FILENAME)) {
            Console::error("Failed to init, package '{0}' already exists", $dir . '/' . Package::FILENAME);
            exit(-1);
        }

        $version = Console::read("Enter " . Colors::withColor('version', 'bold') . " ($version):", $version);
        $gdx_version = Console::read("Enter " . Colors::withColor('libgdx version', 'bold') . ":", $event->package()->getAny('gdx')['version']);
        $description = Console::read("Enter " . Colors::withColor('description', 'bold') . ":", 'libgdx jppm package');

        //$addAppPlugin = Console::readYesNo("Add '" . Colors::withColor('jphp app', 'bold') . "' plugin? (default = Yes)", 'yes');


        $data = [
            'name' => $name,
            'version' => $version,
        ];

        if ($description) {
            $data['description'] = $description;
        }

        $data['plugins'] = ['Gradle'];
        $data['deps']['jphp-runtime'] = '*';
        $data['gdx']['version'] = $gdx_version;
        $data['gradle']['providedDeps'] = '';
        $data['gradle']['deps'] = '';



        Tasks::createDir("$dir/sdk");
        Tasks::createDir("$dir/src-jvm/main/java");
        Tasks::createDir("$dir/src-jvm/main/resources/META-INF/services");
        Tasks::createFile("$dir/src-jvm/main/resources/META-INF/services/php.runtime.ext.support.Extension");

        $package = new Package($data, []);
        Tasks::createDir($dir);
        $event->packager()->writePackage($package, $dir);

        Console::log("Success, {0} in '$dir' has been created.", Package::FILENAME);
    }

    Console::printForXterm("✨ ");
    Console::log("Done.");
}

/**
 * @jppm-description Changes the libgdx version for all jppm packages
 * @jppm-task libgdx:version:changes
 * @param Event $event
 * @throws IOException
 * @throws ProcessorException
 */
function task_libgdxVersionChanges(Event $event)
{
    $newGdxVersion = $event->package()->getAny('gdx')['version'];

    Console::log("-> Change libgdx version to " . Colors::withColor($newGdxVersion, 'green') . " for jppm packages:");

    foreach ($event->package()->getAny('modules', []) as $i => $module) {

        $data = fs::parseAs("./modules/$module/package.php.yml", 'yaml');
        $currentGdxVersion = $data['gdx']['version'];
        Console::log(" - " . Colors::withColor($module . '@' . $data['version'], 'blue') . " - current version libgdx: " . Colors::withColor($currentGdxVersion, 'red'));
    }

    $applyChange = Console::readYesNo("Apply the change? (default = Yes)", 'yes');

    if ($applyChange) {
        foreach ($event->package()->getAny('modules', []) as $i => $module) {

            $data = fs::parseAs("./modules/$module/package.php.yml", 'yaml');

            $data['gdx']['version'] = $newGdxVersion;

            fs::formatAs("./modules/$module/package.php.yml", $data, 'yaml', YamlProcessor::SERIALIZE_PRETTY_FLOW | YamlProcessor::SERIALIZE_NOT_SPLIT_LINES);

            $currentGdxVersion = $data['gdx']['version'];
            Console::log(" - " . Colors::withColor($module . '@' . $data['version'], 'green') . " - change to: " . Colors::withColor($currentGdxVersion, 'green'));

        }
    }
}


/**
 * @jppm-task libgdx:build
 * @param Event $event
 */
function task_libgdxBuild(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        try{
            Tasks::runExternal("./modules/$module", 'build', ...$event->flags());
        } catch (IOException $ex){
            Console::log(Colors::withColor('(info)','red')." The $module package does not exist.");
        }
    }
}


/**
 * @jppm-task libgdx:install
 * @param Event $event
 */
function task_libgdxInstall(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        try{
            Tasks::runExternal("./modules/$module", 'install', ...$event->flags());
        } catch (IOException $ex){
            Console::log(Colors::withColor('(info)','red')." The $module package does not exist.");
        }
    }
}


/**
 * @jppm-task libgdx:unpublish
 * @param Event $event
 */
function task_libgdxUnpublish(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        try{
            Tasks::runExternal("./modules/$module", 'unpublish', ...$event->flags());
        } catch (IOException $ex){
            Console::log(Colors::withColor('(info)','red')." The $module package does not exist.");
        }
    }
}


/**
 * @jppm-task libgdx:publish
 * @param Event $event
 */
function task_libgdxPublish(Event $event)
{
    foreach ($event->package()->getAny('modules', []) as $i => $module) {
        try{
            Tasks::runExternal("./modules/$module", 'publish', ...$event->flags());
        } catch (IOException $ex){
            Console::log(Colors::withColor('(info)','red')." The $module package does not exist.");
        }
    }
}
