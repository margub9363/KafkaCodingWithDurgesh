package com.deliveryBoy.DeliveryBoy.controller;

import com.deliveryBoy.DeliveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;
    @GetMapping("/update")
    public ResponseEntity<?> updateLocation(){
        kafkaService.updateLocation("("+Math.random()*100+","+Math.random()*100+")");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
