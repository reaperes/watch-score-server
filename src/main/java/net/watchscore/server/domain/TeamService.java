package net.watchscore.server.domain;

import java.util.Collection;

/**
 * @author Namhoon
 */
public interface TeamService {
	Collection<Team> findAll();
}