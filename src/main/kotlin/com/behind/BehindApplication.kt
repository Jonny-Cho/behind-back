package com.behind

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BehindApplication

fun main(args: Array<String>) {
    runApplication<BehindApplication>(*args)
}
