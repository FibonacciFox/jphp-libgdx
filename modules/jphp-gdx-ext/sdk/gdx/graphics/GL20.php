<?php

namespace gdx\graphics;

class GL20
{

    const GL_ES_VERSION_2_0 = 1;
    const GL_DEPTH_BUFFER_BIT = 256;
    const GL_STENCIL_BUFFER_BIT = 1024;
    const GL_COLOR_BUFFER_BIT = 16384;
    const GL_FALSE = 0;
    const GL_TRUE = 1;
    const GL_POINTS = 0;
    const GL_LINES = 1;
    const GL_LINE_LOOP = 2;
    const GL_LINE_STRIP = 3;
    const GL_TRIANGLES = 4;
    const GL_TRIANGLE_STRIP = 5;
    const GL_TRIANGLE_FAN = 6;
    const GL_ZERO = 0;
    const GL_ONE = 1;
    const GL_SRC_COLOR = 768;
    const GL_ONE_MINUS_SRC_COLOR = 769;
    const GL_SRC_ALPHA = 770;
    const GL_ONE_MINUS_SRC_ALPHA = 771;
    const GL_DST_ALPHA = 772;
    const GL_ONE_MINUS_DST_ALPHA = 773;
    const GL_DST_COLOR = 774;
    const GL_ONE_MINUS_DST_COLOR = 775;
    const GL_SRC_ALPHA_SATURATE = 776;
    const GL_FUNC_ADD = 32774;
    const GL_BLEND_EQUATION = 32777;
    const GL_BLEND_EQUATION_RGB = 32777;
    const GL_BLEND_EQUATION_ALPHA = 34877;
    const GL_FUNC_SUBTRACT = 32778;
    const GL_FUNC_REVERSE_SUBTRACT = 32779;
    const GL_BLEND_DST_RGB = 32968;
    const GL_BLEND_SRC_RGB = 32969;
    const GL_BLEND_DST_ALPHA = 32970;
    const GL_BLEND_SRC_ALPHA = 32971;
    const GL_CONSTANT_COLOR = 32769;
    const GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    const GL_CONSTANT_ALPHA = 32771;
    const GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    const GL_BLEND_COLOR = 32773;
    const GL_ARRAY_BUFFER = 34962;
    const GL_ELEMENT_ARRAY_BUFFER = 34963;
    const GL_ARRAY_BUFFER_BINDING = 34964;
    const GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
    const GL_STREAM_DRAW = 35040;
    const GL_STATIC_DRAW = 35044;
    const GL_DYNAMIC_DRAW = 35048;
    const GL_BUFFER_SIZE = 34660;
    const GL_BUFFER_USAGE = 34661;
    const GL_CURRENT_VERTEX_ATTRIB = 34342;
    const GL_FRONT = 1028;
    const GL_BACK = 1029;
    const GL_FRONT_AND_BACK = 1032;
    const GL_TEXTURE_2D = 3553;
    const GL_CULL_FACE = 2884;
    const GL_BLEND = 3042;
    const GL_DITHER = 3024;
    const GL_STENCIL_TEST = 2960;
    const GL_DEPTH_TEST = 2929;
    const GL_SCISSOR_TEST = 3089;
    const GL_POLYGON_OFFSET_FILL = 32823;
    const GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;
    const GL_SAMPLE_COVERAGE = 32928;
    const GL_NO_ERROR = 0;
    const GL_INVALID_ENUM = 1280;
    const GL_INVALID_VALUE = 1281;
    const GL_INVALID_OPERATION = 1282;
    const GL_OUT_OF_MEMORY = 1285;
    const GL_CW = 2304;
    const GL_CCW = 2305;
    const GL_LINE_WIDTH = 2849;
    const GL_ALIASED_POINT_SIZE_RANGE = 33901;
    const GL_ALIASED_LINE_WIDTH_RANGE = 33902;
    const GL_CULL_FACE_MODE = 2885;
    const GL_FRONT_FACE = 2886;
    const GL_DEPTH_RANGE = 2928;
    const GL_DEPTH_WRITEMASK = 2930;
    const GL_DEPTH_CLEAR_VALUE = 2931;
    const GL_DEPTH_FUNC = 2932;
    const GL_STENCIL_CLEAR_VALUE = 2961;
    const GL_STENCIL_FUNC = 2962;
    const GL_STENCIL_FAIL = 2964;
    const GL_STENCIL_PASS_DEPTH_FAIL = 2965;
    const GL_STENCIL_PASS_DEPTH_PASS = 2966;
    const GL_STENCIL_REF = 2967;
    const GL_STENCIL_VALUE_MASK = 2963;
    const GL_STENCIL_WRITEMASK = 2968;
    const GL_STENCIL_BACK_FUNC = 34816;
    const GL_STENCIL_BACK_FAIL = 34817;
    const GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;
    const GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;
    const GL_STENCIL_BACK_REF = 36003;
    const GL_STENCIL_BACK_VALUE_MASK = 36004;
    const GL_STENCIL_BACK_WRITEMASK = 36005;
    const GL_VIEWPORT = 2978;
    const GL_SCISSOR_BOX = 3088;
    const GL_COLOR_CLEAR_VALUE = 3106;
    const GL_COLOR_WRITEMASK = 3107;
    const GL_UNPACK_ALIGNMENT = 3317;
    const GL_PACK_ALIGNMENT = 3333;
    const GL_MAX_TEXTURE_SIZE = 3379;
    const GL_MAX_TEXTURE_UNITS = 34018;
    const GL_MAX_VIEWPORT_DIMS = 3386;
    const GL_SUBPIXEL_BITS = 3408;
    const GL_RED_BITS = 3410;
    const GL_GREEN_BITS = 3411;
    const GL_BLUE_BITS = 3412;
    const GL_ALPHA_BITS = 3413;
    const GL_DEPTH_BITS = 3414;
    const GL_STENCIL_BITS = 3415;
    const GL_POLYGON_OFFSET_UNITS = 10752;
    const GL_POLYGON_OFFSET_FACTOR = 32824;
    const GL_TEXTURE_BINDING_2D = 32873;
    const GL_SAMPLE_BUFFERS = 32936;
    const GL_SAMPLES = 32937;
    const GL_SAMPLE_COVERAGE_VALUE = 32938;
    const GL_SAMPLE_COVERAGE_INVERT = 32939;
    const GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;
    const GL_COMPRESSED_TEXTURE_FORMATS = 34467;
    const GL_DONT_CARE = 4352;
    const GL_FASTEST = 4353;
    const GL_NICEST = 4354;
    const GL_GENERATE_MIPMAP = 33169;
    const GL_GENERATE_MIPMAP_HINT = 33170;
    const GL_BYTE = 5120;
    const GL_UNSIGNED_BYTE = 5121;
    const GL_SHORT = 5122;
    const GL_UNSIGNED_SHORT = 5123;
    const GL_INT = 5124;
    const GL_UNSIGNED_INT = 5125;
    const GL_FLOAT = 5126;
    const GL_FIXED = 5132;
    const GL_DEPTH_COMPONENT = 6402;
    const GL_ALPHA = 6406;
    const GL_RGB = 6407;
    const GL_RGBA = 6408;
    const GL_LUMINANCE = 6409;
    const GL_LUMINANCE_ALPHA = 6410;
    const GL_UNSIGNED_SHORT_4_4_4_4 = 32819;
    const GL_UNSIGNED_SHORT_5_5_5_1 = 32820;
    const GL_UNSIGNED_SHORT_5_6_5 = 33635;
    const GL_FRAGMENT_SHADER = 35632;
    const GL_VERTEX_SHADER = 35633;
    const GL_MAX_VERTEX_ATTRIBS = 34921;
    const GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
    const GL_MAX_VARYING_VECTORS = 36348;
    const GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;
    const GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;
    const GL_MAX_TEXTURE_IMAGE_UNITS = 34930;
    const GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
    const GL_SHADER_TYPE = 35663;
    const GL_DELETE_STATUS = 35712;
    const GL_LINK_STATUS = 35714;
    const GL_VALIDATE_STATUS = 35715;
    const GL_ATTACHED_SHADERS = 35717;
    const GL_ACTIVE_UNIFORMS = 35718;
    const GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;
    const GL_ACTIVE_ATTRIBUTES = 35721;
    const GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;
    const GL_SHADING_LANGUAGE_VERSION = 35724;
    const GL_CURRENT_PROGRAM = 35725;
    const GL_NEVER = 512;
    const GL_LESS = 513;
    const GL_EQUAL = 514;
    const GL_LEQUAL = 515;
    const GL_GREATER = 516;
    const GL_NOTEQUAL = 517;
    const GL_GEQUAL = 518;
    const GL_ALWAYS = 519;
    const GL_KEEP = 7680;
    const GL_REPLACE = 7681;
    const GL_INCR = 7682;
    const GL_DECR = 7683;
    const GL_INVERT = 5386;
    const GL_INCR_WRAP = 34055;
    const GL_DECR_WRAP = 34056;
    const GL_VENDOR = 7936;
    const GL_RENDERER = 7937;
    const GL_VERSION = 7938;
    const GL_EXTENSIONS = 7939;
    const GL_NEAREST = 9728;
    const GL_LINEAR = 9729;
    const GL_NEAREST_MIPMAP_NEAREST = 9984;
    const GL_LINEAR_MIPMAP_NEAREST = 9985;
    const GL_NEAREST_MIPMAP_LINEAR = 9986;
    const GL_LINEAR_MIPMAP_LINEAR = 9987;
    const GL_TEXTURE_MAG_FILTER = 10240;
    const GL_TEXTURE_MIN_FILTER = 10241;
    const GL_TEXTURE_WRAP_S = 10242;
    const GL_TEXTURE_WRAP_T = 10243;
    const GL_TEXTURE = 5890;
    const GL_TEXTURE_CUBE_MAP = 34067;
    const GL_TEXTURE_BINDING_CUBE_MAP = 34068;
    const GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;
    const GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;
    const GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;
    const GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;
    const GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;
    const GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;
    const GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;
    const GL_TEXTURE0 = 33984;
    const GL_TEXTURE1 = 33985;
    const GL_TEXTURE2 = 33986;
    const GL_TEXTURE3 = 33987;
    const GL_TEXTURE4 = 33988;
    const GL_TEXTURE5 = 33989;
    const GL_TEXTURE6 = 33990;
    const GL_TEXTURE7 = 33991;
    const GL_TEXTURE8 = 33992;
    const GL_TEXTURE9 = 33993;
    const GL_TEXTURE10 = 33994;
    const GL_TEXTURE11 = 33995;
    const GL_TEXTURE12 = 33996;
    const GL_TEXTURE13 = 33997;
    const GL_TEXTURE14 = 33998;
    const GL_TEXTURE15 = 33999;
    const GL_TEXTURE16 = 34000;
    const GL_TEXTURE17 = 34001;
    const GL_TEXTURE18 = 34002;
    const GL_TEXTURE19 = 34003;
    const GL_TEXTURE20 = 34004;
    const GL_TEXTURE21 = 34005;
    const GL_TEXTURE22 = 34006;
    const GL_TEXTURE23 = 34007;
    const GL_TEXTURE24 = 34008;
    const GL_TEXTURE25 = 34009;
    const GL_TEXTURE26 = 34010;
    const GL_TEXTURE27 = 34011;
    const GL_TEXTURE28 = 34012;
    const GL_TEXTURE29 = 34013;
    const GL_TEXTURE30 = 34014;
    const GL_TEXTURE31 = 34015;
    const GL_ACTIVE_TEXTURE = 34016;
    const GL_REPEAT = 10497;
    const GL_CLAMP_TO_EDGE = 33071;
    const GL_MIRRORED_REPEAT = 33648;
    const GL_FLOAT_VEC2 = 35664;
    const GL_FLOAT_VEC3 = 35665;
    const GL_FLOAT_VEC4 = 35666;
    const GL_INT_VEC2 = 35667;
    const GL_INT_VEC3 = 35668;
    const GL_INT_VEC4 = 35669;
    const GL_BOOL = 35670;
    const GL_BOOL_VEC2 = 35671;
    const GL_BOOL_VEC3 = 35672;
    const GL_BOOL_VEC4 = 35673;
    const GL_FLOAT_MAT2 = 35674;
    const GL_FLOAT_MAT3 = 35675;
    const GL_FLOAT_MAT4 = 35676;
    const GL_SAMPLER_2D = 35678;
    const GL_SAMPLER_CUBE = 35680;
    const GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;
    const GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;
    const GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;
    const GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;
    const GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;
    const GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;
    const GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;
    const GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
    const GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
    const GL_COMPILE_STATUS = 35713;
    const GL_INFO_LOG_LENGTH = 35716;
    const GL_SHADER_SOURCE_LENGTH = 35720;
    const GL_SHADER_COMPILER = 36346;
    const GL_SHADER_BINARY_FORMATS = 36344;
    const GL_NUM_SHADER_BINARY_FORMATS = 36345;
    const GL_LOW_FLOAT = 36336;
    const GL_MEDIUM_FLOAT = 36337;
    const GL_HIGH_FLOAT = 36338;
    const GL_LOW_INT = 36339;
    const GL_MEDIUM_INT = 36340;
    const GL_HIGH_INT = 36341;
    const GL_FRAMEBUFFER = 36160;
    const GL_RENDERBUFFER = 36161;
    const GL_RGBA4 = 32854;
    const GL_RGB5_A1 = 32855;
    const GL_RGB565 = 36194;
    const GL_DEPTH_COMPONENT16 = 33189;
    const GL_STENCIL_INDEX = 6401;
    const GL_STENCIL_INDEX8 = 36168;
    const GL_RENDERBUFFER_WIDTH = 36162;
    const GL_RENDERBUFFER_HEIGHT = 36163;
    const GL_RENDERBUFFER_INTERNAL_FORMAT = 36164;
    const GL_RENDERBUFFER_RED_SIZE = 36176;
    const GL_RENDERBUFFER_GREEN_SIZE = 36177;
    const GL_RENDERBUFFER_BLUE_SIZE = 36178;
    const GL_RENDERBUFFER_ALPHA_SIZE = 36179;
    const GL_RENDERBUFFER_DEPTH_SIZE = 36180;
    const GL_RENDERBUFFER_STENCIL_SIZE = 36181;
    const GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 36048;
    const GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 36049;
    const GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 36050;
    const GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 36051;
    const GL_COLOR_ATTACHMENT0 = 36064;
    const GL_DEPTH_ATTACHMENT = 36096;
    const GL_STENCIL_ATTACHMENT = 36128;
    const GL_NONE = 0;
    const GL_FRAMEBUFFER_COMPLETE = 36053;
    const GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 36054;
    const GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 36055;
    const GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 36057;
    const GL_FRAMEBUFFER_UNSUPPORTED = 36061;
    const GL_FRAMEBUFFER_BINDING = 36006;
    const GL_RENDERBUFFER_BINDING = 36007;
    const GL_MAX_RENDERBUFFER_SIZE = 34024;
    const GL_INVALID_FRAMEBUFFER_OPERATION = 1286;
    const GL_VERTEX_PROGRAM_POINT_SIZE = 34370;
    const GL_COVERAGE_BUFFER_BIT_NV = 32768;
    const GL_TEXTURE_MAX_ANISOTROPY_EXT = 34046;
    const GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT = 34047;

