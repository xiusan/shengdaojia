package org.kjtc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.kjtc.entity.FaultFile;
import org.kjtc.service.DiagnosisHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/4.
 */
@Controller
public class DiagnosisHistoryController {

    private static Logger logger = Logger.getLogger(DiagnosisHistoryController.class);

    @Autowired
    private DiagnosisHistoryService diagnosisHistoryService;

    /**
     * 诊断历史映射到Html
     * @return
     */
    @RequestMapping(value = "/diagnosisHistory")
    public String equipmentPage(){
        return "diagnosisHistory";
    }

    /**
     * 查询历史记录
     * @param faultFile
     * @param pageNum
     * @param pageSize
     * @return pageInfo
     */

    @RequestMapping("/getDiagnosishistoryList")
    @ResponseBody
    public Object getDiagnosishistoryList(
            FaultFile faultFile ,
            @RequestParam(value="pageNum", defaultValue="1") Integer pageNum,
            @RequestParam(value="pageSize", defaultValue="10") Integer pageSize ) {

        PageHelper.startPage(pageNum, pageSize);

        List<FaultFile> equipmentList =diagnosisHistoryService.getDiagnosishistoryList(faultFile);

        PageInfo pageInfo  = new PageInfo(equipmentList);

        return pageInfo;

    }

    /**
     * 获取充电站名称
     * @param faultFile
     * @return
     */
    @RequestMapping("/getDiagnosisHistoryName")
    @ResponseBody
    public List<Object> getEquipmentName(FaultFile faultFile) {
        List<Object> list = new ArrayList<Object>();
        try {
            List<FaultFile> diagnosisHistoryList = diagnosisHistoryService.getDiagnosishistoryList(faultFile);
            for (FaultFile diagnosisHistoryTemp : diagnosisHistoryList) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("diagnosisHistoryID", diagnosisHistoryTemp.getChargingstationid());
                map.put("diagnosisHistoryName", diagnosisHistoryTemp.getChargingstationName());
                list.add(map);
            }
        } catch (Exception e) {
            logger.error("下拉列表-充电站名称查询异常:" + e.getMessage());
        }

        return list;
    }


    /**
     * 获取充电桩名字
     * @param faultFile
     * @return
     */

    @RequestMapping("/getChargingPileName")
    @ResponseBody
    public List<Object> getChargingPileName(FaultFile faultFile) {
        List<Object> list = new ArrayList<Object>();
        try {
            List<FaultFile> diagnosisHistoryList = diagnosisHistoryService.getDiagnosishistoryList(faultFile);
            for (FaultFile diagnosisHistoryTemp : diagnosisHistoryList) {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("equipmentid", diagnosisHistoryTemp.getChargingstationid());
                map.put("equipmentName", diagnosisHistoryTemp.getChargingstationName());
                list.add(map);
            }
        } catch (Exception e) {
            logger.error("下拉列表-充电桩名称查询异常:" + e.getMessage());
        }

        return list;
    }
}
