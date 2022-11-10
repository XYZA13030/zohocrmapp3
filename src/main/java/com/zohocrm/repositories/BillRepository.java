package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
