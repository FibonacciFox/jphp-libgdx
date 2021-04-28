package php.gdx;


import com.badlogic.gdx.Gdx;

import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.memory.LongMemory;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Namespace(GdxExtension.NS)
public abstract class UXGame extends UXApplicationListener {

    public UXGame(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    protected UXScreen screen;

    @Override
    public void dispose() {
        try {
            if (invokeMethod("dispose") == Memory.NULL) {
                if (screen != null) screen.hide();
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void pause() {
        try {
            if (invokeMethod("pause") == Memory.NULL) {
                if (screen != null) screen.pause();
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void resume() {
        try {
            if (invokeMethod("pause") == Memory.NULL) {
                if (screen != null) screen.resume();
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void render() {
        try {
            if (invokeMethod("render") == Memory.NULL) {
                if (screen != null) screen.render(Gdx.graphics.getDeltaTime());
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void resize(int width, int height) {
        try {
            if (invokeMethod("resize", LongMemory.valueOf(width), LongMemory.valueOf(height)) == Memory.NULL) {
                if (screen != null) screen.resize(width, height);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /**
     * Sets the current screen. {@link UXScreen#hide()} is called on any old screen, and {@link UXScreen#show()} is called on the new
     * screen, if any.
     *
     * @param screen may be {@code null}
     */
    @Reflection.Signature
    public void setScreen(UXScreen screen) {
        if (this.screen != null) this.screen.hide();
        this.screen = screen;
        if (this.screen != null) {
            this.screen.show();
            this.screen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
    }

    /**
     * @return the currently active {@link UXScreen}.
     */
    @Reflection.Signature
    public UXScreen getScreen() {
        return screen;
    }
}
