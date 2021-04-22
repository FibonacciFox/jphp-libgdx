<?php


namespace gdx\backends\lwjgl;

/**
 * Class UXLwjglApplicationConfiguration
 *
 * @package gdx\backends\lwjgl
 */
class UXLwjglApplicationConfiguration
{
    /** The maximum number of threads to use for network requests. Default is {@link Integer#MAX_VALUE}. */
    public $maxNetThreads;

    /** whether to attempt use OpenGL ES 3.0. **/
    public $useGL30 = false;

    /** The OpenGL context major version (the part in front of the decimal point) used to emulate OpenGL ES 3.0, when the version
     * is not supported it will fall back to OpenGL ES 2.0 emulation. Defaults to 3.2 (major=3, minor=2). Only used
     * when
     * {@link #useGL30} is true. OpenGL is fully compatible with OpenGL ES 3.0 since version 4.3, setting the context
     * version to a lower value might cause some features not to function properly. OSX requires 3.2 though.
     *
     * @see <a href="http://legacy.lwjgl.org/javadoc/org/lwjgl/opengl/ContextAttribs.html">LWJGL OSX ContextAttribs
     *     note</a>
     */
    public $gles30ContextMajorVersion = 3;

    /** The OpenGL context major version (the part after the decimal point) used to emulate OpenGL ES 3.0, when the version is not
     * supported it will fall back to OpenGL ES 2.0 emulation. Defaults to 3.2 (major=3, minor=2). Only used when
     * {@link #useGL30} is true. OpenGL is fully compatible with OpenGL ES 3.0 since version 4.3, setting the context
     * version to a lower value might cause some features not to function properly. OSX requires 3.2 though.
     *
     * @see <a href="http://legacy.lwjgl.org/javadoc/org/lwjgl/opengl/ContextAttribs.html">LWJGL OSX ContextAttribs
     *     note</a>
     */
    public $gles30ContextMinorVersion = 2;

    /** number of bits per color channel **/
    public $r = 8;
    public $g = 8;
    public $b = 8;
    public $a = 8;

    /** number of bits for depth and stencil buffer **/
    public $depth = 16;
    public $stencil = 0;

    /** number of samples for MSAA **/
    public $samples = 0;

    /** width & height of application window **/
    public $width = 640;
    public $height = 480;

    /** x & y of application window, -1 for center **/
    public $x = -1;
    public $y = -1;

    /** fullscreen **/
    public $fullscreen = false;

    /** used to emulate screen densities **/
    public $overrideDensity = -1;

    /** whether to enable vsync, can be changed at runtime via {@link Graphics#setVSync(boolean)} **/
    public $vSyncEnabled = true;

    /** title of application **/
    public $title;

    /** whether to call System.exit() on tear-down. Needed for Webstarts on some versions of Mac OS X it seems **/
    public $forceExit = true;

    /** whether the window is resizable **/
    public $resizable = true;

    /** whether the window is undecorated **/
    public $undecorated = false;

    /** the maximum number of sources that can be played simultaneously */
    public $audioDeviceSimultaneousSources = 16;

    /** the audio device buffer size in samples **/
    public $audioDeviceBufferSize = 512;

    /** the audio device buffer count **/
    public $audioDeviceBufferCount = 9;

    /** Target framerate when the window is in the foreground. The CPU sleeps as needed. Use 0 to never sleep. **/
    public $foregroundFPS = 60;

    /** Target framerate when the window is not in the foreground. The CPU sleeps as needed. Use 0 to never sleep, -1 to not
     * render. **/
    public $backgroundFPS = 60;

    /** {@link LifecycleListener#pause()} and don't render when the window is minimized. **/
    public $pauseWhenMinimized = true;
    /** {@link LifecycleListener#pause()} (but continue rendering) when the window is not minimized and not the foreground window.
     * To stop rendering when not the foreground window, use backgroundFPS -1. **/
    public $pauseWhenBackground = false;
    /** Allows software OpenGL rendering if hardware acceleration was not available.
     *
     * @see LwjglGraphics#isSoftwareMode()
     */
    public $allowSoftwareMode = false;
    /** Preferences directory on the desktop. Default is ".prefs/". */
    public $preferencesDirectory = ".prefs/";

    /** enable HDPI mode on Mac OS X **/
    public $useHDPI = false;
}
