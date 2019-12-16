package com.xuecheng.learning.client;

import com.xuecheng.framework.domain.course.TeachplanMediaPub;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by fanfan on 2019/12/16.
 */

@FeignClient(value = "XC-SEARCH-SERVICE")
public interface CourseSearchClient {
    @GetMapping(value = "/search/course/getmedia/{teachplanId}")
    public TeachplanMediaPub getmedia(@PathVariable("teachplanId") String teachplanId);
}
