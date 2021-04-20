package php.gdx.backends.android;

import android.os.Bundle;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;
import android.os.Bundle;

@Reflection.Name("gdx\\backends\\android\\AndroidLauncher")
public class AndroidLauncher extends BaseWrapper<AndroidApplication> {

    public AndroidLauncher(Environment env, AndroidApplication wrappedObject) {
        super(env, wrappedObject);

    }

    public AndroidLauncher(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new AndroidApplication();
    }

    @Reflection.Signature
    public void initialize(ApplicationAdapter adapter){
        getWrappedObject().initialize(adapter);
    }

    @Reflection.Signature
    public void initialize(ApplicationAdapter adapter, AndroidApplicationConfiguration config){
        getWrappedObject().initialize(adapter, config);
    }

}
