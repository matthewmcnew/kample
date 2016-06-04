package kample

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping("/")
    fun hello(): Hello {
        return Hello("how are you?")
    }
}

data class Hello(val message: String)
