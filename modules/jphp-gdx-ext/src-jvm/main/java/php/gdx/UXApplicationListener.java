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
public abstract class UXApplicationListener extends BaseObject implements ApplicationListener {

    public UXApplicationListener(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    protected Memory invokeMethod(String name, Memory... arg) throws Throwable {
        if(getReflection().findMethod(name) != null){ //Проверяем наличие метода и вызываем если он есть
            return getEnvironment().invokeMethod(this, name, arg);
        } else {
            return Memory.NULL;
        }
    }

    @Override
    public void create() {
        try {
            invokeMethod("create");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



    @Override
    public void resize(int width, int height) {
        try {
            invokeMethod("resize", LongMemory.valueOf(width), LongMemory.valueOf(height));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void render() {
        try {
            invokeMethod("render");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void pause() {
        try {
            invokeMethod("pause");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void resume() {
        try {
            invokeMethod("resume");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public void dispose() {
        try {
            invokeMethod("dispose");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
