package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Bill;
import com.zohocrm.repositories.BillRepository;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billrepo;


	@Override
	public void saveOneBill(Bill bill) {
    billrepo.save(bill);		
	}

}
