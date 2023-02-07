package com.mall4p.cloud.auth.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @ClassName AuthenticationDTO
 * @Date 2023/2/7 16:46
 * @Author legend
 */
public class AuthenticationDTO {

    /**
     * 用户名
     */
    @NotBlank(message = "principal不能为空")
    @ApiModelProperty(value = "用户名", required = true)
    protected String principal;

    /**
     * 密码
     */
    @NotBlank(message = "credentials不能为空")
    @ApiModelProperty(value = "一般用作密码", required = true)
    protected String credentials;

    /**
     * sysType 参考SysTypeEnum
     */
    @NotNull(message = "sysType不能为空")
    @ApiModelProperty(value = "系统类型 0.普通用户系统 1.商家端", required = true)
    protected Integer sysType;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public Integer getSysType() {
        return sysType;
    }

    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    @Override
    public String toString() {
        return "AuthenticationDTO{" +
                "principal='" + principal + '\'' +
                ", credentials='" + credentials + '\'' +
                ", sysType=" + sysType +
                '}';
    }
}
