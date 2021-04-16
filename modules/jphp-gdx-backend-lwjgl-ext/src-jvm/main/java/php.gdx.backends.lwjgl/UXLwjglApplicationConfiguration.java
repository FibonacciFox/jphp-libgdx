package php.gdx.backends.lwjgl;

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("gdx\\backends\\lwjgl\\UXLwjglApplicationConfiguration")
public class UXLwjglApplicationConfiguration extends BaseWrapper<LwjglApplicationConfiguration> {

    public UXLwjglApplicationConfiguration(Environment env, LwjglApplicationConfiguration wrappedObject) {
        super(env, wrappedObject);

    }

    public UXLwjglApplicationConfiguration(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __wrappedObject = new LwjglApplicationConfiguration();
    }

    interface WrappedInterface {

    }

    @Reflection.Getter("title")
    private Memory getTitle() {
        return StringMemory.valueOf(getWrappedObject().title);
    }

    @Reflection.Setter("title")
    private Memory setTitle(Memory title) {
        getWrappedObject().title = title.toString();
        return Memory.NULL;
    }

}
