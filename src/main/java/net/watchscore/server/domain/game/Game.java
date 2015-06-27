package net.watchscore.server.domain.game;

import lombok.Data;
import net.watchscore.server.domain.team.Team;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Namhoon
 */
@Entity
@Data
public class Game {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column
	private Team home;

	@Column
	private Team away;

	@Column
	@Enumerated(EnumType.STRING)
	private GameState state;
}
