package php.gdx.backends.lwjgl;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl.LwjglGraphics;
import com.badlogic.gdx.graphics.Color;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.LongMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("gdx\\backends\\lwjgl\\UXLwjglApplicationConfiguration")
public class UXLwjglApplicationConfiguration extends BaseWrapper<LwjglApplicationConfiguration> {

    public UXLwjglApplicationConfiguration(Environment env, LwjglApplicationConfiguration wrappedObject) {
        super(env, wrappedObject);

    }

    public UXLwjglApplicationConfiguration(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new LwjglApplicationConfiguration();
    }

    interface WrappedInterface {

    }


    /**
     * The maximum number of threads to use for network requests. Default is {@link Integer#MAX_VALUE}.
     */
    @Reflection.Getter("maxNetThreads")
    private Memory getMaxNetThreads() {
        return LongMemory.valueOf(getWrappedObject().maxNetThreads);
    }

    @Reflection.Setter("maxNetThreads")
    private Memory setMaxNetThreads(Memory maxNetThreads) {
        getWrappedObject().maxNetThreads = maxNetThreads.toInteger();
        return Memory.NULL;
    }

    /**
     * whether to attempt use OpenGL ES 3.0.
     **/
    public boolean useGL30 = false;

    @Reflection.Getter("useGL30")
    private boolean getUseGL30() {
        return getWrappedObject().useGL30;
    }


    @Reflection.Setter("useGL30")
    private Memory setUseGL30(Memory useGL30) {
        getWrappedObject().useGL30 = useGL30.toBoolean();
        return Memory.NULL;
    }

    /**
     * The OpenGL context major version (the part in front of the decimal point) used to emulate OpenGL ES 3.0, when the version
     * is not supported it will fall back to OpenGL ES 2.0 emulation. Defaults to 3.2 (major=3, minor=2). Only used when
     * {@link #useGL30} is true. OpenGL is fully compatible with OpenGL ES 3.0 since version 4.3, setting the context version to a
     * lower value might cause some features not to function properly. OSX requires 3.2 though.
     *
     * @see <a href="http://legacy.lwjgl.org/javadoc/org/lwjgl/opengl/ContextAttribs.html">LWJGL OSX ContextAttribs note</a>
     */

    @Reflection.Getter("gles30ContextMajorVersion")
    private Memory getGles30ContextMajorVersion() {
        return LongMemory.valueOf(getWrappedObject().gles30ContextMajorVersion);
    }

    @Reflection.Setter("gles30ContextMajorVersion")
    private Memory setGles30ContextMajorVersion(Memory gles30ContextMajorVersion) {
        getWrappedObject().gles30ContextMajorVersion = gles30ContextMajorVersion.toInteger();
        return Memory.NULL;
    }

    /**
     * The OpenGL context major version (the part after the decimal point) used to emulate OpenGL ES 3.0, when the version is not
     * supported it will fall back to OpenGL ES 2.0 emulation. Defaults to 3.2 (major=3, minor=2). Only used when {@link #useGL30}
     * is true. OpenGL is fully compatible with OpenGL ES 3.0 since version 4.3, setting the context version to a lower value might
     * cause some features not to function properly. OSX requires 3.2 though.
     *
     * @see <a href="http://legacy.lwjgl.org/javadoc/org/lwjgl/opengl/ContextAttribs.html">LWJGL OSX ContextAttribs note</a>
     */

    @Reflection.Getter("gles30ContextMinorVersion")
    private Memory getGles30ContextMinorVersion() {
        return LongMemory.valueOf(getWrappedObject().gles30ContextMinorVersion);
    }

    @Reflection.Setter("gles30ContextMinorVersion")
    private Memory setGles30ContextMinorVersion(Memory gles30ContextMinorVersion) {
        getWrappedObject().gles30ContextMinorVersion = gles30ContextMinorVersion.toInteger();
        return Memory.NULL;
    }

    /**
     * number of bits per color channel
     **/

    @Reflection.Getter("r")
    private Memory getR() {
        return LongMemory.valueOf(getWrappedObject().r);
    }

