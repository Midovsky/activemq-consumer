package com.maaloul.consumer.contoller;

import com.maaloul.consumer.model.Meter;
import com.maaloul.consumer.repository.MeterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
	private MeterRepository meterRepository;
	
	@PostMapping("/saveMeter")
	public Meter saveCustomer(@RequestBody Meter meter) {
		return meterRepository.save(meter);
	}

	@GetMapping("/findAll")
	public Iterable<Meter> findAllMeters() {
		return meterRepository.findAll();
	}
    
}
