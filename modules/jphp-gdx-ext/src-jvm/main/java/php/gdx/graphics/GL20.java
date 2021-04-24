package php.gdx.graphics;


import com.badlogic.gdx.Gdx;
import php.gdx.GdxExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;

@Reflection.Name(GdxExtension.NS + "\\graphics\\GL20")
public class GL20 extends BaseObject {

    public GL20(Environment env) {
        super(env);
    }

    public GL20(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    final public static int GL_ES_VERSION_2_0 = 1;
    final public static int GL_DEPTH_BUFFER_BIT = 256;
    final public static int GL_STENCIL_BUFFER_BIT = 1024;
    final public static int GL_COLOR_BUFFER_BIT = 16384;
    final public static int GL_FALSE = 0;
    final public static int GL_TRUE = 1;
    final public static int GL_POINTS = 0;
    final public static int GL_LINES = 1;
    final public static int GL_LINE_LOOP = 2;
    final public static int GL_LINE_STRIP = 3;
    final public static int GL_TRIANGLES = 4;
    final public static int GL_TRIANGLE_STRIP = 5;
    final public static int GL_TRIANGLE_FAN = 6;
    final public static int GL_ZERO = 0;
    final public static int GL_ONE = 1;
    final public static int GL_SRC_COLOR = 768;
    final public static int GL_ONE_MINUS_SRC_COLOR = 769;
    final public static int GL_SRC_ALPHA = 770;
    final public static int GL_ONE_MINUS_SRC_ALPHA = 771;
    final public static int GL_DST_ALPHA = 772;
    final public static int GL_ONE_MINUS_DST_ALPHA = 773;
    final public static int GL_DST_COLOR = 774;
    final public static int GL_ONE_MINUS_DST_COLOR = 775;
    final public static int GL_SRC_ALPHA_SATURATE = 776;
    final public static int GL_FUNC_ADD = 32774;
    final public static int GL_BLEND_EQUATION = 32777;
    final public static int GL_BLEND_EQUATION_RGB = 32777;
    final public static int GL_BLEND_EQUATION_ALPHA = 34877;
    final public static int GL_FUNC_SUBTRACT = 32778;
    final public static int GL_FUNC_REVERSE_SUBTRACT = 32779;
    final public static int GL_BLEND_DST_RGB = 32968;
    final public static int GL_BLEND_SRC_RGB = 32969;
    final public static int GL_BLEND_DST_ALPHA = 32970;
    final public static int GL_BLEND_SRC_ALPHA = 32971;
    final public static int GL_CONSTANT_COLOR = 32769;
    final public static int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    final public static int GL_CONSTANT_ALPHA = 32771;
    final public static int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    final public static int GL_BLEND_COLOR = 32773;
    final public static int GL_ARRAY_BUFFER = 34962;
    final public static int GL_ELEMENT_ARRAY_BUFFER = 34963;
    final public static int GL_ARRAY_BUFFER_BINDING = 34964;
    final public static int GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
    final public static int GL_STREAM_DRAW = 35040;
    final public static int GL_STATIC_DRAW = 35044;
    final public static int GL_DYNAMIC_DRAW = 35048;
    final public static int GL_BUFFER_SIZE = 34660;
    final public static int GL_BUFFER_USAGE = 34661;
    final public static int GL_CURRENT_VERTEX_ATTRIB = 34342;
    final public static int GL_FRONT = 1028;
    final public static int GL_BACK = 1029;
    final public static int GL_FRONT_AND_BACK = 1032;
    final public static int GL_TEXTURE_2D = 3553;
    final public static int GL_CULL_FACE = 2884;
    final public static int GL_BLEND = 3042;
    final public static int GL_DITHER = 3024;
    final public static int GL_STENCIL_TEST = 2960;
    final public static int GL_DEPTH_TEST = 2929;
    final public static int GL_SCISSOR_TEST = 3089;
    final public static int GL_POLYGON_OFFSET_FILL = 32823;
    final public static int GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;
    final public static int GL_SAMPLE_COVERAGE = 32928;
    final public static int GL_NO_ERROR = 0;
    final public static int GL_INVALID_ENUM = 1280;
    final public static int GL_INVALID_VALUE = 1281;
    final public static int GL_INVALID_OPERATION = 1282;
    final public static int GL_OUT_OF_MEMORY = 1285;
    final public static int GL_CW = 2304;
    final public static int GL_CCW = 2305;
    final public static int GL_LINE_WIDTH = 2849;
    final public static int GL_ALIASED_POINT_SIZE_RANGE = 33901;
    final public static int GL_ALIASED_LINE_WIDTH_RANGE = 33902;
    final public static int GL_CULL_FACE_MODE = 2885;
    final public static int GL_FRONT_FACE = 2886;
    final public static int GL_DEPTH_RANGE = 2928;
    final public static int GL_DEPTH_WRITEMASK = 2930;
    final public static int GL_DEPTH_CLEAR_VALUE = 2931;
    final public static int GL_DEPTH_FUNC = 2932;
    final public static int GL_STENCIL_CLEAR_VALUE = 2961;
    final public static int GL_STENCIL_FUNC = 2962;
    final public static int GL_STENCIL_FAIL = 2964;
    final public static int GL_STENCIL_PASS_DEPTH_FAIL = 2965;
    final public static int GL_STENCIL_PASS_DEPTH_PASS = 2966;
    final public static int GL_STENCIL_REF = 2967;
    final public static int GL_STENCIL_VALUE_MASK = 2963;
    final public static int GL_STENCIL_WRITEMASK = 2968;
    final public static int GL_STENCIL_BACK_FUNC = 34816;
    final public static int GL_STENCIL_BACK_FAIL = 34817;
    final public static int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;
    final public static int GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;
    final public static int GL_STENCIL_BACK_REF = 36003;
    final public static int GL_STENCIL_BACK_VALUE_MASK = 36004;
    final public static int GL_STENCIL_BACK_WRITEMASK = 36005;
    final public static int GL_VIEWPORT = 2978;
    final public static int GL_SCISSOR_BOX = 3088;
    final public static int GL_COLOR_CLEAR_VALUE = 3106;
    final public static int GL_COLOR_WRITEMASK = 3107;
    final public static int GL_UNPACK_ALIGNMENT = 3317;
    final public static int GL_PACK_ALIGNMENT = 3333;
    final public static int GL_MAX_TEXTURE_SIZE = 3379;
    final public static int GL_MAX_TEXTURE_UNITS = 34018;
    final public static int GL_MAX_VIEWPORT_DIMS = 3386;
    final public static int GL_SUBPIXEL_BITS = 3408;
    final public static int GL_RED_BITS = 3410;
    final public static int GL_GREEN_BITS = 3411;
    final public static int GL_BLUE_BITS = 3412;
    final public static int GL_ALPHA_BITS = 3413;
    final public static int GL_DEPTH_BITS = 3414;
    final public static int GL_STENCIL_BITS = 3415;
    final public static int GL_POLYGON_OFFSET_UNITS = 10752;
    final public static int GL_POLYGON_OFFSET_FACTOR = 32824;
    final public static int GL_TEXTURE_BINDING_2D = 32873;
    final public static int GL_SAMPLE_BUFFERS = 32936;
    final public static int GL_SAMPLES = 32937;
    final public static int GL_SAMPLE_COVERAGE_VALUE = 32938;
    final public static int GL_SAMPLE_COVERAGE_INVERT = 32939;
    final public static int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;
    final public static int GL_COMPRESSED_TEXTURE_FORMATS = 34467;
    final public static int GL_DONT_CARE = 4352;
    final public static int GL_FASTEST = 4353;
    final public static int GL_NICEST = 4354;
    final public static int GL_GENERATE_MIPMAP = 33169;
    final public static int GL_GENERATE_MIPMAP_HINT = 33170;
    final public static int GL_BYTE = 5120;
    final public static int GL_UNSIGNED_BYTE = 5121;
    final public static int GL_SHORT = 5122;
    final public static int GL_UNSIGNED_SHORT = 5123;
    final public static int GL_INT = 5124;
    final public static int GL_UNSIGNED_INT = 5125;
    final public static int GL_FLOAT = 5126;
    final public static int GL_FIXED = 5132;
    final public static int GL_DEPTH_COMPONENT = 6402;
    final public static int GL_ALPHA = 6406;
    final public static int GL_RGB = 6407;
    final public static int GL_RGBA = 6408;
    final public static int GL_LUMINANCE = 6409;
    final public static int GL_LUMINANCE_ALPHA = 6410;
    final public static int GL_UNSIGNED_SHORT_4_4_4_4 = 32819;
    final public static int GL_UNSIGNED_SHORT_5_5_5_1 = 32820;
    final public static int GL_UNSIGNED_SHORT_5_6_5 = 33635;
    final public static int GL_FRAGMENT_SHADER = 35632;
    final public static int GL_VERTEX_SHADER = 35633;
    final public static int GL_MAX_VERTEX_ATTRIBS = 34921;
    final public static int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
    final public static int GL_MAX_VARYING_VECTORS = 36348;
    final public static int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;
    final public static int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;
    final public static int GL_MAX_TEXTURE_IMAGE_UNITS = 34930;
    final public static int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
    final public static int GL_SHADER_TYPE = 35663;
    final public static int GL_DELETE_STATUS = 35712;
    final public static int GL_LINK_STATUS = 35714;
    final public static int GL_VALIDATE_STATUS = 35715;
    final public static int GL_ATTACHED_SHADERS = 35717;
    final public static int GL_ACTIVE_UNIFORMS = 35718;
    final public static int GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;
    final public static int GL_ACTIVE_ATTRIBUTES = 35721;
    final public static int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;
    final public static int GL_SHADING_LANGUAGE_VERSION = 35724;
    final public static int GL_CURRENT_PROGRAM = 35725;
    final public static int GL_NEVER = 512;
    final public static int GL_LESS = 513;
    final public static int GL_EQUAL = 514;
    final public static int GL_LEQUAL = 515;
    final public static int GL_GREATER = 516;
    final public static int GL_NOTEQUAL = 517;
    final public static int GL_GEQUAL = 518;
    final public static int GL_ALWAYS = 519;
    final public static int GL_KEEP = 7680;
    final public static int GL_REPLACE = 7681;
    final public static int GL_INCR = 7682;
    final public static int GL_DECR = 7683;
    final public static int GL_INVERT = 5386;
    final public static int GL_INCR_WRAP = 34055;
    final public static int GL_DECR_WRAP = 34056;
    final public static int GL_VENDOR = 7936;
    final public static int GL_RENDERER = 7937;
    final public static int GL_VERSION = 7938;
    final public static int GL_EXTENSIONS = 7939;
    final public static int GL_NEAREST = 9728;
    final public static int GL_LINEAR = 9729;
    final public static int GL_NEAREST_MIPMAP_NEAREST = 9984;
    final public static int GL_LINEAR_MIPMAP_NEAREST = 9985;
    final public static int GL_NEAREST_MIPMAP_LINEAR = 9986;
    final public static int GL_LINEAR_MIPMAP_LINEAR = 9987;
    final public static int GL_TEXTURE_MAG_FILTER = 10240;
    final public static int GL_TEXTURE_MIN_FILTER = 10241;
    final public static int GL_TEXTURE_WRAP_S = 10242;
    final public static int GL_TEXTURE_WRAP_T = 10243;
    final public static int GL_TEXTURE = 5890;
    final public static int GL_TEXTURE_CUBE_MAP = 34067;
    final public static int GL_TEXTURE_BINDING_CUBE_MAP = 34068;
    final public static int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;
    final public static int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;
    final public static int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;
    final public static int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;
    final public static int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;
    final public static int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;
    final public static int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;
    final public static int GL_TEXTURE0 = 33984;
    final public static int GL_TEXTURE1 = 33985;
    final public static int GL_TEXTURE2 = 33986;
    final public static int GL_TEXTURE3 = 33987;
    final public static int GL_TEXTURE4 = 33988;
    final public static int GL_TEXTURE5 = 33989;
    final public static int GL_TEXTURE6 = 33990;
    final public static int GL_TEXTURE7 = 33991;
    final public static int GL_TEXTURE8 = 33992;
    final public static int GL_TEXTURE9 = 33993;
    final public static int GL_TEXTURE10 = 33994;
    final public static int GL_TEXTURE11 = 33995;
    final public static int GL_TEXTURE12 = 33996;
    final public static int GL_TEXTURE13 = 33997;
    final public static int GL_TEXTURE14 = 33998;
    final public static int GL_TEXTURE15 = 33999;
    final public static int GL_TEXTURE16 = 34000;
    final public static int GL_TEXTURE17 = 34001;
    final public static int GL_TEXTURE18 = 34002;
    final public static int GL_TEXTURE19 = 34003;
    final public static int GL_TEXTURE20 = 34004;
    final public static int GL_TEXTURE21 = 34005;
    final public static int GL_TEXTURE22 = 34006;
    final public static int GL_TEXTURE23 = 34007;
    final public static int GL_TEXTURE24 = 34008;
    final public static int GL_TEXTURE25 = 34009;
    final public static int GL_TEXTURE26 = 34010;
    final public static int GL_TEXTURE27 = 34011;
    final public static int GL_TEXTURE28 = 34012;
    final public static int GL_TEXTURE29 = 34013;
    final public static int GL_TEXTURE30 = 34014;
    final public static int GL_TEXTURE31 = 34015;
    final public static int GL_ACTIVE_TEXTURE = 34016;
    final public static int GL_REPEAT = 10497;
    final public static int GL_CLAMP_TO_EDGE = 33071;
    final public static int GL_MIRRORED_REPEAT = 33648;
    final public static int GL_FLOAT_VEC2 = 35664;
    final public static int GL_FLOAT_VEC3 = 35665;
    final public static int GL_FLOAT_VEC4 = 35666;
    final public static int GL_INT_VEC2 = 35667;
    final public static int GL_INT_VEC3 = 35668;
    final public static int GL_INT_VEC4 = 35669;
    final public static int GL_BOOL = 35670;
    final public static int GL_BOOL_VEC2 = 35671;
    final public static int GL_BOOL_VEC3 = 35672;
    final public static int GL_BOOL_VEC4 = 35673;
    final public static int GL_FLOAT_MAT2 = 35674;
    final public static int GL_FLOAT_MAT3 = 35675;
    final public static int GL_FLOAT_MAT4 = 35676;
    final public static int GL_SAMPLER_2D = 35678;
    final public static int GL_SAMPLER_CUBE = 35680;
    final public static int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;
    final public static int GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;
    final public static int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;
    final public static int GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;
    final public static int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;
    final public static int GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;
    final public static int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;
    final public static int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
    final public static int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
    final public static int GL_COMPILE_STATUS = 35713;
    final public static int GL_INFO_LOG_LENGTH = 35716;
    final public static int GL_SHADER_SOURCE_LENGTH = 35720;
    final public static int GL_SHADER_COMPILER = 36346;
    final public static int GL_SHADER_BINARY_FORMATS = 36344;
    final public static int GL_NUM_SHADER_BINARY_FORMATS = 36345;
    final public static int GL_LOW_FLOAT = 36336;
    final public static int GL_MEDIUM_FLOAT = 36337;
    final public static int GL_HIGH_FLOAT = 36338;
    final public static int GL_LOW_INT = 36339;
    final public static int GL_MEDIUM_INT = 36340;
    final public static int GL_HIGH_INT = 36341;
    final public static int GL_FRAMEBUFFER = 36160;
    final public static int GL_RENDERBUFFER = 36161;
    final public static int GL_RGBA4 = 32854;
    final public static int GL_RGB5_A1 = 32855;
    final public static int GL_RGB565 = 36194;
    final public static int GL_DEPTH_COMPONENT16 = 33189;
    final public static int GL_STENCIL_INDEX = 6401;
    final public static int GL_STENCIL_INDEX8 = 36168;
    final public static int GL_RENDERBUFFER_WIDTH = 36162;
    final public static int GL_RENDERBUFFER_HEIGHT = 36163;
    final public static int GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;
    final public static int GL_RENDERBUFFER_RED_SIZE = 36176;
    final public static int GL_RENDERBUFFER_GREEN_SIZE = 36177;
    final public static int GL_RENDERBUFFER_BLUE_SIZE = 36178;
    final public static int GL_RENDERBUFFER_ALPHA_SIZE = 36179;
    final public static int GL_RENDERBUFFER_DEPTH_SIZE = 36180;
    final public static int GL_RENDERBUFFER_STENCIL_SIZE = 36181;
    final public static int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;
    final public static int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;
    final public static int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;
    final public static int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;
    final public static int GL_COLOR_ATTACHMENT0 = 36064;
    final public static int GL_DEPTH_ATTACHMENT = 36096;
    final public static int GL_STENCIL_ATTACHMENT = 36128;
    final public static int GL_NONE = 0;
    final public static int GL_FRAMEBUFFER_COMPLETE = 36053;
    final public static int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
    final public static int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
    final public static int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 36057;
    final public static int GL_FRAMEBUFFER_UNSUPPORTED = 36061;
    final public static int GL_FRAMEBUFFER_BINDING = 36006;
    final public static int GL_RENDERBUFFER_BINDING = 36007;
    final public static int GL_MAX_RENDERBUFFER_SIZE = 34024;
    final public static int GL_INVALID_FRAMEBUFFER_OPERATION = 1286;
    final public static int GL_VERTEX_PROGRAM_POINT_SIZE = 34370;
    final public static int GL_COVERAGE_BUFFER_BIT_NV = 32768;
    final public static int GL_TEXTURE_MAX_ANISOTROPY_EXT = 34046;
    final public static int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 34047;


    @Reflection.Signature
    public static void glActiveTexture(int var1) {
        Gdx.gl.glActiveTexture(var1);
    }

    @Reflection.Signature
    public static void glBindTexture(int target, int texture) {
        Gdx.gl.glBindTexture(target, texture);
    }

    @Reflection.Signature
    public static void glBlendFunc(int sfactor, int dfactor) {
        Gdx.gl.glBlendFunc(sfactor, dfactor);
    }

    @Reflection.Signature
    public static void glClear(int mask) {
        Gdx.gl.glClear(mask);
    }

    @Reflection.Signature
    public static void glClearColor(float red, float green, float blue, float alpha) {
        Gdx.gl.glClearColor(red, green, blue, alpha);
    }

    @Reflection.Signature
    public static void glClearDepthf(float depth) {
        Gdx.gl.glClearDepthf(depth);
    }

    @Reflection.Signature
    public static void glClearStencil(int s) {
        Gdx.gl.glClearStencil(s);
    }

    @Reflection.Signature
    public static void glColorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        Gdx.gl.glColorMask(red, green, blue, alpha);
    }

