package org.springboot.blog.project.blogs.mapper;

import java.util.List;

import org.springboot.blog.project.blogs.bean.BlogCommentBean;
import org.springboot.blog.project.blogs.dto.CommentReplyDto;
import org.springboot.blog.project.blogs.entity.BlogComment;

public interface BlogCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLOG_COMMENT
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    int deleteByPrimaryKey(Long blogCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLOG_COMMENT
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    int insert(BlogComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLOG_COMMENT
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    int insertSelective(BlogComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLOG_COMMENT
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    BlogComment selectByPrimaryKey(Long blogCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLOG_COMMENT
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    int updateByPrimaryKeySelective(BlogComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLOG_COMMENT
     *
     * @mbggenerated Thu May 23 11:26:55 CST 2019
     */
    int updateByPrimaryKey(BlogComment record);
    
    /**
     * 博客评论与回复
     */
    List<BlogCommentBean> qryBlogComment(Long blogId);
}