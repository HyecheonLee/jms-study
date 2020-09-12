package com.hyecheon.jmsstudy.sender

import com.hyecheon.jmsstudy.config.*
import com.hyecheon.jmsstudy.model.*
import org.springframework.jms.core.*
import org.springframework.scheduling.annotation.*
import org.springframework.stereotype.*
import java.util.*

@Component
class HelloSender(val jmsTemplate: JmsTemplate) {


	@Scheduled(fixedDelay = 2000)
	fun sendMessage() {
		println("I'm Sending a message")

		val message = HelloWorldMessage(UUID.randomUUID(), message = "Hello World!")

		jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE, message)
		println("Message Sent!")
	}

}