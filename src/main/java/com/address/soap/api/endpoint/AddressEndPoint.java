package com.address.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.address.soap.api.model.GetProductAvailabilityInputType;
import com.address.soap.api.model.GetProductAvailabilityOutputType;
import com.address.soap.api.service.AddressService;

@Endpoint
public class AddressEndPoint {

	private static final String NAMESPACE_URI = "http://www.api.soap.address.com/model";
	
	@Autowired
	private AddressService addressService;
	
	@PayloadRoot(namespace = NAMESPACE_URI,localPart = "GetProductAvailabilityInputType")
	@ResponsePayload
	public GetProductAvailabilityOutputType getOutput (@RequestPayload GetProductAvailabilityInputType availabilityInputType) {
		return null;
		
	}
}
