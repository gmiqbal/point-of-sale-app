CREATE TABLE invoice_item (
  id INT AUTO_INCREMENT PRIMARY KEY,
  product_id INT NOT NULL,
  product_name VARCHAR(255),
  discount_amount DECIMAL(10, 2),
  product_rate DECIMAL(10, 2),
  product_quantity INT NOT NULL,
  total_amount DECIMAL(10, 2),
  note VARCHAR(255)
);