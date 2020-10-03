package com.easyittech.jpapagination.repository;

import com.easyittech.jpapagination.domain.TransactionResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends PagingAndSortingRepository<TransactionResult,Long> {
    Page<TransactionResult> findAll(Pageable pageable);
    @Query(value = "SELECT * FROM transaction_result",nativeQuery = true)
    Page<TransactionResult> findAllNativeQuery(Pageable pageable);
}
