package net.watchscore.server.domain;

import org.springframework.data.repository.Repository;

import java.util.Collection;

interface TeamRepository extends Repository<Team, Integer> {
	Collection<Team> findAll();
}