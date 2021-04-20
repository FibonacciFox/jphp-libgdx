package php.gdx.backends.android;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;


public class GdxBackendsAndroidExtension extends Extension {
    public static final String NS = "gdx";

    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public String getName() {
        return "php.gdx.backends.lwjgl";
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerWrapperClass(scope, AndroidApplicationConfiguration.class, UXAndroidApplicationConfiguration.class);
        registerWrapperClass(scope, AndroidApplication.class, AndroidLauncher.class);
    }

}