package com.lli.kotlin.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class MyServiceImpl constructor(@Value("\${system.env:test}") val env: String) : MyService {

    override final fun convertName(name: String) = name.toUpperCase() +" "+ env
}