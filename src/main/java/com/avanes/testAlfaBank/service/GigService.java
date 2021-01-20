package com.avanes.testAlfaBank.service;

import com.avanes.testAlfaBank.model.LatestModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "api.giphy.com/v1/gifs/trending?", name = "Gif-service")
public interface GigService {

    @RequestMapping(method = RequestMethod.GET, path = "/api/latest.json")
    LatestModel getLatest(@RequestParam(name = "app_id") Object[] app_id);




}
