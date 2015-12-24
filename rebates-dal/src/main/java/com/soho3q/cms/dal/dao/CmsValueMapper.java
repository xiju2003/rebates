package com.soho3q.cms.dal.dao;

import com.soho3q.cms.dal.dataobj.CmsValue;
import com.soho3q.cms.dal.dataobj.CmsValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int countByExample(CmsValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int deleteByExample(CmsValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int deleteByPrimaryKey(Long valueId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int insert(CmsValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int insertSelective(CmsValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    List<CmsValue> selectByExample(CmsValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    CmsValue selectByPrimaryKey(Long valueId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int updateByExampleSelective(@Param("record") CmsValue record, @Param("example") CmsValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int updateByExample(@Param("record") CmsValue record, @Param("example") CmsValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int updateByPrimaryKeySelective(CmsValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    int updateByPrimaryKey(CmsValue record);
}