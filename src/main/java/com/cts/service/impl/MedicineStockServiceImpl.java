package com.cts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.domain.MedicineStock;
import com.cts.repository.MedicineStockRepository;
import com.cts.service.MedicineStockService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MedicineStockServiceImpl implements MedicineStockService {

	private final MedicineStockRepository repository;

	@Override
	public List<MedicineStock> getMedicineStock() {
		return repository.findAll();
	}

}
