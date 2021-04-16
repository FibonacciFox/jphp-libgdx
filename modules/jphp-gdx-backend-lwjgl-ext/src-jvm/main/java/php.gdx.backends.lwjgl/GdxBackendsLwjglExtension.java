package php.gdx.backends.lwjgl;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class GdxBackendsLwjglExtension extends Extension {
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

        registerWrapperClass(scope, LwjglApplication.class, UXLwjglApplication.class);
        registerWrapperClass(scope, LwjglApplicationConfiguration.class, UXLwjglApplicationConfiguration.class);

    }


}