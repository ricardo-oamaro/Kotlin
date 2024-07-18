package br.com.alura.forum

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
//@EntityScan("br.com.alura.forum.model")
//@EnableJpaRepositories("br.com.alura.forum.repository")
class ForumApplication

fun main(args: Array<String>) {
	runApplication<ForumApplication>(*args)
}
