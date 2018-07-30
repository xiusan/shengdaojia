package org.kjtc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.kjtc.entity.CommodityTableEntity;
import org.kjtc.entity.Equipment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaojinlu on 2018/7/28.
 */
@Mapper
public interface IndexMapper {


    @SelectProvider(type = IndexProvider.class, method = "getShengDaoJiaList")
    List<CommodityTableEntity> getShengDaoJiaList(CommodityTableEntity commodityTableEntity);
}
