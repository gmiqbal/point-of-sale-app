ALTER TABLE `product`
    ADD COLUMN `master_category_id` INT UNSIGNED,
    ADD FOREIGN KEY (`master_category_id`) REFERENCES `master_category`(`id`);