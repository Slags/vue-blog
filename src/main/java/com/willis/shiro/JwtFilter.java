package com.willis.shiro;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

@Component
public class JwtFilter  extends AuthenticatingFilter {
    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {

        HttpServletRequest request= (HttpServletRequest) servletRequest;
        String jwt=request.getHeader("Authorization");
        if (StringUtils.isEmpty(jwt)){
            return null;
        }
        return new JwtToken(jwt);
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        //拦截判断
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        String jwt=request.getHeader("Authorization");
        if (StringUtils.isEmpty(jwt)){
            return true;
        }

        return false;
    }
}
