package php.gdx;

import com.badlogic.gdx.ApplicationListener;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.memory.LongMemory;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Namespace(GdxExtension.NS)
abstract public class ApplicationAdapter extends BaseObject implements ApplicationListener {

    public ApplicationAdapter(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    protected void invokeMethod(String name, Memory... arg) {
        try {
            getEnvironment().invokeMethod(this, name, arg);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void create() {
        invokeMethod("create");
    }

    @Override
    public void resize(int width, int height) {
        invokeMethod("resize", LongMemory.valueOf(width), LongMemory.valueOf(height));
    }

    @Override
    public void render() {
        invokeMethod("render");
    }

    @Override
    public void pause() {
        invokeMethod("pause");
    }

    @Override
    public void resume() {
        invokeMethod("resume");
    }

    @Override
    public void dispose() {
        invokeMethod("dispose");
    }

}
