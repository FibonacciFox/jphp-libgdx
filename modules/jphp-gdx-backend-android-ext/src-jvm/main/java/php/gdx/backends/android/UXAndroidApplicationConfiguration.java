package php.gdx.backends.android;


import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;

import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("gdx\\backends\\android\\UXAndroidApplicationConfiguration")
public class UXAndroidApplicationConfiguration extends BaseWrapper<AndroidApplicationConfiguration> {

    public UXAndroidApplicationConfiguration(Environment env, AndroidApplicationConfiguration wrappedObject) {
        super(env, wrappedObject);

    }

    public UXAndroidApplicationConfiguration(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new AndroidApplicationConfiguration();
    }

    interface WrappedInterface {

    }


}