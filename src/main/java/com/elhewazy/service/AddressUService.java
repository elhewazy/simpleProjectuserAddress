package com.elhewazy.service;

import com.elhewazy.beans.AddressU;

public interface AddressUService {

	public AddressU addAddress(AddressU address);

	public AddressU getAddress(int id);

	public AddressU updateAddress(AddressU address);

	public AddressU deleteAddress(AddressU address);

}
