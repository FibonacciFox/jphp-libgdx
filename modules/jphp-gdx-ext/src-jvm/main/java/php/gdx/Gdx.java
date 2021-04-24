package php.gdx;


import php.gdx.graphics.GL20;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;

import php.runtime.lang.BaseObject;

import php.runtime.reflection.ClassEntity;

@Reflection.Final
@Reflection.Namespace(GdxExtension.NS)
public class Gdx extends BaseObject {

    private static GL20 gl;


    public Gdx(Environment env) {
        super(env);
    }

    public Gdx(Environment env, ClassEntity clazz) {
        super(env, clazz);
        gl = new GL20(env);
    }

    @Reflection.Signature
    public Memory __construct(Environment env, Memory... args) {
        // do something
        return Memory.NULL;
    }



    @Reflection.Getter("gl")
    private GL20 getGl() {
        return gl;
    }

    @Reflection.Setter("gl")
    private Memory setGl(GL20 gl) {
        Gdx.gl = gl;
        return Memory.NULL;
    }

}
