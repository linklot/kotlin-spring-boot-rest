package com.lli.kotlin

import com.lli.kotlin.config.DevelopmentConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(DevelopmentConfiguration::class)
@ConfigurationProperties
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}