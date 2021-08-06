package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.domain.MedicineStock;

public interface MedicineStockRepository extends JpaRepository<MedicineStock, Long> {
}
