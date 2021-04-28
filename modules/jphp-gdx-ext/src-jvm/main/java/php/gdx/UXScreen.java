package php.gdx;


import com.badlogic.gdx.Screen;
import php.runtime.Memory;
import php.runtime.memory.DoubleMemory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.memory.LongMemory;
import php.runtime.reflection.ClassEntity;


/**
 * <p>
 * Represents one of many application screens, such as a main menu, a settings menu, the game screen and so on.
 * </p>
 * <p>
 * Note that {@link #dispose()} is not called automatically.
 * </p>
 *
 * @see UXGame
 */

@Reflection.Abstract
@Reflection.Namespace(GdxExtension.NS)
public abstract class UXScreen extends BaseObject implements Screen {

    public UXScreen(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    protected void invokeMethod(String name, Memory... arg){
        try {
            getEnvironment().invokeMethod(this, name, arg);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * Called when this screen becomes the current screen for a {@link UXGame}.
     */
    @Override
    public void show() {
        invokeMethod("show");
    }

    /**
     * Called when the screen should render itself.
     *
     * @param delta The time in seconds since the last render.
     */
    @Override
    public void render(float delta) {
        invokeMethod("show", DoubleMemory.valueOf(delta));
    }

    /**
     * @see UXApplicationListener#resize(int, int)
     */
    @Override
    public void resize(int width, int height) {
        invokeMethod("resize", LongMemory.valueOf(width), LongMemory.valueOf(height));
    }

    /**
     * @see UXApplicationListener#pause()
     */
    @Override
    public void pause() {
        invokeMethod("pause");
    }

    /**
     * @see UXApplicationListener#resume()
     */
    @Override
    public void resume() {
        invokeMethod("resume");
    }

    /**
     * Called when this screen is no longer the current screen for a {@link UXGame}.
     */
    @Override
    public void hide() {
        invokeMethod("hide");
    }

    /**
     * Called when this screen should release all resources.
     */
    @Override
    public void dispose() {
        invokeMethod("dispose");
    }
}
