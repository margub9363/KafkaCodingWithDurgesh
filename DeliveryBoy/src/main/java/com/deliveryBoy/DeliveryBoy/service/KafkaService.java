package com.deliveryBoy.DeliveryBoy.service;

import com.deliveryBoy.DeliveryBoy.config.AppConstants;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service

public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String > kafkaTemplate;
//    private Logger logger = (Logger) LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
//        this.logger.info("message produced");
        System.out.println("message produced");
        return true;
    }
}
