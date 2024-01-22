package com.shon.taskpulse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskpulseApplication

fun main(args: Array<String>) {
	runApplication<TaskpulseApplication>(*args)
}
