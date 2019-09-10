package com.leo.myspringboot.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.leo.myspringboot.beans.Switch;
import com.leo.myspringboot.dao.SwitchMapper;
import com.leo.myspringboot.iservice.ISwitchSV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *code is far away from bug with the animal protecting
 *  ┏┓　　　┏┓
 *┏┛┻━━━┛┻┓
 *┃　　　　　　　┃ 　
 *┃　　　━　　　┃
 *┃　┳┛　┗┳　┃
 *┃　　　　　　　┃
 *┃　　　┻　　　┃
 *┃　　　　　　　┃
 *┗━┓　　　┏━┛
 *　　┃　　　┃神兽保佑
 *　　┃　　　┃代码无BUG！
 *　　┃　　　┗━━━┓
 *　　┃　　　　　　　┣┓
 *　　┃　　　　　　　┏┛
 *　　┗┓┓┏━┳┓┏┛
 *　　　┃┫┫　┃┫┫
 *　　　┗┻┛　┗┻┛
 *　　
 *   @description : Switch 服务实现类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@Service(group = "myspringboot")
public class SwitchServiceImpl extends BaseServiceImpl<SwitchMapper, Switch> implements ISwitchSV {
    @Override
    public Switch getServiceSwitchByKey(final String swtchKey) {
        Map condition = new HashMap<String,Object>(){
            {
                put("swtch_key",swtchKey);
                put("valid_flag","1");
            }
        };
        List<Switch> switchList = super.selectByMap(condition);
        if(switchList != null && !switchList.isEmpty()){
            return switchList.get(0);
        }
        return null;
    }
}
