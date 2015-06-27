package net.watchscore.server.domain.game;

import net.watchscore.server.domain.team.Team;
import org.springframework.data.repository.Repository;

import java.util.Collection;

/**
 * @author Namhoon
 */
interface GameRepository extends Repository<Team, Long> {
	Collection<Game> findAll();
}
