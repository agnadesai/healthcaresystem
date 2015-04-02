package com.healthcare.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.healthcare.model.Patient;

@Path("/todo")
public class HealthcareController {
  // This method is called if XMLis request
  @GET
  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
  public Patient getXML() {
	  Patient patient = new Patient();

	  patient.setUsername("johndoe");
	  patient.setPassword("abc123");
    return patient;
  }
  
  // This can be used to test the integration with the browser
  @GET
  @Produces({ MediaType.TEXT_XML })
  public Patient getHTML() {
	  Patient patient = new Patient();

	  patient.setUsername("johndoe");
	  patient.setPassword("abc123");
    return patient;
  }

} 