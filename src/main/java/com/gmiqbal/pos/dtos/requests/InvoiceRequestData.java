package com.gmiqbal.pos.dtos.requests;

import lombok.Data;
import org.hibernate.exception.DataException;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class InvoiceRequestData {
    @NotNull
    private int invoice_number;
    @NotNull
    private Date invoice_date;
    @NotNull
    private int customer_id;
    @NotNull
    private int seller_id;
    @NotNull
    private String payment_status;
    @NotNull
    private String note;
}
