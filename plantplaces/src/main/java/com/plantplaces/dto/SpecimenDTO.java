package com.plantplaces.dto;

public class SpecimenDTO {

	private int specimenId;
	private String latitude;
	private String longitude;
	private String description;
	private int plantID;
	
	public int getSpecimenId() {
		return specimenId;
	}
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPlantID() {
		return plantID;
	}
	public void setPlantID(int plantID) {
		this.plantID = plantID;
	}
	@Override
	public String toString() {
		return specimenId + " " + latitude + " " + longitude + " " + description;
	}
	@Override
	public boolean equals(Object obj) {
		//assume they don't match
		boolean returnValue = false;
		if (obj instanceof SpecimenDTO) {
			SpecimenDTO incomingSpecimen = (SpecimenDTO) obj;
			returnValue = incomingSpecimen.getSpecimenId() == getSpecimenId();
		}
		return returnValue;
	}
}
