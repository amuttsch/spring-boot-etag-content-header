package com.example.springboot

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.filter.ShallowEtagHeaderFilter

@Component
class EtagFilter {
    @Bean
    fun shallowEtagHeaderFilter(): FilterRegistrationBean<ShallowEtagHeaderFilter> {
        val bean = FilterRegistrationBean(ShallowEtagHeaderFilter())
        bean.addUrlPatterns("/test")
        bean.setName("etagFilter")
        return bean
    }
}