INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('Dom Casmurro', 1899, 'Machado de Assis', 'Romance clássico brasileiro.', 'Um dos romances mais importantes da literatura brasileira, explorando temas de ciúme e memória.', 'https://m.media-amazon.com/images/I/61Z2bMhGicL._SL1360_.jpg', 'Romance');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('O Alquimista', 1988, 'Paulo Coelho', 'Uma jornada de autodescoberta.', 'A história de Santiago, um jovem pastor andaluz em busca de um tesouro.', 'https://m.media-amazon.com/images/I/81slUinjTlS._SL1500_.jpg', 'Ficção');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('Capitães da Areia', 1937, 'Jorge Amado', 'Juventude marginalizada em Salvador.', 'Retrata a vida de meninos de rua e suas lutas diárias.', 'https://m.media-amazon.com/images/I/81t7altQZxL._SL1500_.jpg', 'Drama');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('Grande Sertão: Veredas', 1956, 'João Guimarães Rosa', 'Aventura no sertão brasileiro.', 'Uma narrativa inovadora sobre o sertão e seus personagens complexos.', 'https://m.media-amazon.com/images/I/71bh8SB8R0L._SL1087_.jpg', 'Aventura');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('A Hora da Estrela', 1977, 'Clarice Lispector', 'A vida de Macabéa.', 'Um retrato sensível e profundo da existência de uma jovem nordestina no Rio de Janeiro.', 'https://m.media-amazon.com/images/I/61TaHURu27L._SL1000_.jpg', 'Romance');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('Memórias Póstumas de Brás Cubas', 1881, 'Machado de Assis', 'Narrativa pós-morte.', 'O defunto-autor narra sua própria história com ironia e crítica social.', 'https://m.media-amazon.com/images/I/71OL9RU2tJL._SL1360_.jpg', 'Romance');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('O Cortiço', 1890, 'Aluísio Azevedo', 'Vida em um cortiço carioca.', 'Uma análise social das relações e conflitos em um cortiço do Rio de Janeiro.', 'https://m.media-amazon.com/images/I/61hI7QLrTkL._SL1021_.jpg', 'Realismo');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('Vidas Secas', 1938, 'Graciliano Ramos', 'Família sertaneja em fuga da seca.', 'A luta de uma família nordestina contra a miséria e a seca.', 'https://m.media-amazon.com/images/I/71NYL2AbBIL._SL1500_.jpg', 'Drama');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ('Senhora', 1875, 'José de Alencar', 'Romance de interesse e poder.', 'A história de Aurélia Camargo e suas escolhas em um casamento por interesse.', 'https://m.media-amazon.com/images/I/711tJRe6LML._SL1360_.jpg', 'Romance');
INSERT INTO books (title, year_of_publication, author, short_description, long_description, image_url, genre) VALUES ( 'Iracema', 1865, 'José de Alencar', 'Lenda indígena brasileira.', 'O amor entre o colonizador Martim e a índia Iracema, símbolo da formação do povo brasileiro.', 'https://m.media-amazon.com/images/I/71LCDi6E2oL._SL1500_.jpg', 'Romance');

INSERT INTO book_list (name) VALUES ('Clássicos Brasileiros');
INSERT INTO book_list (name) VALUES ('Romances e Aventuras');

-- Clássicos Brasileiros: Dom Casmurro, Memórias Póstumas de Brás Cubas, O Cortiço, Senhora, Iracema
INSERT INTO belonging (book_id, book_list_id, position) VALUES (1, 1, 0);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (6, 1, 1);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (7, 1, 2);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (9, 1, 3);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (10, 1, 4);

-- Romances e Aventuras: O Alquimista, Capitães da Areia, Grande Sertão: Veredas, A Hora da Estrela, Vidas Secas
INSERT INTO belonging (book_id, book_list_id, position) VALUES (2, 2, 0);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (3, 2, 1);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (4, 2, 2);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (5, 2, 3);
INSERT INTO belonging (book_id, book_list_id, position) VALUES (8, 2, 4);