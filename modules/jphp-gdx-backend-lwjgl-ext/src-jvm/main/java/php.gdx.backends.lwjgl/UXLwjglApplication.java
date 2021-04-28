package php.gdx.backends.lwjgl;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import php.gdx.UXApplicationListener;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("gdx\\backends\\lwjgl\\UXLwjglApplication")
public class UXLwjglApplication extends BaseWrapper<LwjglApplication> {

    public UXLwjglApplication(Environment env, LwjglApplication wrappedObject) {
        super(env, wrappedObject);
    }

    public UXLwjglApplication(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }


    @Reflection.Signature
    public void __construct(UXApplicationListener listener, LwjglApplicationConfiguration config) {
        __wrappedObject = new LwjglApplication(listener, config);
    }
}