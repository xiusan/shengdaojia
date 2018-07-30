package org.kjtc.mapper;

import org.kjtc.entity.FaultFile;
import org.kjtc.util.StringUtils;

/**
 * @program:org.kjtc.mapper
 * @description:故障文件
 * @author: chenxu
 * @create:2018-05-07 09:58
 */


public class DiagnosisHistoryProvider {


    public String getDiagnosishistoryList(FaultFile faultFile){

        StringBuffer sql = new StringBuffer();

        sql.append("SELECT\n" +
                "f.ID,\n" +
                "d.ChargingStationID,\n" +
                "d.EquipmentID,\n" +
                "d.RecentDiagnosisTime as DiagnosisTime,\n" +
                "DiagnosisFilePath,\n" +
                "DiagnosisFileName,\n" +
                "DiagnosisFileMD5,\n" +
                "d.FaultStatus as DiagnosisStatus,\n" +
                "f.CreateUser,\n" +
                "f.CreateDTTM,\n" +
                "f.UpdateUser,\n" +
                "f.DiagnosisFileSize,\n" +
                "f.UpdateDTTM,\n" +
                "e.EquipmentName  AS equipmentName,\n" +
                "c.ChargingStationName AS chargingstationName\n" +
                "FROM diagnosishistory d LEFT JOIN\n" +
                "faultfile f on  d.RecentDiagnosisTime=f.DiagnosisTime \n" +
                "LEFT JOIN equipment e ON d.EquipmentID = e.EquipmentID\n" +
                "LEFT JOIN chargingstation c ON d.ChargingStationID = c.ChargingStationID\n" +
                "WHERE\n" +
                "1 = 1 ");

        if(!StringUtils.isEmpty(faultFile.getChargingstationid())){

            sql.append(" AND f.chargingStationID =  #{chargingstationid} ");

        }

        if(!StringUtils.isEmpty(faultFile.getEquipmentid())){

            sql.append(" AND f.equipmentID =  #{equipmentid} ");

        }

        sql.append(" GROUP BY d.RecentDiagnosisTime ");

        sql.append(" ORDER BY\n" +
                "createDTTM DESC");

        return sql.toString();
    }

}
