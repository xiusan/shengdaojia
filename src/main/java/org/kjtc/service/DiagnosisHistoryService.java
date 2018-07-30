package org.kjtc.service;

import org.kjtc.entity.FaultFile;
import org.kjtc.mapper.DiagnosisHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/4.
 */
@Service("diagnosisHistoryService")
public class DiagnosisHistoryService {

    @Autowired
    DiagnosisHistoryMapper diagnosisHistoryMapper;


    public List<FaultFile> getDiagnosishistoryList(FaultFile faultFile) {
        return diagnosisHistoryMapper.getDiagnosishistoryList(faultFile) ;
    }


}
