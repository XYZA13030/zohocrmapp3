package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;

public interface ContactService {
public void saveContact(Contact contact);


public List<Contact> getAllContacts();


public Contact getContactById(long id);


public Contact findLeadById(long id);


public void deleteById(long id);








}
