
package com.leo.myspringboot.util.consts;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用缓存常量管理类
 *
 * @author sangkun
 */
public class CacheConsts {

    public static final Map<String, String> provinceMap = new HashMap<String, String>();

    static {
        provinceMap.put("100", "北京");
        provinceMap.put("220", "天津");
        provinceMap.put("210", "上海");
        provinceMap.put("230", "重庆");
        provinceMap.put("311", "河北");
        provinceMap.put("371", "河南");
        provinceMap.put("871", "云南");
        provinceMap.put("240", "辽宁");
        provinceMap.put("451", "黑龙江");
        provinceMap.put("731", "湖南");
        provinceMap.put("551", "安徽");
        provinceMap.put("531", "山东");
        provinceMap.put("991", "新疆");
        provinceMap.put("250", "江苏");
        provinceMap.put("571", "浙江");
        provinceMap.put("791", "江西");
        provinceMap.put("270", "湖北");
        provinceMap.put("771", "广西");
        provinceMap.put("931", "甘肃");
        provinceMap.put("351", "山西");
        provinceMap.put("471", "内蒙古");
        provinceMap.put("290", "陕西");
        provinceMap.put("431", "吉林");
        provinceMap.put("591", "福建");
        provinceMap.put("851", "贵州");
        provinceMap.put("200", "广东");
        provinceMap.put("971", "青海");
        provinceMap.put("891", "西藏");
        provinceMap.put("280", "四川");
        provinceMap.put("951", "宁夏");
        provinceMap.put("898", "海南");
    }

    /**
     * 各系统公用工具类中的开关key前缀
     */
    public static final String CACHE_SWITCH_PREFIX = "AIOM_SWITCH:";

    /**
     * redis会话前缀
     */
    public static final String CACHE_SESSION = "AIOM_SESSION:";

    /**
     * 各系统公用工具类中的rnfs配置信息key前缀
     */
    public static final String CACHE_RNFSCFG_PREFIX = "AIOM_RNFS:";

    /**
     * 领导号固定配置 拦截器使用
     */
    public static final String LEADER_TEL = "|13901230950|15225192461|13837170393|18768870617|";

    /**
     * 接入Redis缓存的Key值管理 1.缓存键值定义格式：业务系统_业务模块:业务自定义键值。（不推荐含义不清的key和特别长的key）
     * 2.业务系统：根据业务系统名称进行限定统一设置英文大写。
     * 3.业务模块：由业务系统负责人统一对本系统的业务模块名称进行规划，统一配置为英文大写。业务模块可以进一步细化为一级业务模块，二级业务模块…
     * 级业务模块，模块间分割符统一采用下划线“_”进行表示。 4.业务自定义键值：由开发人员根据业务系统逻辑表示进行限定。
     * 业务自定义键值应用“:”作为变量标识。 示例： 身份证认证应用的身份证真实性查验标识 GZT_RTN_FALSE:身份证号密文
     * EDCACMS_GZTRTNFALSE:20161215001
     */
    public interface REDIS {
        /**
         * 国政通
         */
        String GZT_ = "GZT_";
        /**
         * URL路径
         */
        String _URL = "_URL";
        /**
         * 示例：参照此示例配置key值
         * 防跳过redis key 前缀
         */
        String NO_JUMP_KEY = "EDCAIOM_VIDEO_NO_JUMP_KEY:";

    }

    /**
     * 接入运营管理中心管理的JVM缓存Key值管理 键值命名规则：系统名_业务名:自定义key 由运营管理中心与业务应用在命名规则的基础上进行约自行约定
     * 示例： 调用国政通总放行开关，true打开放行，false关闭走实时接口 ACMS_SWITCH:SEND_GZT_PASS_FLAG
     */
    public interface JVM {

        /**
         * 示例开关
         */
        String ORDER_FLAG = CACHE_SWITCH_PREFIX + "ORDER_FLAG";
    }

}
