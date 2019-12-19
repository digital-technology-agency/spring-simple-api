package dta.springsimpleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringSimpleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSimpleApiApplication.class, args);
    }

    @RequestMapping(value = "", produces = "application/json")
    public Map get() {
        final Map result = new HashMap<>();
        result.put("state", "ok");
        result.put("version", 1);
        return result;
    }

}