    public static function glActiveTexture(int $var1)
    {

    }


    public static function glBindTexture(int $target, int $texture)
    {

    }


    public static function glBlendFunc(int $sfactor, int $dfactor)
    {

    }


    public static function glClear(int $mask)
    {

    }


    public static function glClearColor(float $red, float $green, float $blue, float $alpha)
    {

    }


    public static function glClearDepthf(float $depth)
    {

    }


    public static function glClearStencil(int $s)
    {

    }


    public static function glColorMask(bool $red, bool $green, bool $blue, bool $alpha)
    {

    }

    /*

    public static function glCompressedTexImage2D(int $target, int $level, int $internalformat, int $width, int $height, int $border, int $imageSize, Buffer buffer) {
        Gdx.gl.glCompressedTexImage2D(target, level, internalformat, width, height, border,imageSize, buffer);
    }

    public static function glCompressedTexSubImage2D (int $target, int $level, int $xoffset, int $yoffset, int $width, int $height, int $format,
		int $imageSize, Buffer data);
    **/


    public static function glCopyTexImage2D(int $target, int $level, int $internalformat, int $x, int $y, int $width, int $height, int $border)
    {

    }


    public static function glCopyTexSubImage2D(int $target, int $level, int $xoffset, int $yoffset, int $x, int $y, int $width, int $height)
    {

    }


