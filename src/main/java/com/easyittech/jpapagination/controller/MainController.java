package com.easyittech.jpapagination.controller;

import com.easyittech.jpapagination.domain.TransactionResult;
import com.easyittech.jpapagination.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report")
public class MainController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transaction-result")
    public ResponseEntity<Page<TransactionResult>> getTransactionResult() {
        return new ResponseEntity<>(transactionService.getAll(), HttpStatus.ACCEPTED);
    }
    @GetMapping("/transaction-result-native")
    public ResponseEntity<Page<TransactionResult>> getTransactionResultNative() {
        return new ResponseEntity<>(transactionService.getAllNativeQuery(), HttpStatus.ACCEPTED);
    }
}
