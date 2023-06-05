package com.gmiqbal.pos.service;

import com.gmiqbal.pos.dtos.responses.InvoiceResponseData;
import com.gmiqbal.pos.entities.Invoice;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    public InvoiceResponseData buildInvoiceResponseData(Invoice invoice){
        InvoiceResponseData invoiceResponseData = InvoiceResponseData.builder()
                .id(invoice.getId())
                .invoice_number(invoice.getInvoiceNumber())
                .invoice_date(invoice.getInvoiceDate())
                .customer_id(invoice.getCustomerId())
                .seller_id(invoice.getSellerId())
                .payment_status(invoice.getPaymentStatus())
                .note(invoice.getNote())
                .build();
        return invoiceResponseData;
    }
}
