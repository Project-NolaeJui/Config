package kan9hee.nolaejui_config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class NolaejuiConfigApplication

fun main(args: Array<String>) {
	runApplication<NolaejuiConfigApplication>(*args)
}