    /*
    @Reflection.Signature
    public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Buffer buffer) {
        Gdx.gl.glCompressedTexImage2D(target, level, internalformat, width, height, border,imageSize, buffer);
    }

    public void glCompressedTexSubImage2D (int target, int level, int xoffset, int yoffset, int width, int height, int format,
		int imageSize, Buffer data);
    **/

    @Reflection.Signature
    public static void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        Gdx.gl.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
    }

    @Reflection.Signature
    public void glCopyTexSubImage2D(int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        Gdx.gl.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
    }

    @Reflection.Signature
    public void glCullFace(int mode) {
        Gdx.gl.glCullFace(mode);
    }

    /*public void glDeleteTextures (int n, IntBuffer textures);*/

    @Reflection.Signature
    public void glDeleteTexture(int texture) {
        Gdx.gl.glDeleteTexture(texture);
    }

    @Reflection.Signature
    public void glDepthFunc(int func) {
        Gdx.gl.glDepthFunc(func);
    }

    @Reflection.Signature
    public void glDepthMask(boolean flag) {
        Gdx.gl.glDepthMask(flag);
    }

    @Reflection.Signature
    public void glDepthRangef(float zNear, float zFar) {
        Gdx.gl.glDepthRangef(zNear, zFar);
    }

    @Reflection.Signature
    public void glDisable(int cap) {
        Gdx.gl.glDisable(cap);
    }

    @Reflection.Signature
    public void glDrawArrays(int mode, int first, int count) {
        Gdx.gl.glDrawArrays(mode, first, count);
    }

    /*public void glDrawElements (int mode, int count, int type, Buffer indices);*/

    @Reflection.Signature
    public void glEnable(int cap) {
        Gdx.gl.glEnable(cap);
    }

    @Reflection.Signature
    public void glFinish() {
        Gdx.gl.glFinish();
    }

    @Reflection.Signature
    public void glFlush() {
        Gdx.gl.glFlush();
    }

    @Reflection.Signature
    public void glFrontFace(int mode) {
        Gdx.gl.glFrontFace(mode);
    }

    /*public void glGenTextures(int n, IntBuffer textures);*/

    @Reflection.Signature
    public int glGenTexture() {
        return Gdx.gl.glGenTexture();
    }

    @Reflection.Signature
    public int glGetError() {
        return Gdx.gl.glGetError();
    }

    /*public void glGetIntegerv(int pname, IntBuffer params);*/

    public Memory glGetString(int name) {
        return StringMemory.valueOf(Gdx.gl.glGetString(name));
    }

    @Reflection.Signature
    public void glHint(int target, int mode) {
        Gdx.gl.glHint(target, mode);
    }

    @Reflection.Signature
    public void glLineWidth(float width) {
        Gdx.gl.glLineWidth(width);
    }

    @Reflection.Signature
    public void glPixelStorei(int pname, int param) {
        Gdx.gl.glPixelStorei(pname, param);
    }

    @Reflection.Signature
    public void glPolygonOffset(float factor, float units) {
        Gdx.gl.glPolygonOffset(factor, units);
    }

    /*public void glReadPixels (int x, int y, int width, int height, int format, int type, Buffer pixels);*/

    @Reflection.Signature
    public void glScissor(int x, int y, int width, int height) {
        Gdx.gl.glScissor(x, y, width, height);
    }

    @Reflection.Signature
    public void glStencilFunc(int func, int ref, int mask) {
        Gdx.gl.glStencilFunc(func, ref, mask);
    }

    @Reflection.Signature
    public void glStencilMask(int mask) {
        Gdx.gl.glStencilMask(mask);
    }

    @Reflection.Signature
    public void glStencilOp(int fail, int zfail, int zpass) {
        Gdx.gl.glStencilOp(fail, zfail, zpass);
    }

    /*public void glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type,
                             Buffer pixels);*/

    @Reflection.Signature
    public void glTexParameterf(int target, int pname, float param) {
        Gdx.gl.glTexParameterf(target, pname, param);
    }

    /*public void glTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type,
                                Buffer pixels);*/

    @Reflection.Signature
    public void glViewport(int x, int y, int width, int height) {
        Gdx.gl.glViewport(x, y, width, height);
    }

    @Reflection.Signature
    public void glAttachShader(int program, int shader) {
        Gdx.gl.glAttachShader(program, shader);
    }

    @Reflection.Signature
    public void glBindAttribLocation(int program, int index, String name) {
        Gdx.gl.glBindAttribLocation(program, index, name);
    }

    @Reflection.Signature
    public void glBindBuffer(int target, int buffer) {
        Gdx.gl.glBindBuffer(target, buffer);
    }

    @Reflection.Signature
    public void glBindFramebuffer(int target, int framebuffer) {
        Gdx.gl.glBindFramebuffer(target, framebuffer);
    }

    @Reflection.Signature
    public void glBindRenderbuffer(int target, int renderbuffer) {
        Gdx.gl.glBindRenderbuffer(target, renderbuffer);
    }

    @Reflection.Signature
    public void glBlendColor(float red, float green, float blue, float alpha) {
        Gdx.gl.glBlendColor(red, green, blue, alpha);
    }

    @Reflection.Signature
    public void glBlendEquation(int mode) {
        Gdx.gl.glBlendEquation(mode);
    }

    @Reflection.Signature
    public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        Gdx.gl.glBlendEquationSeparate(modeRGB, modeAlpha);
    }

    @Reflection.Signature
    public void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        Gdx.gl.glBlendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha);
    }


    /*public void glBufferData(int target, int size, Buffer data, int usage);*/

    /*public void glBufferSubData(int target, int offset, int size, Buffer data);*/

    @Reflection.Signature
    public int glCheckFramebufferStatus(int target) {
        return Gdx.gl.glCheckFramebufferStatus(target);
    }

    @Reflection.Signature
    public void glCompileShader(int shader) {
        Gdx.gl.glCompileShader(shader);
    }

    @Reflection.Signature
    public int glCreateProgram() {
        return Gdx.gl.glCreateProgram();
    }

    @Reflection.Signature
    public int glCreateShader(int type) {
        return Gdx.gl.glCreateShader(type);
    }

    @Reflection.Signature
    public void glDeleteBuffer(int buffer) {
        Gdx.gl.glDeleteBuffer(buffer);
    }


    /*public void glDeleteBuffers(int n, IntBuffer buffers);*/

    @Reflection.Signature
    public void glDeleteFramebuffer(int framebuffer) {
        Gdx.gl.glDeleteFramebuffer(framebuffer);
    }

    /*public void glDeleteFramebuffers(int n, IntBuffer framebuffers);*/

    @Reflection.Signature
    public void glDeleteProgram(int program) {
        Gdx.gl.glDeleteProgram(program);
    }

    @Reflection.Signature
    public void glDeleteRenderbuffer(int renderbuffer) {
        Gdx.gl.glDeleteRenderbuffer(renderbuffer);
    }

    /*public void glDeleteRenderbuffers(int n, IntBuffer renderbuffers);*/

    @Reflection.Signature
    public void glDeleteShader(int shader) {
        Gdx.gl.glDeleteShader(shader);
    }

    @Reflection.Signature
    public void glDetachShader(int program, int shader) {
        Gdx.gl.glDetachShader(program, shader);
    }

    @Reflection.Signature
    public void glDisableVertexAttribArray(int index) {
        Gdx.gl.glDisableVertexAttribArray(index);
    }

    @Reflection.Signature
    public void glDrawElements(int mode, int count, int type, int indices) {
        Gdx.gl.glDrawElements(mode, count, type, indices);
    }

    @Reflection.Signature
    public void glEnableVertexAttribArray(int index) {
        Gdx.gl.glEnableVertexAttribArray(index);
    }

    @Reflection.Signature
    public void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        Gdx.gl.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    @Reflection.Signature
    public void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        Gdx.gl.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    @Reflection.Signature
    public int glGenBuffer() {
        return Gdx.gl.glGenBuffer();
    }

    /*public void glGenBuffers(int n, IntBuffer buffers);*/

    @Reflection.Signature
    public void glGenerateMipmap(int target) {
        Gdx.gl.glGenerateMipmap(target);
    }

    @Reflection.Signature
    public int glGenFramebuffer() {
        return Gdx.gl.glGenFramebuffer();
    }


    /*public void glGenFramebuffers(int n, IntBuffer framebuffers);*/

    @Reflection.Signature
    public int glGenRenderbuffer() {
        return Gdx.gl.glGenRenderbuffer();
    }

    /*public void glGenRenderbuffers(int n, IntBuffer renderbuffers);*/

    // deviates
    /*public String glGetActiveAttrib(int program, int index, IntBuffer size, IntBuffer type);*/

    // deviates
    /*public String glGetActiveUniform(int program, int index, IntBuffer size, IntBuffer type);*/

    /*public void glGetAttachedShaders(int program, int maxcount, Buffer count, IntBuffer shaders);*/

    @Reflection.Signature
    public int glGetAttribLocation(int program, String name) {
        return Gdx.gl.glGetAttribLocation(program, name);
    }

    /*public void glGetBooleanv(int pname, Buffer params);*/

    /*public void glGetBufferParameteriv(int target, int pname, IntBuffer params);*/

    /*public void glGetFloatv(int pname, FloatBuffer params);*/

    /*public void glGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, IntBuffer params);*/

    /*public void glGetProgramiv(int program, int pname, IntBuffer params);*/

    // deviates
    @Reflection.Signature
    public String glGetProgramInfoLog(int program) {
        return Gdx.gl.glGetProgramInfoLog(program);
    }

    /*public void glGetRenderbufferParameteriv(int target, int pname, IntBuffer params);*/

    /*public void glGetShaderiv(int shader, int pname, IntBuffer params);*/

    // deviates
    @Reflection.Signature
    public String glGetShaderInfoLog(int shader) {
        return Gdx.gl.glGetShaderInfoLog(shader);
    }

    /*public void glGetShaderPrecisionFormat(int shadertype, int precisiontype, IntBuffer range, IntBuffer precision);*/

    /*public void glGetTexParameterfv(int target, int pname, FloatBuffer params);*/

    /*public void glGetTexParameteriv(int target, int pname, IntBuffer params);*/

    /*public void glGetUniformfv(int program, int location, FloatBuffer params);*/

    /*public void glGetUniformiv(int program, int location, IntBuffer params);*/

    @Reflection.Signature
    public int glGetUniformLocation(int program, String name) {
        return Gdx.gl.glGetUniformLocation(program, name);
    }

    /*public void glGetVertexAttribfv(int index, int pname, FloatBuffer params);*/

    /*public void glGetVertexAttribiv(int index, int pname, IntBuffer params);*/

    /*public void glGetVertexAttribPointerv(int index, int pname, Buffer pointer);*/

    @Reflection.Signature
    public boolean glIsBuffer(int buffer) {
        return Gdx.gl.glIsBuffer(buffer);
    }

    @Reflection.Signature
    public boolean glIsEnabled(int cap) {
        return Gdx.gl.glIsEnabled(cap);
    }

    @Reflection.Signature
    public boolean glIsFramebuffer(int framebuffer) {
        return Gdx.gl.glIsFramebuffer(framebuffer);
    }

    @Reflection.Signature
    public boolean glIsProgram(int program) {
        return Gdx.gl.glIsProgram(program);
    }

    @Reflection.Signature
    public boolean glIsRenderbuffer(int renderbuffer) {
        return Gdx.gl.glIsRenderbuffer(renderbuffer);
    }

    @Reflection.Signature
    public boolean glIsShader(int shader) {
        return Gdx.gl.glIsShader(shader);
    }

    public boolean glIsTexture(int texture) {
        return Gdx.gl.glIsTexture(texture);
    }

    @Reflection.Signature
    public void glLinkProgram(int program) {
        Gdx.gl.glLinkProgram(program);
    }

    @Reflection.Signature
    public void glReleaseShaderCompiler() {
        Gdx.gl.glReleaseShaderCompiler();
    }

    @Reflection.Signature
    public void glRenderbufferStorage(int target, int internalformat, int width, int height) {
        Gdx.gl.glRenderbufferStorage(target, internalformat, width, height);
    }

    @Reflection.Signature
    public void glSampleCoverage(float value, boolean invert) {
        Gdx.gl.glSampleCoverage(value, invert);
    }

    /*public void glShaderBinary(int n, IntBuffer shaders, int binaryformat, Buffer binary, int length);*/

    // Deviates
    @Reflection.Signature
    public void glShaderSource(int shader, String string) {
        Gdx.gl.glShaderSource(shader, string);
    }

    @Reflection.Signature
    public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        Gdx.gl.glStencilFuncSeparate(face, func, ref, mask);
    }

    @Reflection.Signature
    public void glStencilMaskSeparate(int face, int mask) {
        Gdx.gl.glStencilMaskSeparate(face, mask);
    }

    @Reflection.Signature
    public void glStencilOpSeparate(int face, int fail, int zfail, int zpass) {
        Gdx.gl.glStencilOpSeparate(face, fail, zfail, zpass);
    }

    /*public void glTexParameterfv(int target, int pname, FloatBuffer params);*/

    @Reflection.Signature
    public void glTexParameteri(int target, int pname, int param) {
        Gdx.gl.glTexParameteri(target, pname, param);
    }

    /*public void glTexParameteriv(int target, int pname, IntBuffer params);*/

    @Reflection.Signature
    public void glUniform1f(int location, float x) {
        Gdx.gl.glUniform1f(location, x);
    }

    /*public void glUniform1fv(int location, int count, FloatBuffer v);*/

    //Array
    @Reflection.Signature
    public void glUniform1fv(int location, int count, float[] v, int offset) {
        Gdx.gl.glUniform1fv(location, count, v, offset);
    }


    @Reflection.Signature
    public void glUniform1i(int location, int x) {
        Gdx.gl.glUniform1i(location, x);
    }

    /*public void glUniform1iv(int location, int count, IntBuffer v);*/

    @Reflection.Signature
    public void glUniform1iv(int location, int count, int[] v, int offset) {
        Gdx.gl.glUniform1iv(location, count, v, offset);
    }

    public void glUniform2f(int location, float x, float y) {
        Gdx.gl.glUniform2f(location, x, y);
    }

    /*public void glUniform2fv(int location, int count, FloatBuffer v);*/

    @Reflection.Signature
    public void glUniform2fv(int location, int count, float[] v, int offset) {
        Gdx.gl.glUniform2fv(location, count, v, offset);
    }

    @Reflection.Signature
    public void glUniform2i(int location, int x, int y) {
        Gdx.gl.glUniform2i(location, x, y);
    }

    /*public void glUniform2iv(int location, int count, IntBuffer v);*/

    @Reflection.Signature
    public void glUniform2iv(int location, int count, int[] v, int offset) {
        Gdx.gl.glUniform2iv(location, count, v, offset);
    }

    @Reflection.Signature
    public void glUniform3f(int location, float x, float y, float z) {
        Gdx.gl.glUniform3f(location, x, y, z);
    }

    /*public void glUniform3fv(int location, int count, FloatBuffer v);*/

    @Reflection.Signature
    public void glUniform3fv(int location, int count, float[] v, int offset) {
        Gdx.gl.glUniform3fv(location, count, v, offset);
    }

    @Reflection.Signature
    public void glUniform3i(int location, int x, int y, int z) {
        Gdx.gl.glUniform3i(location, x, y, z);
    }

    /*public void glUniform3iv(int location, int count, IntBuffer v);*/

    @Reflection.Signature
    public void glUniform3iv(int location, int count, int[] v, int offset) {
        Gdx.gl.glUniform3iv(location, count, v, offset);
    }

    @Reflection.Signature
    public void glUniform4f(int location, float x, float y, float z, float w) {
        Gdx.gl.glUniform4f(location, x, y, z, w);
    }

    /*public void glUniform4fv(int location, int count, FloatBuffer v);*/

    @Reflection.Signature
    public void glUniform4fv(int location, int count, float[] v, int offset) {
        Gdx.gl.glUniform4fv(location, count, v, offset);
    }

    @Reflection.Signature
    public void glUniform4i(int location, int x, int y, int z, int w) {
        Gdx.gl.glUniform4i(location, x, y, z, w);
    }

    /*public void glUniform4iv(int location, int count, IntBuffer v);*/

    @Reflection.Signature
    public void glUniform4iv(int location, int count, int v[], int offset) {
        Gdx.gl.glUniform4iv(location, count, v, offset);
    }

    /*public void glUniformMatrix2fv(int location, int count, boolean transpose, FloatBuffer value);*/

    @Reflection.Signature
    public void glUniformMatrix2fv(int location, int count, boolean transpose, float value[], int offset) {
        Gdx.gl.glUniformMatrix2fv(location, count, transpose, value, offset);
    }

    /*public void glUniformMatrix3fv(int location, int count, boolean transpose, FloatBuffer value);*/

    @Reflection.Signature
    public void glUniformMatrix3fv(int location, int count, boolean transpose, float[] value, int offset) {
        Gdx.gl.glUniformMatrix3fv(location, count, transpose, value, offset);
    }

    /*public void glUniformMatrix4fv(int location, int count, boolean transpose, FloatBuffer value);*/

    @Reflection.Signature
    public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value, int offset) {
        Gdx.gl.glUniformMatrix4fv(location, count, transpose, value, offset);
    }

    @Reflection.Signature
    public void glUseProgram(int program) {
        Gdx.gl.glUseProgram(program);
    }

    @Reflection.Signature
    public void glValidateProgram(int program) {
        Gdx.gl.glValidateProgram(program);
    }

    @Reflection.Signature
    public void glVertexAttrib1f(int indx, float x) {
        Gdx.gl.glVertexAttrib1f(indx, x);
    }

    /*public void glVertexAttrib1fv(int indx, FloatBuffer values);*/

    @Reflection.Signature
    public void glVertexAttrib2f(int indx, float x, float y) {
        Gdx.gl.glVertexAttrib2f(indx, x, y);
    }

    /*public void glVertexAttrib2fv(int indx, FloatBuffer values);*/

    @Reflection.Signature
    public void glVertexAttrib3f(int indx, float x, float y, float z) {
        Gdx.gl.glVertexAttrib3f(indx, x, y, z);
    }

    /*public void glVertexAttrib3fv(int indx, FloatBuffer values);*/

    @Reflection.Signature
    public void glVertexAttrib4f(int indx, float x, float y, float z, float w) {
        Gdx.gl.glVertexAttrib4f(indx, x, y, z, w);
    }

    /*public void glVertexAttrib4fv(int indx, FloatBuffer values);*/

    /**
     * In OpenGl core profiles (3.1+), passing a pointer to client memory is not valid.
     * In 3.0 and later, use the other version of this function instead, pass a zero-based
     * offset which references the buffer currently bound to GL_ARRAY_BUFFER.
     */
    /*public void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, Buffer ptr);*/
    @Reflection.Signature
    public void glVertexAttribPointer(int indx, int size, int type, boolean normalized, int stride, int ptr) {
        Gdx.gl.glVertexAttribPointer(indx, size, type, normalized, stride, ptr);
    }

}

