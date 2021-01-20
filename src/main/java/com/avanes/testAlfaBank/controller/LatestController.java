package com.avanes.testAlfaBank.controller;

import com.avanes.testAlfaBank.model.LatestModel;
import com.avanes.testAlfaBank.service.LatestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LatestController {
    @Value("${latest.app_id}")
    private String appId;
    @Value("${latest.base}")
    private String base;


    private final LatestService latestService;

    @Autowired
    public LatestController(LatestService latestService) {
        this.latestService = latestService;
    }


    @GetMapping("/app")
    @ResponseBody
    public String app() {
        LatestModel latestModel = latestService.getLatest(appId, base);
        System.out.println(latestModel.getTimestamp());
        return latestModel.toString();

    }


}

