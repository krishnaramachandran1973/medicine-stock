package com.cts.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.domain.MedicineStock;
import com.cts.service.MedicineStockService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MedicineStockController {

	private final MedicineStockService service;

	@GetMapping("/medicineStockInformation")
	public ResponseEntity<?> medicineStock() {
		List<MedicineStock> medicineStock = service.getMedicineStock();
		return medicineStock.size() > 0 ? ResponseEntity.ok(medicineStock)
				: ResponseEntity.noContent()
						.build();
	}

}
