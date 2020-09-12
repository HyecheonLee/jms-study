package com.hyecheon.jmsstudy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JmsStudyApplication

fun main(args: Array<String>) {
	runApplication<JmsStudyApplication>(*args)
}