    public static function glCullFace(int $mode)
    {

    }

    /*public static function glDeleteTextures (int $n, IntBuffer textures);*/


    public static function glDeleteTexture(int $texture)
    {

    }


    public static function glDepthFunc(int $func)
    {

    }


    public static function glDepthMask(bool $flag)
    {

    }


    public static function glDepthRangef(float $zNear, float $zFar)
    {

    }


    public static function glDisable(int $cap)
    {

    }


    public static function glDrawArrays(int $mode, int $first, int $count)
    {

    }

    /*public static function glDrawElements (int $mode, int $count, int $type, Buffer indices);*/


    public static function glEnable(int $cap)
    {

    }


    public static function glFinish()
    {

    }


    public static function glFlush()
    {

    }


    public static function glFrontFace(int $mode)
    {

    }

    /*public static function glGenTextures(int $n, IntBuffer textures);*/


    public static function glGenTexture()
    {

    }


    public static function glGetError()
    {

    }

    /*public static function glGetIntegerv(int $pname, IntBuffer params);*/

    public static function glGetString(int $name)
    {

    }


    public static function glHint(int $target, int $mode)
    {

    }


    public static function glLineWidth(float $width)
    {

    }


    public static function glPixelStorei(int $pname, int $param)
    {

    }


    public static function glPolygonOffset(float $factor, float $units)
    {

    }

