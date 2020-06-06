package org.springboot.blog.project.blogs.dto;

import java.util.Date;

public class BlogDto {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.blog_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Long blogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.user_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.blog_title
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private String blogTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.blog_text_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Long blogTextId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.create_date
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.update_date
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.blog_read_num
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Long blogReadNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG.state
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    private Long state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.blog_id
     *
     * @return the value of BLOG.blog_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Long getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.blog_id
     *
     * @param blogId the value for BLOG.blog_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.user_id
     *
     * @return the value of BLOG.user_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.user_id
     *
     * @param userId the value for BLOG.user_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.blog_title
     *
     * @return the value of BLOG.blog_title
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public String getBlogTitle() {
        return blogTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.blog_title
     *
     * @param blogTitle the value for BLOG.blog_title
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.blog_text_id
     *
     * @return the value of BLOG.blog_text_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Long getBlogTextId() {
        return blogTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.blog_text_id
     *
     * @param blogTextId the value for BLOG.blog_text_id
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setBlogTextId(Long blogTextId) {
        this.blogTextId = blogTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.create_date
     *
     * @return the value of BLOG.create_date
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.create_date
     *
     * @param createDate the value for BLOG.create_date
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.update_date
     *
     * @return the value of BLOG.update_date
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.update_date
     *
     * @param updateDate the value for BLOG.update_date
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.blog_read_num
     *
     * @return the value of BLOG.blog_read_num
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Long getBlogReadNum() {
        return blogReadNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.blog_read_num
     *
     * @param blogReadNum the value for BLOG.blog_read_num
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setBlogReadNum(Long blogReadNum) {
        this.blogReadNum = blogReadNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG.state
     *
     * @return the value of BLOG.state
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public Long getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG.state
     *
     * @param state the value for BLOG.state
     *
     * @mbg.generated Tue Jul 02 17:22:36 CST 2019
     */
    public void setState(Long state) {
        this.state = state;
    }
}