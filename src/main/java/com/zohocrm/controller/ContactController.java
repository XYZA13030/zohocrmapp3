package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class ContactController {
	
	@Autowired
	private LeadService leadService;
	private ContactService contactService;

	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	
	
	
	}
	
	
	@RequestMapping("/listallcontacts")
	public String listAllLeads(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	
	@RequestMapping("/convertToLead")
	public String convertToLead(@RequestParam("id")long id,Model model) {
		Contact contact = contactService.findLeadById(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
		
		@RequestMapping("/convertContact")
		public String convertContact(@RequestParam("id")long id,Model model) {
			Contact contact = contactService.findLeadById(id);
		Lead lead = new Lead();
		lead.setFirstName(contact.getFirstName());
		lead.setLastName(contact.getLastName());
		lead.setMobile(contact.getMobile());
		lead.setEmail(contact.getEmail());
		lead.setSource(contact.getSource());
		
		leadService.saveOneLead(lead);
		contactService.deleteById(id);
		
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
}
