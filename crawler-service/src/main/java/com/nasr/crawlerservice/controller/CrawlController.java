package com.nasr.crawlerservice.controller;

import com.nasr.crawlerservice.service.CrawlService;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CrawlController {

    @Autowired
    private CrawlService crawlService;

    @GetMapping("/crawl")
    public ResponseEntity<?> crawlDomain(@RequestParam @NotEmpty String domain) throws IOException {
        crawlService.crawl(domain);
        return ResponseEntity.ok().build();
    }
}
