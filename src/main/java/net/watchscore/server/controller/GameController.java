package net.watchscore.server.controller;

import net.watchscore.server.domain.game.Game;
import net.watchscore.server.domain.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Namhoon
 */
@RestController
@RequestMapping("/games")
public class GameController {
	@Autowired
	private GameService gameService;

	@RequestMapping(method = RequestMethod.GET, value = { "", "/" })
	public @ResponseBody Collection<Game> index() {
		return gameService.findAll();
	}
}
