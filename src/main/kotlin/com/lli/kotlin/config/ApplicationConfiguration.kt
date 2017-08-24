package com.lli.kotlin.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.annotation.PropertySource

@Configuration
@Profile("development")
@PropertySource("classpath:/properties/development-environment-variables.properties")
class DevelopmentConfiguration

