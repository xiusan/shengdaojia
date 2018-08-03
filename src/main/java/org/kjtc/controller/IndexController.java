package org.kjtc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.kjtc.entity.CommodityTableEntity;
import org.kjtc.entity.Equipment;
import org.kjtc.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 省到家
 * Created by xjl on 2018/7/15.
 */
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;


    @RequestMapping("")
    public String login(){
        return "index";
    }

    @RequestMapping("/index")
    public String loginPage(){
        return "index";
    }

    @RequestMapping("/indexcp")
    public String indexcp(){
        return "indexcp";
    }

    /**
     *
     * @Description: geEquipmentList
     * @Param: [equipment, pageNum, pageSize]
     * @return: java.lang.Object
     * @Author: dongteng
     * @Date:2018/05/14
     * @time:10:00
     *
     */
    @RequestMapping(value = "/getShengDaoJiaList")
    @ResponseBody
    public Object getShengDaoJiaList(CommodityTableEntity commodityTableEntity,
                                   @RequestParam(value="pageNum", defaultValue="1") Integer pageNum, @RequestParam(value="pageSize", defaultValue="10") Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        List<CommodityTableEntity> shengDaoJiaList = indexService.getShengDaoJiaList(commodityTableEntity);

        PageInfo pageInfo = new PageInfo(shengDaoJiaList);

        return pageInfo;
    }
}
