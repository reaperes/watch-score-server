DROP DATABASE IF EXISTS watch_score;
CREATE DATABASE watch_score;

CREATE TABLE team (
  id   INT,
  name VARCHAR(10) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT team_name_unique UNIQUE (name)
) ENGINE = InnoDB;

-- ------------
-- Team data

INSERT INTO team(name) VALUES('LG');