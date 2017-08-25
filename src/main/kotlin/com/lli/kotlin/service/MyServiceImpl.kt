package com.lli.kotlin.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class MyServiceImpl(@Value("\${system.env:test}") env: String) : MyService {

    private val innerEnv = env

    override final fun convertName(name: String) = name.toUpperCase() + " " + this.innerEnv
}