    @Reflection.Setter("r")
    private Memory setR(Memory r) {
        getWrappedObject().r = r.toInteger();
        return Memory.NULL;
    }

    @Reflection.Getter("g")
    private Memory getG() {
        return LongMemory.valueOf(getWrappedObject().g);
    }

    @Reflection.Setter("g")
    private Memory setG(Memory g) {
        getWrappedObject().g = g.toInteger();
        return Memory.NULL;
    }

    @Reflection.Getter("b")
    private Memory getB() {
        return LongMemory.valueOf(getWrappedObject().b);
    }

    @Reflection.Setter("b")
    private Memory setB(Memory b) {
        getWrappedObject().b = b.toInteger();
        return Memory.NULL;
    }

    @Reflection.Getter("a")
    private Memory getA() {
        return LongMemory.valueOf(getWrappedObject().a);
    }

    @Reflection.Setter("a")
    private Memory setA(Memory a) {
        getWrappedObject().a = a.toInteger();
        return Memory.NULL;
    }


    /**
     * number of bits for depth and stencil buffer
     **/

    @Reflection.Getter("depth")
    private Memory getDepth() {
        return LongMemory.valueOf(getWrappedObject().depth);
    }

    @Reflection.Setter("depth")
    private Memory setDepth(Memory depth) {
        getWrappedObject().depth = depth.toInteger();
        return Memory.NULL;
    }

    @Reflection.Getter("stencil")
    private Memory getStencil() {
        return LongMemory.valueOf(getWrappedObject().stencil);
    }

    @Reflection.Setter("stencil")
    private Memory setStencil(Memory stencil) {
        getWrappedObject().stencil = stencil.toInteger();
        return Memory.NULL;
    }

    /**
     * number of samples for MSAA
     **/

    @Reflection.Getter("samples")
    private Memory getSamples() {
        return LongMemory.valueOf(getWrappedObject().samples);
    }

    @Reflection.Setter("samples")
    private Memory setSamples(Memory samples) {
        getWrappedObject().samples = samples.toInteger();
        return Memory.NULL;
    }

    /**
     * width & height of application window
     **/

    @Reflection.Getter("width")
    private Memory getWidth() {
        return LongMemory.valueOf(getWrappedObject().width);
    }

    @Reflection.Setter("width")
    private Memory setWidth(Memory width) {
        getWrappedObject().width = width.toInteger();
        return Memory.NULL;
    }

    @Reflection.Getter("height")
    private Memory getHeight() {
        return LongMemory.valueOf(getWrappedObject().height);
    }

    @Reflection.Setter("height")
    private Memory setHeight(Memory height) {
        getWrappedObject().height = height.toInteger();
        return Memory.NULL;
    }

    /**
     * x & y of application window, -1 for center
     **/

    @Reflection.Getter("x")
    private Memory getX() {
        return LongMemory.valueOf(getWrappedObject().x);
    }

    @Reflection.Setter("x")
    private Memory setX(Memory x) {
        getWrappedObject().x = x.toInteger();
        return Memory.NULL;
    }

    @Reflection.Getter("y")
    private Memory getY() {
        return LongMemory.valueOf(getWrappedObject().y);
    }

    @Reflection.Setter("y")
    private Memory setY(Memory y) {
        getWrappedObject().y = y.toInteger();
        return Memory.NULL;
    }

    /**
     * fullscreen
     **/

    @Reflection.Getter("fullscreen")
    private boolean getFullscreen() {
        return getWrappedObject().fullscreen;
    }

    @Reflection.Setter("fullscreen")
    private Memory setFullscreen(Memory fullscreen) {
        getWrappedObject().fullscreen = fullscreen.toBoolean();
        return Memory.NULL;
    }

    /**
     * used to emulate screen densities
     **/

    @Reflection.Getter("overrideDensity")
    private Memory getOverrideDensity() {
        return LongMemory.valueOf(getWrappedObject().overrideDensity);
    }

    @Reflection.Setter("overrideDensity")
    private Memory setOverrideDensity(Memory overrideDensity) {
        getWrappedObject().overrideDensity = overrideDensity.toInteger();
        return Memory.NULL;
    }

