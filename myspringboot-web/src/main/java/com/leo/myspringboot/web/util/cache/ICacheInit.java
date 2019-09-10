package com.leo.myspringboot.web.util.cache;

import java.util.List;
import java.util.Map;

/**
 * @author renld
 */
@SuppressWarnings("rawtypes")
public interface ICacheInit {
    /**
     * 实现接口后各业务系统实现以下方法：
     * 1、实现从db中获取各个模块的缓存数据，给2中实现run方法初始化缓存时调用，如果本系统没有对应模块请返回失败；
     * 2、实现CommandLineRunner的run方法，在系统重启后初始化jvm、redis缓存数据
     */

    /**
     * 从db中，获取jvm缓存数据以初始化缓存(String类型数据)
     *
     * @return
     */

    public Map<String, String> getJvmStringCacheData();

    /**
     * 从db中，获取redis缓存数据以初始化缓存(String类型数据)
     *
     * @return
     */
    public Map<String, String> getRedisStringCacheData();

    /**
     * 从db中，获取jvm缓存数据以初始化缓存(Map类型数据)
     *
     * @return
     */
    public Map<String, Map<String, String>> getJvmMapCacheData();

    /**
     * 从db中，获取redis缓存数据以初始化缓存(Map类型数据)
     *
     * @param
     */
    public Map<String, Map<String, String>> getRedisMapCacheData();

    /**
     * 从db中，获取jvm缓存数据以初始化缓存(List类型数据)
     *
     * @param
     */
    public Map<String, List> getJvmListCacheData();

    /**
     * 从db中，获取redis缓存数据以初始化缓存(List类型数据)
     *
     * @param
     */
    public Map<String, List> getRedisListCacheData();
}
