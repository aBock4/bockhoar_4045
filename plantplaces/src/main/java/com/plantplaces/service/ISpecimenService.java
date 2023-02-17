package com.plantplaces.service;

import java.util.List;

import com.plantplaces.dao.ISpecimenDAO;
import com.plantplaces.dto.PlantDTO;
import com.plantplaces.dto.SpecimenDTO;

/**
 * operations for specimens
 * @author arboc
 *
 */
public interface ISpecimenService {

	/**
	 * Get specimens from persistence layer
	 * @param id a unique lookup
	 * @return specimen with matching id
	 */
	SpecimenDTO fetchById(int id);

	/**
	 * Persist the given DTO
	 * @param specimentDTO
	 */
	boolean save(SpecimenDTO specimentDTO)throws Exception;

	/**
	 * Return a list of plants that contain this String
	 * @param string the search criteria: can be genus, species, cultivar, or common
	 * @return a list of matching plants
	 */
	List<PlantDTO> fetchPlants(String string);

	void setSpecimenDAO(ISpecimenDAO specimenDAO);

	ISpecimenDAO getSpecimenDAO();

}