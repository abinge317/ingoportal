package com.ingo.portal.controller;

import com.ingo.portal.entity.BasicInfo;
import com.ingo.portal.repository.BasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by jbpeng on 18-3-26.
 */
@Controller
public class BasicInfoController {

    @Autowired
    BasicInfoRepository basicInfoRepository;

    @RequestMapping("/view2-2.html")
    String contactus(Map<String, Object> model) {
        Integer id = Integer.valueOf(1);
        BasicInfo basicInfo = basicInfoRepository.findBasicInfoById(id);
        model.put("basicInfo", basicInfo);
        return "view2-2";
    }

}
