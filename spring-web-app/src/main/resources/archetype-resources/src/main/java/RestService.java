package $package;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class RestService {

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "OK";
    }

}
