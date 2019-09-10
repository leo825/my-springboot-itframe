package com.leo.myspringboot.util.enums;

/**
 * 返回客户端信息枚举
 */
public enum ReturnInfoEnums {
    PROCESS_OK("0000", "ok"),
    PROCESS_SUCCESS("0000", "success"),
    PROCESS_DEAL_SUCCESS("0000", "操作成功！"),
    PROCESS_ERROR("2999", "业务异常"),
    PROCESS_EXCEPTION_OTHER("9999", "系统异常");

    private String code;
    private String message;

    private ReturnInfoEnums(String code, String message) {
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
