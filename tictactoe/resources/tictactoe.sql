DROP TABLE IF EXISTS leaderboard CASCADE;
DROP TABLE IF EXISTS saved_game CASCADE;
DROP TABLE IF EXISTS player CASCADE;

CREATE TABLE player(
	player_id int NOT NULL,
	last_name varchar(100) NOT NULL,
	first_name varchar(100) NOT NULL,
	initials varchar(3) NOT NULL,
	email varchar(100) NOT NULL,
	phone varchar(20) NULL,
	date_of_birth date NOT NULL,
	number_of_wins int NOT NULL,
	CONSTRAINT PK_player PRIMARY KEY (player_id)
);

CREATE TABLE leaderboard (
	leaderboard_id int NOT NULL,
	player_id int UNIQUE NOT NULL,
	number_of_wins int NOT NULL,
	date_time timestamp NOT NULL,
	CONSTRAINT PK_leaderboard PRIMARY KEY (leaderboard_id),
	CONSTRAINT FK_player_leaderboard FOREIGN KEY (player_id) REFERENCES player (player_id)
);

CREATE TABLE saved_game (
	saved_game_id int NOT NULL,
	game_state varchar(100) NOT NULL,
	date_time timestamp NOT NULL,
	player_id int UNIQUE NOT NULL,
	CONSTRAINT PK_saved_game PRIMARY KEY (saved_game_id),
	CONSTRAINT FK_player_saved_game FOREIGN KEY (player_id) REFERENCES player (player_id)
);

-- ALTER TABLE player
-- ADD CONSTRAINT FK_player_saved_game FOREIGN KEY (player_id) REFERENCES saved_game (player_id),
-- ADD 
	
INSERT INTO player (player_id, last_name, first_name, initials,	email, phone, date_of_birth, number_of_wins)
VALUES
    (1, 'Tarantino', 'Quentin', 'QT', 'quentin.tarantino@gmail.com', '(323) 555-1234', '1963-03-27', 0),
    (2, 'Mozart', 'Amadeus', 'AM', 'amadeus.mozart@gmail.com', '(323) 555-1235', '1756-01-27', 0),
    (3, 'Pollock', 'Jackson', 'JP', 'jackson.pollock@gmail.com', '(323) 555-1236', '1912-01-28', 0),
    (4, 'Coppola', 'Sofia', 'SC', 'sofia.coppola@gmail.com', '(323) 555-1237', '1971-05-14', 0),
    (5, 'Beethoven', 'Ludwig', 'LB', 'ludwig.beethoven@gmail.com', '(323) 555-1238', '1770-12-17', 0),
    (6, 'O`Keeffe', 'Georgia', 'GO', 'georgia.okeeffe@gmail.com', '(323) 555-1239', '1887-11-15', 0),
    (7, 'Kubrick', 'Stanley', 'SK', 'stanley.kubrick@gmail.com', '(323) 555-1240', '1928-07-26', 0),
    (8, 'Monet', 'Claude', 'CM', 'claude.monet@gmail.com', '(323) 555-1241', '1840-11-14', 0);

INSERT INTO leaderboard (leaderboard_id, player_id, number_of_wins, date_time)
VALUES
    (1, 5, 25, '1780-12-17 04:05:06'),
    (2, 7, 22, '1938-07-26 04:05:06');
	
INSERT INTO saved_game (saved_game_id, game_state, date_time, player_id)
    VALUES
    (1, 'placeholder game state 1', '2023-12-17 04:05:06', 3),
    (2, 'placeholder game state 2', '2023-06-15 04:05:06', 8);




SELECT * FROM player;
SELECT * FROM high_score;
SELECT * FROM saved_game;


--/*** join tables ***/
--CREATE TABLE member_event (
--	member_id int NOT NULL,
--	event_id int NOT NULL,
--	CONSTRAINT PK_member_event PRIMARY KEY (member_id, event_id),
--	CONSTRAINT FK_member_event_member FOREIGN KEY (member_id) REFERENCES member (member_id),
--	CONSTRAINT FK_member_event_event FOREIGN KEY (event_id) REFERENCES event (event_id)
--);
--
--CREATE TABLE member_group (
--	member_id int NOT NULL,
--	group_id int NOT NULL,
--	CONSTRAINT PK_member_group PRIMARY KEY (member_id, group_id),
--	CONSTRAINT FK_member_group_member FOREIGN KEY (member_id) REFERENCES member (member_id),
--	CONSTRAINT FK_member_group_group FOREIGN KEY (group_id) REFERENCES interestGroup (group_id)
--);


--ADD CONSTRAINT CHK_duration CHECK (duration_minutes >= 30);

--     'Marvel Movie Marathon', 'A weekend marathon of all Marvel Cinematic Universe movies.', '2024-04-21 10:00:00', 1440, 1),
--    (2, 'Beethoven Symphony Showcase', 'Enjoy a night of Beethoven`s best symphonies.', '2024-04-22 19:00:00', 180, 2),
--    (3, 'Abstract Art Exhibition', 'Exclusive tour through the latest in abstract modern art.', '2024-04-23 16:00:00', 120, 3),
--    (4, 'Indie Film Screening', 'Screening of award-winning indie films.', '2024-04-24 18:00:00', 90, 1);







