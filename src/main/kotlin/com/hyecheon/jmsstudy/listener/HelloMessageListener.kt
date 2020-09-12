package com.hyecheon.jmsstudy.listener

import com.hyecheon.jmsstudy.config.*
import com.hyecheon.jmsstudy.model.*
import org.springframework.jms.annotation.*
import org.springframework.messaging.*
import org.springframework.messaging.handler.annotation.*
import org.springframework.stereotype.*
import javax.jms.Message

@Component
class HelloMessageListener {

	@JmsListener(destination = JmsConfig.MY_QUEUE)
	fun listen(@Payload helloWorldMessage: HelloWorldMessage,
	           @Headers headers: MessageHeaders,
	           message: Message) {
		println("I Get a Message!!!!")
		println(helloWorldMessage)

//		throw RuntimeException("foo")
	}
}