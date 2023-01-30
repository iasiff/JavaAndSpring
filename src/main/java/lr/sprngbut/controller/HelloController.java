package lr.sprngbut.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/get")
    @ResponseBody
    public String sayHello(){
        log.info("#### ==> sayHello() execution <== #### {}", LocalDateTime.now());
        return "hello";
    }
}
