package com.laxpolicedpt.civilrewiew.serviceDTO;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laxpolicedpt.civilrewiew.entity.Charges;
import com.laxpolicedpt.civilrewiew.entity.Civil;
import com.laxpolicedpt.civilrewiew.repository.IChargesRepository;
import com.laxpolicedpt.civilrewiew.repository.ICivilRepository;

@Service
public class DataService {
	
	
	@Autowired
	private IChargesRepository charges;
	
	@Autowired
	private ICivilRepository civil;
	
	public List<Charges> getBack(Integer id) {
		Optional<Civil> thecivil = civil.findById(id);
		List<Charges> thelist = thecivil.get().getCharges();
		
		
		
		return thelist;
		
	}
	
	public Optional<Civil> getCivilData(Integer id) {
		return (Optional<Civil> ) civil.findById(id);
	}
	
	
	public CivilDTO getCivilDataWithOut(Integer id) {
		Optional<Civil> thecivil = civil.findById(id);
		
		// this is like a mirror of the civil class, but without the List of charges, for a better perfomance of the query
		CivilDTO civilDTO = new CivilDTO();
		
		
		if(thecivil.isPresent()) {
			
			// we set the data in the mirror, and then, return it
			civilDTO.setId(thecivil.get().getId());
			civilDTO.setName(thecivil.get().getName());
			civilDTO.setLastName(thecivil.get().getLastName());
			civilDTO.setNativeTown(thecivil.get().getNativeTown());
			civilDTO.setNacionality(thecivil.get().getNacionality());
			civilDTO.setBirthDate(thecivil.get().getBirthDate());
			civilDTO.setPassportNumber(thecivil.get().getPassportNumber());
		}
		
		return civilDTO;
	}
	
}
