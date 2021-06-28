package com.example.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.example.shoppingservice.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    public List<Invoice> findByCustomerId(Long customerId );
    public Invoice findByNumberInvoice(String numberInvoice);
}