    /**
     * whether to enable vsync, can be changed at runtime via {@link Graphics#setVSync(boolean)}
     **/

    @Reflection.Getter("vSyncEnabled")
    private boolean getVSyncEnabled() {
        return getWrappedObject().vSyncEnabled;
    }

    @Reflection.Setter("vSyncEnabled")
    private Memory setVSyncEnabled(Memory vSyncEnabled) {
        getWrappedObject().vSyncEnabled = vSyncEnabled.toBoolean();
        return Memory.NULL;
    }

    /**
     * title of application
     **/
    @Reflection.Getter("title")
    private Memory getTitle() {
        return StringMemory.valueOf(getWrappedObject().title);
    }

    @Reflection.Setter("title")
    private Memory setTitle(Memory title) {
        getWrappedObject().title = title.toString();
        return Memory.NULL;
    }

    /**
     * whether to call System.exit() on tear-down. Needed for Webstarts on some versions of Mac OS X it seems
     **/

    @Reflection.Getter("forceExit")
    private boolean getForceExit() {
        return getWrappedObject().forceExit;
    }

    @Reflection.Setter("forceExit")
    private Memory setForceExit(Memory forceExit) {
        getWrappedObject().forceExit = forceExit.toBoolean();
        return Memory.NULL;
    }

    /**
     * whether the window is resizable
     **/

    @Reflection.Getter("resizable")
    private boolean getResizable() {
        return getWrappedObject().resizable;
    }

    @Reflection.Setter("resizable")
    private Memory setResizable(Memory resizable) {
        getWrappedObject().resizable = resizable.toBoolean();
        return Memory.NULL;
    }

    /**
     * whether the window is undecorated
     **/

    @Reflection.Getter("undecorated")
    private boolean getUndecorated() {
        return getWrappedObject().undecorated;
    }

    @Reflection.Setter("undecorated")
    private Memory setUndecorated(Memory undecorated) {
        getWrappedObject().undecorated = undecorated.toBoolean();
        return Memory.NULL;
    }

    /**
     * the maximum number of sources that can be played simultaneously
     */

    @Reflection.Getter("audioDeviceSimultaneousSources")
    private Memory getAudioDeviceSimultaneousSources() {
        return LongMemory.valueOf(getWrappedObject().audioDeviceSimultaneousSources);
    }

    @Reflection.Setter("audioDeviceSimultaneousSources")
    private Memory setAudioDeviceSimultaneousSources(Memory audioDeviceSimultaneousSources) {
        getWrappedObject().audioDeviceSimultaneousSources = audioDeviceSimultaneousSources.toInteger();
        return Memory.NULL;
    }

    /**
     * the audio device buffer size in samples
     **/

    @Reflection.Getter("audioDeviceBufferSize")
    private Memory getAudioDeviceBufferSize() {
        return LongMemory.valueOf(getWrappedObject().audioDeviceBufferSize);
    }

    @Reflection.Setter("audioDeviceBufferSize")
    private Memory setAudioDeviceBufferSize(Memory audioDeviceBufferSize) {
        getWrappedObject().audioDeviceBufferSize = audioDeviceBufferSize.toInteger();
        return Memory.NULL;
    }


    /**
     * the audio device buffer count
     **/

    @Reflection.Getter("audioDeviceBufferCount")
    private Memory getAudioDeviceBufferCount() {
        return LongMemory.valueOf(getWrappedObject().audioDeviceBufferCount);
    }

    @Reflection.Setter("audioDeviceBufferCount")
    private Memory setAudioDeviceBufferCount(Memory audioDeviceBufferCount) {
        getWrappedObject().audioDeviceBufferCount = audioDeviceBufferCount.toInteger();
        return Memory.NULL;
    }


    /* public Color initialBackgroundColor = Color.BLACK; - com.badlogic.gdx.graphics */


    /**
     * Target framerate when the window is in the foreground. The CPU sleeps as needed. Use 0 to never sleep.
     **/

