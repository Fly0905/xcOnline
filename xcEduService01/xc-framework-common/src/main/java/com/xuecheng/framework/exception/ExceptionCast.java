package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * Created by fanfan on 2019/11/27.
 */
//异常抛出类
public class ExceptionCast {
    //使用此静态方法抛出自定义异常
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
