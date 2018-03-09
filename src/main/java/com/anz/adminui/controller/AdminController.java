/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anz.adminui.controller;

import com.anz.adminui.domain.XeDeals;
import com.anz.adminui.repository.XeDealsRepository;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 631713
 */
@RestController
public class AdminController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
    
    @Autowired
    private XeDealsRepository dealsRepository;
    
    
    @RequestMapping(value="/xe/deals", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map> getXeDeals() {
        
        LOGGER.info("Received request to get a quote");
        
        Iterable<XeDeals> deals = dealsRepository.findAll();
        
        Map<String, Iterable<XeDeals>> map = new ConcurrentHashMap<>();
        
        map.put("deals", deals);
        
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
