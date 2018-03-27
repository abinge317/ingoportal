package com.ingo.portal.util;

import com.ingo.portal.entity.BasicInfo;
import com.ingo.portal.repository.BasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by jbpeng on 18-3-28.
 */

@WebListener
public class ApplicationInitConfig implements ServletContextListener {

    @Autowired
    BasicInfoRepository basicInfoRepository;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String servletContextName = servletContextEvent.getServletContext().getServletContextName();
        Integer id = Integer.valueOf(1);
        BasicInfo basicInfo = basicInfoRepository.findBasicInfoById(id);
        servletContextEvent.getServletContext().setAttribute("basicInfo", basicInfo);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
