package com.maaloul.consumer;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maaloul.consumer.model.Meter;
import com.maaloul.consumer.repository.MeterRepository;
import com.maaloul.consumer.service.MeterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class MessageConsumer {

    @Autowired
    private MeterService meterService;

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "my-queue")
    public void listener(String message) {


        Meter meter;
        try {
            meter = new ObjectMapper().readValue(message, Meter.class);
            meterService.saveMeter(meter);
            logger.info("Message received {} ", message);
            //return ResponseEntity.ok(message);


        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //return ResponseEntity.badRequest().body("Error");
        }

    }
}