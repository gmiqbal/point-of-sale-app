CREATE TABLE IF NOT EXISTS `user` (
      `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
      `first_name` VARCHAR(255) NOT NULL,
    `last_name` VARCHAR(255) NOT NULL,
    `username` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL UNIQUE,
    `password` VARCHAR(255) NOT NULL
    );
