package org.springboot.blog.project.blogs.mapper;

import org.springboot.blog.project.blogs.entity.Userinfo;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Thu May 23 11:23:47 CST 2019
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Thu May 23 11:23:47 CST 2019
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Thu May 23 11:23:47 CST 2019
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Thu May 23 11:23:47 CST 2019
     */
    Userinfo selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Thu May 23 11:23:47 CST 2019
     */
    int updateByPrimaryKeySelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERINFO
     *
     * @mbggenerated Thu May 23 11:23:47 CST 2019
     */
    int updateByPrimaryKey(Userinfo record);
}