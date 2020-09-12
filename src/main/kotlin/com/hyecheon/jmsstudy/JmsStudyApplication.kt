package com.hyecheon.jmsstudy

import org.apache.activemq.artemis.core.config.impl.*
import org.apache.activemq.artemis.core.server.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

@SpringBootApplication
class JmsStudyApplication

fun main(args: Array<String>) {
	val server = ActiveMQServers.newActiveMQServer(
			ConfigurationImpl()
					.setPersistenceEnabled(false)
					.setJournalDirectory("build/data/journal")
					.setSecurityEnabled(false)
					.addAcceptorConfiguration("invm", "vm://0"))

	server.start()

	runApplication<JmsStudyApplication>(*args)
}
