package com.trkj.medical_care_after.interceptor;

import com.trkj.medical_care_after.util.JwtTokenUtil;
import io.jsonwebtoken.SignatureException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@Slf4j
@Component
public class TokenInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private JwtTokenUtil jwtTokenUtil;
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws SignatureException {
        /** 地址过滤，如果是以login结尾则放行 */
        String uri = request.getRequestURI() ;
        log.debug("请求地址为："+uri);
        if (uri.contains("/login")){
            return true ;
        }
        /** Token 验证,得不到则抛出异常 */
        Enumeration<String> enumeration=request.getHeaderNames();
        while(enumeration.hasMoreElements()){
            String hn=enumeration.nextElement();
            log.debug(hn+":"+request.getHeader(hn));
        }
        String token = request.getHeader(jwtTokenUtil.getHeader());
        if(StringUtils.isEmpty(token)){
            token = request.getParameter(jwtTokenUtil.getHeader());
        }
        if(StringUtils.isEmpty(token)){
            throw new SignatureException("token为空");
        }
        if(jwtTokenUtil.isTokenExpired(token))
            throw new SignatureException(jwtTokenUtil.getHeader() + "失效，请重新登录。");
        /** 设置 identityId 用户身份ID */
       // request.setAttribute("identityId", jwtTokenUtil.getUsernameFromToken(token));
        return true;
    }
}