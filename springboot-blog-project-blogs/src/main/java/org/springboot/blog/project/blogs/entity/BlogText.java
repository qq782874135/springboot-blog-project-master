package org.springboot.blog.project.blogs.entity;

public class BlogText {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_TEXT.blog_text_id
     *
     * @mbggenerated Thu May 23 11:26:23 CST 2019
     */
    private Long blogTextId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BLOG_TEXT.blog_text
     *
     * @mbggenerated Thu May 23 11:26:23 CST 2019
     */
    private String blogText;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_TEXT.blog_text_id
     *
     * @return the value of BLOG_TEXT.blog_text_id
     *
     * @mbggenerated Thu May 23 11:26:23 CST 2019
     */
    public Long getBlogTextId() {
        return blogTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_TEXT.blog_text_id
     *
     * @param blogTextId the value for BLOG_TEXT.blog_text_id
     *
     * @mbggenerated Thu May 23 11:26:23 CST 2019
     */
    public void setBlogTextId(Long blogTextId) {
        this.blogTextId = blogTextId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BLOG_TEXT.blog_text
     *
     * @return the value of BLOG_TEXT.blog_text
     *
     * @mbggenerated Thu May 23 11:26:23 CST 2019
     */
    public String getBlogText() {
        return blogText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BLOG_TEXT.blog_text
     *
     * @param blogText the value for BLOG_TEXT.blog_text
     *
     * @mbggenerated Thu May 23 11:26:23 CST 2019
     */
    public void setBlogText(String blogText) {
        this.blogText = blogText == null ? null : blogText.trim();
    }
}