package com.plantplaces.service;

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
	void save(SpecimenDTO specimentDTO);

}