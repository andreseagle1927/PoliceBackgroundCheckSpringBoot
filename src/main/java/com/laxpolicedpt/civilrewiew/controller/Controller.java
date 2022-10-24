package com.laxpolicedpt.civilrewiew.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.laxpolicedpt.civilrewiew.entity.Charges;
import com.laxpolicedpt.civilrewiew.entity.Civil;
import com.laxpolicedpt.civilrewiew.serviceDTO.CivilDTO;
//import com.laxpolicedpt.civilrewiew.serviceDTO.CivilDTO;
import com.laxpolicedpt.civilrewiew.serviceDTO.DataService;

@RestController
public class Controller {

	@Autowired
	DataService dataService;
	

	
	@RequestMapping(value = "/civil", method = RequestMethod.GET)
	public ResponseEntity<CivilDTO> getDataPerson(@RequestParam(value = "id") Integer id) {
		CivilDTO civil = dataService.getCivilDataWithOut(id);
		
		
		return new ResponseEntity(civil, HttpStatus.OK);
			
		
	}
	
	@RequestMapping(value = "/back", method = RequestMethod.GET)
	public ResponseEntity<List<Charges>> getBackground(@RequestParam(value = "id") Integer id) {
		List<Charges> charges = dataService.getBack(id);
		
		return new ResponseEntity(charges, HttpStatus.OK);
			
		
	}
	
}
