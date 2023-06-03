CREATE TABLE invoice (
     id INT AUTO_INCREMENT PRIMARY KEY,
     invoice_number INT NOT NULL,
     invoice_date DATE,
     customer_id INT NOT NULL,
     seller_id INT NOT NULL,
     payment_status VARCHAR(255),
     note VARCHAR(255)
);
