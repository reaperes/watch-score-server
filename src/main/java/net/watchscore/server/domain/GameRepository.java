package net.watchscore.server.domain;

import org.springframework.data.repository.Repository;

import java.util.Collection;

/**
 * @author Namhoon
 */
interface GameRepository extends Repository<Team, Long> {
	Collection<Game> findAll();
}
