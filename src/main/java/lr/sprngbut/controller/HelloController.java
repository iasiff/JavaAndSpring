package lr.sprngbut.controller;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    ch.qos.logback.classic.Logger l = (ch.qos.logback.classic.Logger)log;

    @GetMapping("/get")
    @ResponseBody
    public String sayHello(){
        l.setLevel(Level.DEBUG);
        log.info("#### ==> sayHello() execution <== #### {}", LocalDateTime.now());
        log.error("error");
        log.debug("Debuging");
        log.warn("Wrning");
        return "hle";
    }
}
