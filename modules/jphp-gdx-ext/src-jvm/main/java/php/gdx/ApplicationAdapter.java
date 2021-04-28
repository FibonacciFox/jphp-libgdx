package php.gdx;


import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Namespace(GdxExtension.NS)
abstract public class ApplicationAdapter extends UXApplicationListener {

    public ApplicationAdapter(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

}
