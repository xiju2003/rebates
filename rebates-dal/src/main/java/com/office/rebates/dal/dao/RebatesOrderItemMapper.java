package com.office.rebates.dal.dao;

import com.office.rebates.dal.dataobj.RebatesOrderItem;
import com.office.rebates.dal.dataobj.RebatesOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebatesOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int countByExample(RebatesOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int deleteByExample(RebatesOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int deleteByPrimaryKey(Long orderItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int insert(RebatesOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int insertSelective(RebatesOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    List<RebatesOrderItem> selectByExample(RebatesOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    RebatesOrderItem selectByPrimaryKey(Long orderItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") RebatesOrderItem record, @Param("example") RebatesOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByExample(@Param("record") RebatesOrderItem record, @Param("example") RebatesOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByPrimaryKeySelective(RebatesOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_order_item
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByPrimaryKey(RebatesOrderItem record);
}