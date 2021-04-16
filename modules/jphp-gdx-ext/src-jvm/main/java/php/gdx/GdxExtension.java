package php.gdx;
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
        registerClass(scope, ApplicationAdapter.class);
    }


}