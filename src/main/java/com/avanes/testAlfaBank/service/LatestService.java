package com.avanes.testAlfaBank.service;

import com.avanes.testAlfaBank.model.LatestModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://openexchangerates.org", name = "Latest-Service")
public interface LatestService {


    @RequestMapping(method = RequestMethod.GET, path = "/api/latest.json")
     LatestModel getLatest(@RequestParam(name = "app_id") String app_id, @RequestParam(name = "base") String base);


}
