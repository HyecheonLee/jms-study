package com.hyecheon.jmsstudy.config

import org.springframework.context.annotation.*
import org.springframework.core.task.*
import org.springframework.scheduling.annotation.*

@EnableScheduling
@EnableAsync
@Configuration
class TaskConfig {

	@Bean
	fun taskExecutor() = run {
		SimpleAsyncTaskExecutor()
	}

}
