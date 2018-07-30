package org.kjtc.mapper;

import org.kjtc.entity.CommodityTableEntity;

public class IndexProvider {

    public String getShengDaoJiaList(CommodityTableEntity commodityTableEntity) {

        StringBuffer sql = new StringBuffer();
        sql.append(" SELECT   ");
        sql.append(" num_id  AS numId,");
        sql.append(" title,");
        sql.append(" pict_url  AS pictUrl,");
        sql.append(" small_images AS smallImages   ,");
        sql.append(" reserve_price AS reservePrice,");
        sql.append(" zk_final_price AS zkFinalPrice,");
        sql.append(" user_type AS userType,");
        sql.append(" provcity,");
        sql.append(" item_url AS itemUrl,");
        sql.append(" nick,");
        sql.append(" seller_id AS sellerId,");
        sql.append(" volume,");
        sql.append(" creat_time AS creatTime,");
        sql.append(" popularity,");
        sql.append(" voucher_address AS voucherAddress,");
        sql.append(" creat_user AS creatUser  FROM  ");
        sql.append(" commodity_table  ");

        return sql.toString();
    }

}
