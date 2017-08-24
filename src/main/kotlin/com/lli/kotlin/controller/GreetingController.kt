package com.lli.kotlin.controller

import com.lli.kotlin.model.Greeting
import com.lli.kotlin.service.MyService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController @Autowired constructor(val myService: MyService) {

    val LOGGER: Logger = LoggerFactory.getLogger(GreetingController::class.java)

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name") name: String): Greeting {
        LOGGER.info("some log message")

        return Greeting(counter.incrementAndGet(), "Hello, ${ myService.convertName(name) }")
    }
}