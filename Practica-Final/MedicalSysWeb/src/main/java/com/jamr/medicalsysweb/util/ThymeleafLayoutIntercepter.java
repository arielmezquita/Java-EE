/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamr.medicalsysweb.util;

import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


/**
 *
 * @author -adm-jmezquita
 */
public class ThymeleafLayoutIntercepter extends HandlerInterceptorAdapter {
    private static final String DEFAULT_LAYOUT= "layout/main";
    private static final String DEFAULT_VIEW_ATTRIBUTE_NAME="view";

    private String defaultTemplate=DEFAULT_LAYOUT;
    private String viewAttributeName=DEFAULT_VIEW_ATTRIBUTE_NAME;


    public void setDefaultTemplate(String defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public void setViewAttributeName(String viewAttributeName) {
        this.viewAttributeName = viewAttributeName;
    }


    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        if(modelAndView==null || !modelAndView.hasView()) {
            return;
        }


        String originalViewName=modelAndView.getViewName();

        if(isRedirectOrForward(originalViewName)) {
            return;
        }


        String layoutName=getLayout(handler);
        modelAndView.setViewName(layoutName);
        modelAndView.addObject(this.viewAttributeName,originalViewName);

    }


    private boolean isRedirectOrForward(String viewName) {
        return viewName.startsWith("redirect:") || viewName.startsWith("forward:");
    }

    private String getLayout(Object handler) {
        HandlerMethod handlerMethod=(HandlerMethod) handler;
        Layout layout=getMethodOrTypeAnnotation(handlerMethod,Layout.class);

        if(layout==null)
            return this.defaultTemplate;

        return  layout.value();
    }

    private <A extends Annotation> A getMethodOrTypeAnnotation(HandlerMethod handlerMethod, Class<A> annotationType) {
        A annotation=handlerMethod.getMethodAnnotation(annotationType);
        if(annotation==null) {
            return handlerMethod.getBeanType().getAnnotation(annotationType);
        }
        return annotation;
    }
}
