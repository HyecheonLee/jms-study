package com.hyecheon.jmsstudy.model

import java.io.*
import java.util.*

data class HelloWorldMessage(
		val id: UUID? = null,
		val message: String? = null) : Serializable {
	companion object {
		private const val serialVersionUID = 20_180_617_104_400L
	}
}