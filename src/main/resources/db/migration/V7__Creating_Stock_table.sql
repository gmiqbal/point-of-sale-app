CREATE TABLE IF NOT EXISTS `stock` (
   `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   `manufacturing_date` DATE NOT NULL,
   `expiration_date` DATE NOT NULL,
   `purchase_price` DOUBLE NOT NULL,
   `sale_price` DOUBLE NOT NULL
);
