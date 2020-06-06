package org.springboot.blog.project.blogs.entity;

import java.util.Date;

public class BlogComment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.blog_comment_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private Long blogCommentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.blog_comment_text
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private String blogCommentText;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.blog_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private Long blogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.user_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.floor_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private Long floorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.create_date
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_COMMENT.state
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    private Long state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.blog_comment_id
     *
     * @return the value of BLOG_COMMENT.blog_comment_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public Long getBlogCommentId() {
        return blogCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.blog_comment_id
     *
     * @param blogCommentId the value for BLOG_COMMENT.blog_comment_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setBlogCommentId(Long blogCommentId) {
        this.blogCommentId = blogCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.blog_comment_text
     *
     * @return the value of BLOG_COMMENT.blog_comment_text
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public String getBlogCommentText() {
        return blogCommentText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.blog_comment_text
     *
     * @param blogCommentText the value for BLOG_COMMENT.blog_comment_text
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setBlogCommentText(String blogCommentText) {
        this.blogCommentText = blogCommentText == null ? null : blogCommentText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.blog_id
     *
     * @return the value of BLOG_COMMENT.blog_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public Long getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.blog_id
     *
     * @param blogId the value for BLOG_COMMENT.blog_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.user_id
     *
     * @return the value of BLOG_COMMENT.user_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.user_id
     *
     * @param userId the value for BLOG_COMMENT.user_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.floor_id
     *
     * @return the value of BLOG_COMMENT.floor_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public Long getFloorId() {
        return floorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.floor_id
     *
     * @param floorId the value for BLOG_COMMENT.floor_id
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setFloorId(Long floorId) {
        this.floorId = floorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.create_date
     *
     * @return the value of BLOG_COMMENT.create_date
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.create_date
     *
     * @param createDate the value for BLOG_COMMENT.create_date
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_COMMENT.state
     *
     * @return the value of BLOG_COMMENT.state
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public Long getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_COMMENT.state
     *
     * @param state the value for BLOG_COMMENT.state
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    public void setState(Long state) {
        this.state = state;
    }
}