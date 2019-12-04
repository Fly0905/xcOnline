package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CoursePic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fanfan on 2019/12/04.
 */
public interface CoursePicRepository extends JpaRepository<CoursePic, String> {
    //定义dao方法，删除后返回影响行数
    long deleteByCourseid(String courseid);
}
