package com.office.rebates.dal.dao;

import com.office.rebates.dal.dataobj.RebatesOrder;
import com.office.rebates.dal.dataobj.RebatesOrderExample;
import com.office.rebates.model.admin.RebatesOrderModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 新返利订单dao
 */
public interface NewRebatesOrderMapper {

    /**
     * 获取订单总数
     * @param map 条件
     * @return
     */
    public int countOrderList(Map<String,Object> map);

    /**
     * 获取订单列表
     * @param map 条件
     * @return
     */
    public List<RebatesOrderModel> selectOrderModel(Map<String,Object> map);
}