package com.hand.exam1.resolver;

import com.hand.exam1.anno.AnnPage;
import com.hand.exam1.pojo.Page;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
@Component
public class MyHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(AnnPage.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
        Page page = new Page();
        try {
            page.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
            page.setPage(Integer.parseInt(request.getParameter("page")));
            System.out.println(page);
            return page;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
