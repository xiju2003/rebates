package com.soho3q.cms.dal.dataobj;

import java.util.Date;

public class CmsValueHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.value_history_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private Long valueHistoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.value_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private Long valueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.channel_name
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String channelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.cms_key
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String cmsKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.language
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String language;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.client
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String client;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.os
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String os;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.business_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String businessId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String cmsValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.enabled
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private Byte enabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.creator
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.create_time
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.updater
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.last_update_time
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_value_history.description
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.value_history_id
     *
     * @return the value of cms_value_history.value_history_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public Long getValueHistoryId() {
        return valueHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.value_history_id
     *
     * @param valueHistoryId the value for cms_value_history.value_history_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setValueHistoryId(Long valueHistoryId) {
        this.valueHistoryId = valueHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.value_id
     *
     * @return the value of cms_value_history.value_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public Long getValueId() {
        return valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.value_id
     *
     * @param valueId the value for cms_value_history.value_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.channel_name
     *
     * @return the value of cms_value_history.channel_name
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.channel_name
     *
     * @param channelName the value for cms_value_history.channel_name
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.cms_key
     *
     * @return the value of cms_value_history.cms_key
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getCmsKey() {
        return cmsKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.cms_key
     *
     * @param cmsKey the value for cms_value_history.cms_key
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setCmsKey(String cmsKey) {
        this.cmsKey = cmsKey == null ? null : cmsKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.language
     *
     * @return the value of cms_value_history.language
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.language
     *
     * @param language the value for cms_value_history.language
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.client
     *
     * @return the value of cms_value_history.client
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.client
     *
     * @param client the value for cms_value_history.client
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setClient(String client) {
        this.client = client == null ? null : client.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.os
     *
     * @return the value of cms_value_history.os
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getOs() {
        return os;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.os
     *
     * @param os the value for cms_value_history.os
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.business_id
     *
     * @return the value of cms_value_history.business_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.business_id
     *
     * @param businessId the value for cms_value_history.business_id
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.cms_value
     *
     * @return the value of cms_value_history.cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getCmsValue() {
        return cmsValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.cms_value
     *
     * @param cmsValue the value for cms_value_history.cms_value
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setCmsValue(String cmsValue) {
        this.cmsValue = cmsValue == null ? null : cmsValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.enabled
     *
     * @return the value of cms_value_history.enabled
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.enabled
     *
     * @param enabled the value for cms_value_history.enabled
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.creator
     *
     * @return the value of cms_value_history.creator
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.creator
     *
     * @param creator the value for cms_value_history.creator
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.create_time
     *
     * @return the value of cms_value_history.create_time
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.create_time
     *
     * @param createTime the value for cms_value_history.create_time
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.updater
     *
     * @return the value of cms_value_history.updater
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.updater
     *
     * @param updater the value for cms_value_history.updater
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.last_update_time
     *
     * @return the value of cms_value_history.last_update_time
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.last_update_time
     *
     * @param lastUpdateTime the value for cms_value_history.last_update_time
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_value_history.description
     *
     * @return the value of cms_value_history.description
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_value_history.description
     *
     * @param description the value for cms_value_history.description
     *
     * @mbggenerated Tue Nov 10 17:09:52 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}