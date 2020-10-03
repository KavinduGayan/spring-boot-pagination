package com.easyittech.jpapagination.service.impl;

import com.easyittech.jpapagination.domain.TransactionResult;
import com.easyittech.jpapagination.repository.TransactionRepository;
import com.easyittech.jpapagination.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public Page<TransactionResult> getAll() {
        Pageable pageable = PageRequest.of(1, 10, Sort.by("code"));
        return transactionRepository.findAll(pageable);
    }

    @Override
    public Page<TransactionResult> getAllNativeQuery() {
        Pageable pageable = PageRequest.of(1, 10, Sort.by("code"));
        return transactionRepository.findAllNativeQuery(pageable);
    }
}
