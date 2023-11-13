package com.deliveryboy.Controller;

import com.deliveryboy.service.kafkaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class LocationController {
    private kafkaService kafkaservice;
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){
        for(int i=1;i<=1000000;i++) {
            this.kafkaservice.updateLocation("( " + Math.floor(Math.random() * 100) + "," + Math.floor(Math.random() * 100) + ")");
        }
      return new ResponseEntity<>(Map.of("message","Location Updated "), HttpStatus.OK);
    }
}