    /*public static function glReadPixels (int $x, int $y, int $width, int $height, int $format, int $type, Buffer pixels);*/


    public static function glScissor(int $x, int $y, int $width, int $height)
    {

    }


    public static function glStencilFunc(int $func, int $ref, int $mask)
    {

    }


    public static function glStencilMask(int $mask)
    {

    }


    public static function glStencilOp(int $fail, int $zfail, int $zpass)
    {

    }

    /*public static function glTexImage2D(int $target, int $level, int $internalformat, int $width, int $height, int $border, int $format, int $type,
                             Buffer pixels);*/


    public static function glTexParameterf(int $target, int $pname, float $param)
    {

    }

    /*public static function glTexSubImage2D(int $target, int $level, int $xoffset, int $yoffset, int $width, int $height, int $format, int $type,
                                Buffer pixels);*/


    public static function glViewport(int $x, int $y, int $width, int $height)
    {

    }


    public static function glAttachShader(int $program, int $shader)
    {

    }


    public static function glBindAttribLocation(int $program, int $index, string $name)
    {

    }


    public static function glBindBuffer(int $target, int $buffer)
    {

    }


    public static function glBindFramebuffer(int $target, int $framebuffer)
    {

    }


    public static function glBindRenderbuffer(int $target, int $renderbuffer)
    {

    }


