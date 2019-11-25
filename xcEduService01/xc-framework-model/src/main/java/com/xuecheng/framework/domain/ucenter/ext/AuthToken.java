package com.xuecheng.framework.domain.ucenter.ext;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by fanfan on 2019/11/22.
 */
@Data
@ToString
@NoArgsConstructor
public class AuthToken {
    String access_token;//访问token
    String refresh_token;//刷新token
    String jwt_token;//jwt令牌
}
