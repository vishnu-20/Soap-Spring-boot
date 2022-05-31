package com.address.soap.api.service;

import org.springframework.stereotype.Service;

import com.address.soap.api.model.GetProductAvailabilityOutputType;

@Service
public class AddressServiceImpl implements AddressService{

	@Override
	public GetProductAvailabilityOutputType availabilityOutputType() {
		GetProductAvailabilityOutputType availabilityOutputType = new GetProductAvailabilityOutputType();
		
		return availabilityOutputType;
	}

}
