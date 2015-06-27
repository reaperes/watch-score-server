package net.watchscore.server.domain;

import java.util.Collection;

/**
 * @author Namhoon
 */
public interface GameService {
	Collection<Game> findAll();
}
