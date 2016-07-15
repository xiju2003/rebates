package com.office.rebates.dal.dao;

import com.office.rebates.dal.dataobj.SalesPeople;
import com.office.rebates.dal.dataobj.SalesPeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesPeopleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int countByExample(SalesPeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int deleteByExample(SalesPeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int deleteByPrimaryKey(Long salesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int insert(SalesPeople record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int insertSelective(SalesPeople record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    List<SalesPeople> selectByExample(SalesPeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    SalesPeople selectByPrimaryKey(Long salesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int updateByExampleSelective(@Param("record") SalesPeople record, @Param("example") SalesPeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int updateByExample(@Param("record") SalesPeople record, @Param("example") SalesPeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int updateByPrimaryKeySelective(SalesPeople record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_people
     *
     * @mbggenerated Thu Jul 14 17:10:50 CST 2016
     */
    int updateByPrimaryKey(SalesPeople record);
}