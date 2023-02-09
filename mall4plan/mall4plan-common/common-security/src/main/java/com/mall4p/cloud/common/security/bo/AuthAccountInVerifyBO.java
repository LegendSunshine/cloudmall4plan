package com.mall4p.cloud.common.security.bo;

import com.mall4p.cloud.api.auth.bo.UserInfoInTokenBO;

/**
 * @ClassName AuthAccountInVerifyBO
 * @Date 2023/2/9 15:45
 * @Author legend
 */
public class AuthAccountInVerifyBO extends UserInfoInTokenBO {

    private String password;

    private Integer status;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AuthAccountInVerifyBO{" +
                "password='" + password + '\'' +
                ", status=" + status +
                "} " + super.toString();
    }


}