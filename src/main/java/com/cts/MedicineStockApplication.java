package com.cts;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.cts.domain.MedicineStock;
import com.cts.repository.MedicineStockRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class MedicineStockApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicineStockApplication.class, args);
	}

	@Bean
	CommandLineRunner init(MedicineStockRepository repo) {
		return args -> {

			Arrays.asList(MedicineStock.builder()
					.name("Clopilet")
					.chemicalComposition("Aspirin, Clopidogrel")
					.targetAilment("Blood Clot")
					.dateOfExpiry(LocalDate.of(2022, 10, 10))
					.numberOfTabletsInStock(100)
					.build(),

					MedicineStock.builder()
							.name("Paracetamol")
							.chemicalComposition("4-Aminophenol, Acetic anhydride")
							.targetAilment("Fever")
							.dateOfExpiry(LocalDate.of(2022, 10, 10))
							.numberOfTabletsInStock(100)
							.build(),

					MedicineStock.builder()
							.name("Covaxin")
							.chemicalComposition(
									"Aluminium Hydroxide Gel, L-Histidine, Polysorbate 80, Ethanol, Sucrose, Sodium chloride")
							.targetAilment("Covid-19")
							.dateOfExpiry(LocalDate.of(2022, 10, 10))
							.numberOfTabletsInStock(100)
							.build())
					.forEach(ms -> repo.save(ms));
		};
	}

}