    @Reflection.Getter("foregroundFPS")
    private Memory getForegroundFPS() {
        return LongMemory.valueOf(getWrappedObject().foregroundFPS);
    }

    @Reflection.Setter("foregroundFPS")
    private Memory setForegroundFPS(Memory foregroundFPS) {
        getWrappedObject().foregroundFPS = foregroundFPS.toInteger();
        return Memory.NULL;
    }

    /**
     * Target framerate when the window is not in the foreground. The CPU sleeps as needed. Use 0 to never sleep, -1 to not
     * render.
     **/

    @Reflection.Getter("backgroundFPS")
    private Memory getBackgroundFPS() {
        return LongMemory.valueOf(getWrappedObject().backgroundFPS);
    }

    @Reflection.Setter("backgroundFPS")
    private Memory setBackgroundFPS(Memory backgroundFPS) {
        getWrappedObject().backgroundFPS = backgroundFPS.toInteger();
        return Memory.NULL;
    }

    /**
     * {@link LifecycleListener#pause()} and don't render when the window is minimized.
     **/

    @Reflection.Getter("pauseWhenMinimized")
    private boolean getPauseWhenMinimized() {
        return getWrappedObject().pauseWhenMinimized;
    }

    @Reflection.Setter("pauseWhenMinimized")
    private Memory setPauseWhenMinimized(Memory pauseWhenMinimized) {
        getWrappedObject().pauseWhenMinimized = pauseWhenMinimized.toBoolean();
        return Memory.NULL;
    }

    /**
     * {@link LifecycleListener#pause()} (but continue rendering) when the window is not minimized and not the foreground window.
     * To stop rendering when not the foreground window, use backgroundFPS -1.
     **/

    @Reflection.Getter("pauseWhenBackground")
    private boolean getPauseWhenBackground() {
        return getWrappedObject().pauseWhenBackground;
    }

    @Reflection.Setter("pauseWhenBackground")
    private Memory setPauseWhenBackground(Memory pauseWhenBackground) {
        getWrappedObject().pauseWhenBackground = pauseWhenBackground.toBoolean();
        return Memory.NULL;
    }

    /**
     * Allows software OpenGL rendering if hardware acceleration was not available.
     *
     * @see LwjglGraphics#isSoftwareMode()
     */

    @Reflection.Getter("allowSoftwareMode")
    private boolean getAllowSoftwareMode() {
        return getWrappedObject().allowSoftwareMode;
    }

    @Reflection.Setter("allowSoftwareMode")
    private Memory setAllowSoftwareMode(Memory allowSoftwareMode) {
        getWrappedObject().allowSoftwareMode = allowSoftwareMode.toBoolean();
        return Memory.NULL;
    }

    /**
     * Preferences directory on the desktop. Default is ".prefs/".
     */

    @Reflection.Getter("preferencesDirectory")
    private Memory getPreferencesDirectory() {
        return StringMemory.valueOf(getWrappedObject().preferencesDirectory);
    }

    @Reflection.Setter("preferencesDirectory")
    private Memory setPreferencesDirectory(Memory preferencesDirectory) {
        getWrappedObject().preferencesDirectory = preferencesDirectory.toString();
        return Memory.NULL;
    }


    /*
     * Preferences file type on the desktop. Default is FileType.External
     * public Files.FileType preferencesFileType = Files.FileType.External; - com.badlogic.gdx
     */

    /*
     * Callback used when trying to create a display, can handle failures, default value is null (disabled)
     * public LwjglGraphics.SetDisplayModeCallback setDisplayModeCallback; -com.badlogic.gdx.backends.lwjgl
     */

    /**
     * enable HDPI mode on Mac OS X
     **/
    public boolean useHDPI = false;

    @Reflection.Getter("useHDPI")
    private boolean getUseHDPI() {
        return getWrappedObject().useHDPI;
    }

    @Reflection.Setter("useHDPI")
    private Memory setUseHDPI(Memory useHDPI) {
        getWrappedObject().useHDPI = useHDPI.toBoolean();
        return Memory.NULL;
    }


}
