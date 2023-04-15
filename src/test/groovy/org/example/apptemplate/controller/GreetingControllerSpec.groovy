package org.example.apptemplate.controller


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class GreetingControllerSpec extends Specification {

    @Autowired
    GreetingController greetingController

    def "context test"() {
        expect:
        greetingController != null
    }
}
