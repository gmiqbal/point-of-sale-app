package com.gmiqbal.pos.repos;

import com.gmiqbal.pos.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
}
