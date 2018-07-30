package org.kjtc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/7/3.
 */
@Controller
public class Test {
    private static Logger logger = Logger.getLogger(EquipmentController.class);

    @RequestMapping(value = "/test")
    public String equipmentPage(){
        return "diagnosisHistory";
    }


}
