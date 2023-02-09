package com.mall4p.cloud.auth.service;

import com.mall4p.cloud.api.auth.bo.UserInfoInTokenBO;
import com.mall4p.cloud.common.response.ServerResponseEntity;

public interface AuthAccountService {
    ServerResponseEntity<UserInfoInTokenBO> getUserInfoInTokenByInputUserNameAndPassword(String principal, String credentials, Integer sysType);
}
