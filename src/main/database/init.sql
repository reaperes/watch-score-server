DROP DATABASE IF EXISTS watch_score;
CREATE DATABASE watch_score;

CREATE TABLE team (
  id   INT AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT team_name_unique UNIQUE (name)
) ENGINE = InnoDB;

CREATE TABLE game (
  id   INT AUTO_INCREMENT,
  date DATETIME,
  home INT,
  away INT,
  state VARCHAR(10) COMMENT 'BEFORE, PLAYING, END',
  PRIMARY KEY (id)
) ENGINE = InnoDB;

-- ------------
-- Team data

INSERT INTO team(name) VALUES('삼성');
INSERT INTO team(name) VALUES('NC');
INSERT INTO team(name) VALUES('두산');
INSERT INTO team(name) VALUES('넥센');
INSERT INTO team(name) VALUES('한화');
INSERT INTO team(name) VALUES('SK');
INSERT INTO team(name) VALUES('KIA');
INSERT INTO team(name) VALUES('롯데');
INSERT INTO team(name) VALUES('LG');
INSERT INTO team(name) VALUES('KT');

-- --------------------
-- Games data (sample)
--
-- INSERT INTO `game` (`id`,`date`,`home`,`away`,`state`) VALUES (1,'2015-06-28 19:36:10',2,9,'PLAYING');
-- INSERT INTO `game` (`id`,`date`,`home`,`away`,`state`) VALUES (2,'2015-06-28 19:36:32',5,6,'PLAYING');
-- INSERT INTO `game` (`id`,`date`,`home`,`away`,`state`) VALUES (3,'2015-06-28 19:36:41',10,1,'PLAYING');
-- INSERT INTO `game` (`id`,`date`,`home`,`away`,`state`) VALUES (4,'2015-06-28 19:36:51',3,7,'PLAYING');
-- INSERT INTO `game` (`id`,`date`,`home`,`away`,`state`) VALUES (5,'2015-06-28 19:37:01',4,8,'PLAYING');