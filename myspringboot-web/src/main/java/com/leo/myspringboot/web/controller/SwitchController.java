package com.leo.myspringboot.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.plugins.Page;
import com.leo.myspringboot.beans.Switch;
import com.leo.myspringboot.beans.common.JSONResult;
import com.leo.myspringboot.beans.common.TableJSON;
import com.leo.myspringboot.iservice.ISwitchSV;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
*   @description : Switch 控制器
*   ---------------------------------
* 	 @author leo825
*   @since 2019-02-16
*/
@RestController
@Api(value="/switch", description="Switch 控制器")
@RequestMapping("/switch")
public class SwitchController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(SwitchController.class);

    @Reference(group = "myspringboot")
    public ISwitchSV switchService;

    /**
     * @description : 获取分页列表
     * ---------------------------------
     * @author : leo825
     * @since : Create in 2019-02-16
     */
    @GetMapping("/getSwitchList")
    @ApiOperation(value="/getSwitchList", notes="获取分页列表")
    public TableJSON<Switch> getSwitchList(@ApiParam(name="Switch",value="Switch 实体类")Switch param ,
                                @ApiParam(name="length",value="页大小",required=true,defaultValue = "10")Integer length,
                                @ApiParam(name="pageNo",value="页数",required=true,defaultValue = "1")Integer pageNo) {
            TableJSON<Switch> resJson=new TableJSON<Switch>();
            if(param.getBeginDate() == null) {
                if (param.getEndDate() == null) {
                    param.setBeginDate(getMonthFirstDay(new Date()));
                } else { param.setBeginDate(getMonthFirstDay(param.getEndDate())); }
            }
            if(param.getEndDate() == null) {
                param.setEndDate(getMonthLastDay(new Date()));
            }
            try {
                Page<Switch> page=new Page<Switch>(pageNo,length);
                switchService.selectPageWithParam(page, param);
                resJson.setRecordsTotal(page.getTotal());
                resJson.setData(page.getRecords());
                resJson.setSuccess(true);
            }catch (Exception e){
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:"+e.getClass().getName());
                logger.info("异常信息:{}",e.getMessage());
            }
            return resJson;
    }

    /**
     * @description : 通过id获取Switch
     * ---------------------------------
     * @author : leo825
     * @since : Create in 2019-02-16
     */
    @GetMapping("/getSwitchById")
    @ApiOperation(value="/getSwitchById", notes="通过id获取Switch")
    public JSONResult<Switch> getSwitchById(@ApiParam(name="id",value="SwitchID",required=true)Long id) {
            JSONResult<Switch> resJson = new JSONResult<Switch>();
            try {
                Switch param= switchService.selectOneByObj(id);
                resJson.setData(param);
                resJson.setSuccess(true);
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:"+e.getClass().getName());
                logger.info("异常信息:{}",e.getMessage());
            }
            return resJson;
    }

    /**
     * @description : 通过id删除Switch
     * ---------------------------------
     * @author : leo825
     * @since : Create in 2019-02-16
     */
    @DeleteMapping("/deleteSwitchById")
    @ApiOperation(value="/deleteSwitchById", notes="通过id删除Switch")
    public JSONResult<Switch> deleteSwitchById(@ApiParam(name="id",value="SwitchID",required=true)Long id) {
            JSONResult<Switch> resJson = new JSONResult<Switch>();
            try{
                resJson.setSuccess(switchService.deleteById(id));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:"+e.getClass().getName());
                logger.info("异常信息:{}",e.getMessage());
            }
            return resJson;
    }

    /**
     * @description : 通过id更新Switch
     * ---------------------------------
     * @author : leo825
     * @since : Create in 2019-02-16
     */
    @PutMapping("/updateSwitchById")
    @ApiOperation(value="/updateSwitchById", notes="通过id更新Switch")
    public JSONResult<Switch> updateSwitchById(@ApiParam(name="Switch",value="Switch 实体类")Switch param) {
            JSONResult<Switch> resJson = new JSONResult<Switch>();
            try{
                resJson.setSuccess(switchService.updateById(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:"+e.getClass().getName());
                logger.info("异常信息:{}",e.getMessage());
            }
            return resJson;
    }

    /**
     * @description : 添加Switch
     * ---------------------------------
     * @author : leo825
     * @since : Create in 2019-02-16
     */
	@PutMapping("/addSwitch")
    @ApiOperation(value="/addSwitch", notes="添加Switch")
    public JSONResult<Switch> addSwitch(@ApiParam(name="Switch",value="Switch 实体类")Switch param) {
            JSONResult<Switch> resJson = new JSONResult<Switch>();
            try{
                resJson.setSuccess(switchService.insert(param));
            }catch (Exception e) {
                resJson.setSuccess(false);
                resJson.setMessage("异常信息:"+e.getClass().getName());
                logger.info("异常信息:{}",e.getMessage());
            }
            return resJson;
    }
}
