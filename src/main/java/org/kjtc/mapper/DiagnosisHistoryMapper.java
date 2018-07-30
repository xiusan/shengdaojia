package org.kjtc.mapper;

import org.apache.ibatis.annotations.*;
import org.kjtc.entity.DiagnosisHistory;
import org.kjtc.entity.FaultFile;
import org.kjtc.entity.HomeRate;

import java.util.List;

@Mapper
public interface DiagnosisHistoryMapper {

    @SelectProvider(type = DiagnosisHistoryProvider.class,method = "getDiagnosishistoryList")
    List<FaultFile> getDiagnosishistoryList(FaultFile faultFile);

}
