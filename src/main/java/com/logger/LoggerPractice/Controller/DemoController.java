package com.logger.LoggerPractice.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Logger logger= LoggerFactory.getLogger(DemoController.class);
    @GetMapping("/welcome")
        public String getWelcomeMsg(){
        logger.debug("welcome msg is executed.....");
       String msg="welcome to our page";
       try{
   int i=10/0;
       }catch (Exception e){
           logger.error("exception occured..."+e.getMessage());

       }
       return msg;

        }
}
