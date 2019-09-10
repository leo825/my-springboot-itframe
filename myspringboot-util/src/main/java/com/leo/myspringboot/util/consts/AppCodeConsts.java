package com.leo.myspringboot.util.consts;

/**
 * @ClassName: AppCodeConsts
 * @Description: 应用系统常量管理类
 */

public class AppCodeConsts {
    /**
     * 定义各个业务系统id
     * 用于存储表中crtSysId,mdfSysId
     */
    public interface APP_SYS_ID {
        //客户端管理
        String EDC_CM = "CM";

        //短信中心
        String EDC_SMS = "SMS";

        //一体机
        String EDC_AIOM = "AIOM";

        //未定义
        String UNDEFINED = "UNDEFINED";
    }

    /**
     * 定义各个业务系统程序用户id
     * 用于存储表中crtUserId,mdfUserId
     */
    public interface APP_USER_ID {
        String BUSI_TASK_USER = "TASK_CHECKLIMIT";
        String BUSI_MQ_USER = "MQ_";
        // 未定义
        String UNDEFINED = "UNDEFINED";
    }
}
