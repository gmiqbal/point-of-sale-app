ALTER TABLE `product`
    ADD CONSTRAINT fk_product_master_category
        FOREIGN KEY (`master_category_id`)
            REFERENCES `master_category`(`id`);