    public static function glBlendColor(float $red, float $green, float $blue, float $alpha)
    {

    }


    public static function glBlendEquation(int $mode)
    {

    }


    public static function glBlendEquationSeparate(int $modeRGB, int $modeAlpha)
    {

    }


    public static function glBlendFuncSeparate(int $srcRGB, int $dstRGB, int $srcAlpha, int $dstAlpha)
    {

    }


    /*public static function glBufferData(int $target, int $size, Buffer data, int $usage);*/

    /*public static function glBufferSubData(int $target, int $offset, int $size, Buffer data);*/


    public static function glCheckFramebufferStatus(int $target)
    {

    }


    public static function glCompileShader(int $shader)
    {

    }


    public static function glCreateProgram()
    {

    }


    public static function glCreateShader(int $type)
    {

    }


    public static function glDeleteBuffer(int $buffer)
    {

    }


    /*public static function glDeleteBuffers(int $n, IntBuffer buffers);*/


    public static function glDeleteFramebuffer(int $framebuffer)
    {

    }

    /*public static function glDeleteFramebuffers(int $n, IntBuffer framebuffers);*/


    public static function glDeleteProgram(int $program)
    {

    }


    public static function glDeleteRenderbuffer(int $renderbuffer)
    {

    }

    /*public static function glDeleteRenderbuffers(int $n, IntBuffer renderbuffers);*/


    public static function glDeleteShader(int $shader)
    {

    }


    public static function glDetachShader(int $program, int $shader)
    {

    }


    public static function glDisableVertexAttribArray(int $index)
    {

    }


    public static function glDrawElements(int $mode, int $count, int $type, int $indices)
    {

    }


    public static function glEnableVertexAttribArray(int $index)
    {

    }


    public static function glFramebufferRenderbuffer(int $target, int $attachment, int $renderbuffertarget, int $renderbuffer)
    {

    }


