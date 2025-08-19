INSERT INTO cinephile (name) VALUES ('Bartek');
INSERT INTO cinephile (name) VALUES ('Paulina');
INSERT INTO cinephile (name) VALUES ('Alex');


INSERT INTO movie (title, director, genre) VALUES ('Harry Potter and the Philosophers Stone', 'Chris Columbus', 'fantasy');
INSERT INTO movie (title, director, genre) VALUES ('Se7en', 'David Fincher', 'thriller');
INSERT INTO movie (title, director, genre) VALUES ('Fight Club', 'David Fincher', 'thriller');
INSERT INTO movie (title, director, genre) VALUES ('Oppenheimer', 'Christopher Nolan', 'biography');

INSERT INTO review (movie_id, user_id, rating) VALUES (4, 1, 6.0);
INSERT INTO review (movie_id, user_id, rating) VALUES (4, 2, 8.0);
INSERT INTO review (movie_id, user_id, rating) VALUES (4, 3, 9.0);
INSERT INTO review (movie_id, user_id, rating) VALUES (1, 1, 10.0);
INSERT INTO review (movie_id, user_id, rating) VALUES (2, 1, 6.0);
INSERT INTO review (movie_id, user_id, rating) VALUES (2, 2, 3.5);
INSERT INTO review (movie_id, user_id, rating) VALUES (3, 3, 2.0);
INSERT INTO review (movie_id, user_id, rating) VALUES (3, 1, 1.0);

INSERT INTO cinephile_favourites (cinephile_id, favourites_id) VALUES (1, 1);
INSERT INTO cinephile_favourites (cinephile_id, favourites_id) VALUES (1, 4);
INSERT INTO cinephile_favourites (cinephile_id, favourites_id) VALUES (2, 2);
INSERT INTO cinephile_favourites (cinephile_id, favourites_id) VALUES (2, 3);