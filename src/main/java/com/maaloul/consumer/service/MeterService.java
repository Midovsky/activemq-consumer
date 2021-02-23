package com.maaloul.consumer.service;

import java.util.List;

import com.maaloul.consumer.model.Meter;
import com.maaloul.consumer.repository.MeterRepository;

import org.springframework.stereotype.Service;

@Service
public class MeterService {

  private MeterRepository meterRepository;

  public void saveMetersBulk(final List<Meter> meters) {
    meterRepository.saveAll(meters);
  }

  public void saveMeter(Meter meter) {
    meterRepository.save(meter);
  }

	public Iterable<Meter> findAllMeters() {
		return meterRepository.findAll();
	}
}
