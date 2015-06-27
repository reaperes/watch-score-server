package net.watchscore.server.domain.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * @author Namhoon
 */
@Service("gameService")
@Transactional
public class GameServiceImpl implements GameService {
	@Autowired
	private GameRepository repository;

	public Collection<Game> findAll() {
		return repository.findAll();
	}
}
