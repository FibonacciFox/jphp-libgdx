package php.gdx;

import com.badlogic.gdx.ApplicationListener;
import php.gdx.graphics.GL20;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class GdxExtension extends Extension {
    public static final String NS = "gdx";

    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public String getName() {
        return "php.gdx";
    }

    @Override
    public void onRegister(CompileScope scope) {
        this.registerClass(scope, ApplicationAdapter.class);
        this.registerClass(scope, UXApplicationListener.class);
        this.registerClass(scope, UXGame.class);
        this.registerClass(scope, UXScreen.class);
        this.registerClass(scope, Gdx.class);
        this.registerClass(scope, GL20.class);
    }

}