    public static function glFramebufferTexture2D(int $target, int $attachment, int $textarget, int $texture, int $level)
    {

    }


    public static function glGenBuffer()
    {

    }

    /*public static function glGenBuffers(int $n, IntBuffer buffers);*/


    public static function glGenerateMipmap(int $target)
    {

    }


    public static function glGenFramebuffer()
    {

    }


    /*public static function glGenFramebuffers(int $n, IntBuffer framebuffers);*/


    public static function glGenRenderbuffer()
    {

    }

    /*public static function glGenRenderbuffers(int $n, IntBuffer renderbuffers);*/

// deviates
    /*public string $glGetActiveAttrib(int $program, int $index, IntBuffer size, IntBuffer type);*/

// deviates
    /*public string $glGetActiveUniform(int $program, int $index, IntBuffer size, IntBuffer type);*/

    /*public static function glGetAttachedShaders(int $program, int $maxcount, Buffer count, IntBuffer shaders);*/


    public static function glGetAttribLocation(int $program, string $name)
    {

    }

    /*public static function glGetBooleanv(int $pname, Buffer params);*/

    /*public static function glGetBufferParameteriv(int $target, int $pname, IntBuffer params);*/

    /*public static function glGetFloatv(int $pname, FloatBuffer params);*/

    /*public static function glGetFramebufferAttachmentParameteriv(int $target, int $attachment, int $pname, IntBuffer params);*/

    /*public static function glGetProgramiv(int $program, int $pname, IntBuffer params);*/

// deviates

    public static function glGetProgramInfoLog(int $program)
    {

    }

    /*public static function glGetRenderbufferParameteriv(int $target, int $pname, IntBuffer params);*/

    /*public static function glGetShaderiv(int $shader, int $pname, IntBuffer params);*/

// deviates

    public static function glGetShaderInfoLog(int $shader)
    {

    }

    /*public static function glGetShaderPrecisionFormat(int $shadertype, int $precisiontype, IntBuffer range, IntBuffer precision);*/

    /*public static function glGetTexParameterfv(int $target, int $pname, FloatBuffer params);*/

    /*public static function glGetTexParameteriv(int $target, int $pname, IntBuffer params);*/

    /*public static function glGetUniformfv(int $program, int $location, FloatBuffer params);*/

    /*public static function glGetUniformiv(int $program, int $location, IntBuffer params);*/


    public static function glGetUniformLocation(int $program, string $name)
    {

    }

    /*public static function glGetVertexAttribfv(int $index, int $pname, FloatBuffer params);*/

    /*public static function glGetVertexAttribiv(int $index, int $pname, IntBuffer params);*/

    /*public static function glGetVertexAttribPointerv(int $index, int $pname, Buffer pointer);*/


    public static function glIsBuffer(int $buffer)
    {

    }


    public static function glIsEnabled(int $cap)
    {

    }


    public static function glIsFramebuffer(int $framebuffer)
    {

    }


    public static function glIsProgram(int $program)
    {

    }


    public static function glIsRenderbuffer(int $renderbuffer)
    {

    }


    public static function glIsShader(int $shader)
    {

    }

    public static function glIsTexture(int $texture)
    {

    }


    public static function glLinkProgram(int $program)
    {

    }


    public static function glReleaseShaderCompiler()
    {

    }


    public static function glRenderbufferStorage(int $target, int $internalformat, int $width, int $height)
    {

    }


    public static function glSampleCoverage(float $value, bool $invert)
    {

    }

    /*public static function glShaderBinary(int $n, IntBuffer shaders, int $binaryformat, Buffer binary, int $length);*/

    // Deviates

    public static function glShaderSource(int $shader, string $string)
    {

    }


    public static function glStencilFuncSeparate(int $face, int $func, int $ref, int $mask)
    {

    }


    public static function glStencilMaskSeparate(int $face, int $mask)
    {

    }


    public static function glStencilOpSeparate(int $face, int $fail, int $zfail, int $zpass)
    {

    }

    /*public static function glTexParameterfv(int $target, int $pname, FloatBuffer params);*/


    public static function glTexParameteri(int $target, int $pname, int $param)
    {

    }

    /*public static function glTexParameteriv(int $target, int $pname, IntBuffer params);*/


    public static function glUniform1f(int $location, float $x)
    {

    }

