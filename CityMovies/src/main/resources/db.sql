-- Добавление городов
INSERT INTO citRequestDto (name) VALUES
                            ('Rostov-na-Donu'),
                            ('Saint Petersburg'),
                            ('Kazan'),
                            ('Novosibirsk');

-- Добавление фильмов
INSERT INTO movies (title, city_id) VALUES
                                       ('Avatar', (SELECT id FROM cityRequestDto WHERE name = 'Rostov-na-Donu')),
                                       ('Inception', (SELECT id FROM cityRequestDto WHERE name = 'Moscow')),
                                       ('Titanic', (SELECT id FROM cityRequestDto WHERE name = 'Saint Petersburg')),
                                       ('Interstellar', (SELECT id FROM cityRequestDto WHERE name = 'Kazan')),
                                       ('The Matrix', (SELECT id FROM cityRequestDto WHERE name = 'Novosibirsk'));