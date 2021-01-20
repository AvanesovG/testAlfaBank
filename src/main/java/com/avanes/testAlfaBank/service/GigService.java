package com.avanes.testAlfaBank.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "api.giphy.com/v1/gifs/trending?", name = "Gif-service")
public interface GigService {
}