    /*public static function glUniform1fv(int $location, int $count, FloatBuffer v);*/

    //Array

    public static function glUniform1fv(int $location, int $count, ArrayMemoryFloat $v, int $offset)
    {

    }


    public static function glUniform1i(int $location, int $x)
    {

    }

    /*public static function glUniform1iv(int $location, int $count, IntBuffer v);*/


    public static function glUniform1iv(int $location, int $count, IntMemoryFloat $v, int $offset)
    {

    }

    public static function glUniform2f(int $location, float $x, float $y)
    {

    }

    /*public static function glUniform2fv(int $location, int $count, FloatBuffer v);*/


    public static function glUniform2fv(int $location, int $count, ArrayMemoryFloat $v, int $offset)
    {

    }


    public static function glUniform2i(int $location, int $x, int $y)
    {

    }

    /*public static function glUniform2iv(int $location, int $count, IntBuffer v);*/


    public static function glUniform2iv(int $location, int $count, IntMemoryFloat $v, int $offset)
    {

    }


    public static function glUniform3f(int $location, float $x, float $y, float $z)
    {

    }

    /*public static function glUniform3fv(int $location, int $count, FloatBuffer v);*/


    public static function glUniform3fv(int $location, int $count, ArrayMemoryFloat $v, int $offset)
    {

    }


    public static function glUniform3i(int $location, int $x, int $y, int $z)
    {

    }

    /*public static function glUniform3iv(int $location, int $count, IntBuffer v);*/


    public static function glUniform3iv(int $location, int $count, IntMemoryFloat $v, int $offset)
    {

    }


    public static function glUniform4f(int $location, float $x, float $y, float $z, float $w)
    {

    }

    /*public static function glUniform4fv(int $location, int $count, FloatBuffer v);*/


    public static function glUniform4fv(int $location, int $count, ArrayMemoryFloat $v, int $offset)
    {

    }


    public static function glUniform4i(int $location, int $x, int $y, int $z, int $w)
    {

    }

    /*public static function glUniform4iv(int $location, int $count, IntBuffer v);*/

    /*
    public static function glUniform4iv(int $location, int $count, int $v[], int $offset)
    {

    }*/

    /*public static function glUniformMatrix2fv(int $location, int $count, bool $transpose, FloatBuffer value);*/


    public static function glUniformMatrix2fv(int $location, int $count, bool $transpose, ArrayMemoryFloat $value, int $offset)
    {

    }

    /*public static function glUniformMatrix3fv(int $location, int $count, bool $transpose, FloatBuffer value);*/


    public static function glUniformMatrix3fv(int $location, int $count, bool $transpose, ArrayMemoryFloat $value, int $offset)
    {

    }

    /*public static function glUniformMatrix4fv(int $location, int $count, bool $transpose, FloatBuffer value);*/


    public static function glUniformMatrix4fv(int $location, int $count, bool $transpose, ArrayMemoryFloat $value, int $offset)
    {

    }


    public static function glUseProgram(int $program)
    {

    }


    public static function glValidateProgram(int $program)
    {

    }


    public
    static function glVertexAttrib1f(int $indx, float $x)
    {

    }

    /*public static function glVertexAttrib1fv(int $indx, FloatBuffer values);*/



    public static function glVertexAttrib2f(int $indx, float $x, float $y)
    {

    }

    /*public static function glVertexAttrib2fv(int $indx, FloatBuffer values);*/


    public static function glVertexAttrib3f(int $indx, float $x, float $y, float $z)
    {

    }

    /*public static function glVertexAttrib3fv(int $indx, FloatBuffer values);*/


    public static function glVertexAttrib4f(int $indx, float $x, float $y, float $z, float $w)
    {

    }

    /*public static function glVertexAttrib4fv(int $indx, FloatBuffer values);*/

    /**
     * In OpenGl core profiles (3.1+), passing a pointer to client memory is not valid.
     * In 3.0 and later, use the other version of this function instead, pass a zero-based
     * offset which references the buffer currently bound to GL_ARRAY_BUFFER.
     */
    /*public static function glVertexAttribPointer(int $indx, int $size, int $type, bool $normalized, int $stride, Buffer ptr);*/

    public static function glVertexAttribPointer(int $indx, int $size, int $type, bool $normalized, int $stride, int $ptr)
    {

    }
}