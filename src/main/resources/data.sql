insert ignore into config_name (id, name) values
  (1, 'timeMode'),
  (2, 'timezone'),
  (3, 'brightnessStart'),
  (4, 'brightnessEnd'),
  (5, 'brightnessIdle'),
  (6, 'cityWeather'),
  (7, 'tempMax'),
  (8, 'tempMin'),
  (9, 'humidityMax'),
  (10, 'humidityMin');

insert ignore into config (id, user_id, config_name_id, config_value) values
  (1, 1, 1, 'true'),
  (2, 1, 2, 'America/New_York'),
  (3, 1, 3, '9'),
  (4, 1, 4, '18'),
  (5, 1, 5, '30'),
  (6, 1, 6, 'Montreal'),
  (7,1, 7, '30'),
  (8,1, 8, '20'),
  (9,1, 9, '50'),
  (10,1, 10, '30'),
  (11, 2, 1, 'true'),
  (12, 2, 2, 'America/New_York'),
  (13, 2, 3, '10'),
  (14, 2, 4, '12'),
  (15, 2, 5, '34'),
  (16, 2, 6, 'Montreal'),
  (17,2, 7, '30'),
  (18,2, 8, '20'),
  (19,2, 9, '50'),
  (20,2, 10, '30');

