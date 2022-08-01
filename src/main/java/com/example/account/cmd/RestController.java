package com.example.account.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "crateEvent")
public class RestController {
    @Autowired
    AccountEventProducer eventProducer;

    @PostMapping
    public ResponseEntity<String> openAccount(@RequestBody Command command) {
        try {
            ConcreteEvennt evennt = new ConcreteEvennt(command.getName(), command.getId());
            eventProducer.produce("customE", command);
            return new ResponseEntity<>("completed", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>("made a bad request ", HttpStatus.BAD_REQUEST);
        }


    }

}
