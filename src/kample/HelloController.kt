package kample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController @Autowired constructor(val helloRepo: HelloRepository) {

    @RequestMapping("/")
    fun hello(): Hello {
        val name = helloRepo.get()

        return Hello(name)
    }
}


@Component
class HelloRepository {

    fun get(): String {
        return "Jimmy"
    }

}

class Hello(name: String) {
    val hello = "hi " + name
    val bye = "bye " + name
}
