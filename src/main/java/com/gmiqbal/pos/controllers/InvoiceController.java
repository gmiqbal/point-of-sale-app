package com.gmiqbal.pos.controllers;

import com.gmiqbal.pos.dtos.responses.InvoiceResponseData;
import com.gmiqbal.pos.dtos.responses.ProductResponseData;
import com.gmiqbal.pos.entities.Invoice;
import com.gmiqbal.pos.repos.InvoiceRepo;
import com.gmiqbal.pos.service.InvoiceService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/invoice")
@Data
public class InvoiceController {
    @Autowired
    InvoiceRepo invoiceRepo;
    @Autowired
    InvoiceService invoiceService;

    @GetMapping("/view")
    public List<InvoiceResponseData> viewInvoice(){
        List<Invoice> invoiceList = invoiceRepo.findAll();
        List<InvoiceResponseData> invoiceResponseDataList = new ArrayList<>();
        for (Invoice savedInvoice: invoiceList){
            InvoiceResponseData invoiceResponseData = invoiceService.buildInvoiceResponseData(savedInvoice);
            invoiceResponseDataList.add(invoiceResponseData);
        }
        return invoiceResponseDataList;
    }

}
