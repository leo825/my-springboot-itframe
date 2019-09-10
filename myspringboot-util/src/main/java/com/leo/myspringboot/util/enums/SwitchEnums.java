package com.leo.myspringboot.util.enums;

/**
 * 开关信息枚举
 */
public enum SwitchEnums {


    /**
     * 缓存有效标志
     */
    VALID_FLAG_1("1", "有效"),
    VALID_FLAG_0("0", "失效"),
    /**
     * 缓存类型代码
     */
    CACHE_TYPE_CD_1("1", "常量缓存"),
    CACHE_TYPE_CD_2("2", "可变量缓存"),
    /**
     * 缓存数据类型代码
     */
    CACHE_DATA_TYPE_CD_1("1", "字符串缓存"),
    CACHE_DATA_TYPE_CD_2("2", "数字缓存"),

    /**
     * 业务系统编码
     */
    BIZ_SYS_CODE_XSGL("XSGL", "学生管理"),
    BIZ_SYS_CODE_JSGL("JSGL", "教师管理"),
    BIZ_SYS_CODE_KCGL("KCGL", "课程管理"),

    /**
     * 是否推送
     */
    PUSH_ALERT_FLAG_1("1", "推送到"),
    PUSH_ALERT_FLAG_0("0", "不推送");

    private String code;
    private String message;

    private SwitchEnums(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
