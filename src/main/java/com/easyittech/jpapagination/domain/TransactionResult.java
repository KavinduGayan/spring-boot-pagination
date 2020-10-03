package com.easyittech.jpapagination.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class TransactionResult {
    @Id
    private Long id;
    private String code;
    private String description;
    @Column(name = "request_time")
    private String requestTime;
    @Column(name = "response_time")
    private String responseTime;
    private String status;
    @Column(name="wallet_transaction_id")
    private Long walletransactionId;

}
