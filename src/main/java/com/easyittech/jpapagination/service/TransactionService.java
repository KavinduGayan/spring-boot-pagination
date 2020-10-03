package com.easyittech.jpapagination.service;

import com.easyittech.jpapagination.domain.TransactionResult;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TransactionService {
    Page<TransactionResult> getAll();
    Page<TransactionResult> getAllNativeQuery();
}
