<?php


namespace gdx\backends\lwjgl;

/**
 * Class UXLwjglApplicationConfiguration
 *
 * @package gdx\backends\lwjgl
 */
class UXLwjglApplicationConfiguration
{
    /**
     * If true, OpenAL will not be used.
     * This means {@link Application#getAudio()} returns null and the gdx-openal.jar and OpenAL
     * natives are not needed.
     */
    public static bool $disableAudio;

    /**
     * title of application
     */
    public string $title;

}