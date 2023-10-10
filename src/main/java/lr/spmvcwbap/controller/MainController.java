package lr.spmvcwbap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private static final Logger log = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String getIndex() {
        log.info("INFOOOOO");
        log.error("ERROR");
        log.warn("WARN");
        log.debug("DEBUG");
        return "index";
    }

    @GetMapping("/a")
    public String getAb() {

        return "ab";
    }
}
