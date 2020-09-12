package com.hyecheon.jmsstudy.config

import org.springframework.context.annotation.*
import org.springframework.jms.support.converter.*

@Configuration
class JmsConfig {

	@Bean
	fun messageConverter(): MessageConverter {
		val converter = MappingJackson2MessageConverter()
		converter.setTargetType(MessageType.TEXT)
		converter.setTypeIdPropertyName("_type")
		return converter
	}

	companion object {
		const val MY_QUEUE = "my-hello-world"
	}
}