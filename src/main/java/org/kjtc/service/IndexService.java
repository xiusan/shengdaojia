package org.kjtc.service;

import org.kjtc.entity.CommodityTableEntity;
import org.kjtc.mapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaojinlu on 2018/7/28.
 */
@Service("indexService")
public class IndexService {

    @Autowired
    private IndexMapper indexMapper;


    public List<CommodityTableEntity> getShengDaoJiaList(CommodityTableEntity commodityTableEntity) {
        return indexMapper.getShengDaoJiaList(commodityTableEntity);

    }
}
