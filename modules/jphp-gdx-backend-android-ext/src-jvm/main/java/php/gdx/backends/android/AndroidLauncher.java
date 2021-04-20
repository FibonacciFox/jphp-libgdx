package php.gdx.backends.android;

import com.badlogic.gdx.backends.android.AndroidApplication;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("gdx\\backends\\android\\AndroidLauncher")
public class AndroidLauncher extends BaseWrapper<AndroidApplication> {

    public AndroidLauncher(Environment env, AndroidApplication wrappedObject) {
        super(env, wrappedObject);

    }

    public AndroidLauncher(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

}
