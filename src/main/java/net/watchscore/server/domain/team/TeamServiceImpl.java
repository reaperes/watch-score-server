package net.watchscore.server.domain.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * @author Namhoon
 */
@Service("teamService")
@Transactional
public class TeamServiceImpl implements TeamService {
	@Autowired
	private TeamRepository repository;

	public Collection<Team> findAll() {
		return repository.findAll();
	}
}
