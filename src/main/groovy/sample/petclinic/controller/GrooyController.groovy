package sample.petclinic.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


/**
 * Created by Administrator on 2015-03-16.
 */

@RestController
class GrooyController {
    @RequestMapping("/home")
    def home(){
        "hello world"
    }
}
