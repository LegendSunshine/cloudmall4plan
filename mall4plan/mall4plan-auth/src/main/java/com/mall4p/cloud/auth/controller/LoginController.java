package com.mall4p.cloud.auth.controller;

import com.mall4p.cloud.api.auth.bo.UserInfoInTokenBO;
import com.mall4p.cloud.api.auth.vo.TokenInfoVO;
import com.mall4p.cloud.auth.dto.AuthenticationDTO;
import com.mall4p.cloud.auth.manager.TokenStore;
import com.mall4p.cloud.auth.service.AuthAccountService;
import com.mall4p.cloud.common.response.ServerResponseEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName LoginController
 * @Date 2023/2/9 15:20
 * @Author legend
 */
@RestController
@Api(tags = "登录")
public class LoginController {

    private TokenStore tokenStore;


    @Autowired
    private AuthAccountService authAccountService;
    @PostMapping("/ua/login")
    public ServerResponseEntity<TokenInfoVO> login(@Valid @RequestBody AuthenticationDTO authenticationDTO){
        ServerResponseEntity<UserInfoInTokenBO> userInfoInTokenResponse = authAccountService
                .getUserInfoInTokenByInputUserNameAndPassword(authenticationDTO.getPrincipal(),
                        authenticationDTO.getCredentials(), authenticationDTO.getSysType());

        if(!userInfoInTokenResponse.isSuccess()){
            return ServerResponseEntity.transform(userInfoInTokenResponse);
        }
        UserInfoInTokenBO data = userInfoInTokenResponse.getData();
        // 保存token，返回token数据给前端，这里是最重要的
        return ServerResponseEntity.success(tokenStore.storeAndGetVo(data));
    }
}
