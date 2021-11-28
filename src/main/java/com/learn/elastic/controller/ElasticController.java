package com.learn.elastic.controller;

import com.learn.elastic.entity.Product;
import com.learn.elastic.service.SpringDataProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ElasticController {

    @Autowired
    private SpringDataProductServiceImpl productService;

    @PostMapping(value = "/product/create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> created(@RequestBody Product product) {
        productService.createProduct(product);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
