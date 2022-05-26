package com.elhewazy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elhewazy.beans.AddressU;
import com.elhewazy.repo.AddressRepo;

@Service
public class AddressUServImpl implements AddressUService {

	@Autowired
	AddressRepo ar;

	@Override
	public AddressU addAddress(AddressU address) {

		return ar.save(address);
	}

	@Override
	public AddressU getAddress(int id) {

		return ar.findById(id).get();
	}

	@Override
	public AddressU updateAddress(AddressU address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressU deleteAddress(AddressU address) {
		// TODO Auto-generated method stub
		return null;
	}

}
