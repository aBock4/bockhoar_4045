package com.plantplaces.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.plantplaces.dao.ISpecimenDAO;
import com.plantplaces.dto.PlantDTO;
import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	private ISpecimenDAO specimenDAO;
	
	@Override
	public SpecimenDTO fetchById(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("39.74");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");		
		return specimenDTO;
	}
	
	@Override
	public boolean save(SpecimenDTO specimenDTO)throws Exception {
		boolean result = specimenDAO.save(specimenDTO);
		return result;
	}

	@Override
	public List<PlantDTO> fetchPlants(String searchTerm) {
		//stub out a plant fetch mechanism
		List<PlantDTO> matchingPlants = new ArrayList<PlantDTO>();
		if(searchTerm.contains("edbud") || searchTerm.contains("Cercis")) {
			PlantDTO plant = new PlantDTO();
			plant.setGenus("Cercis");
			plant.setSpecies("canadensis");
			plant.setCommon("Eastern Redbud");
			matchingPlants.add(plant);
		}
		return matchingPlants;
	}

	@Override
	public ISpecimenDAO getSpecimenDAO() {
		return specimenDAO;
	}

	@Override
	public void setSpecimenDAO(ISpecimenDAO specimenDAO) {
		this.specimenDAO = specimenDAO;
	}
}
