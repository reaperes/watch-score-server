package net.watchscore.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Namhoon
 */
@RestController
public class HealthCheckController {
	@RequestMapping("/ping")
	public String index() {
		return "pong";
	}
}
