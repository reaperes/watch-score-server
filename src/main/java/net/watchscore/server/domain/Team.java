package net.watchscore.server.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Namhoon
 */
@Entity
@Data
public class Team {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String name;
}
