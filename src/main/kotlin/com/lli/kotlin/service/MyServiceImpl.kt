package com.lli.kotlin.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class MyServiceImpl(@Value("\${system.env:test}") env: String) : MyService {

    private val innerEnv = env

    override final fun convertName(name: String): String {
        require(name.length > 1, { "name length should be greater than 1" })
        if (name == "abc") {
            throw Exception("name $name is invalid")
        }

        return name.toUpperCase() + " " + this.innerEnv
    }
}