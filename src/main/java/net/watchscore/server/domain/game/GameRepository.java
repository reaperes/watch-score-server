package net.watchscore.server.domain.game;

import org.springframework.data.repository.Repository;

import java.util.Collection;

/**
 * @author Namhoon
 */
interface GameRepository extends Repository<Game, Long> {
	Collection<Game> findAll();
}
