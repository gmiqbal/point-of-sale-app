package com.gmiqbal.pos.dtos.responses;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class InvoiceResponseData {
    private int id;
    private int invoice_number;
    private Date invoice_date;
    private int customer_id;
    private int seller_id;
    private String payment_status;
    private String note;
}
