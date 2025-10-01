/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.PatientValidator;
import app.adapter.in.validators.UserValidator;
import app.domain.model.Patient;
import app.domain.model.User;

/**
 *
 * @author ESTUDIANTE
 */
@Component
public class PatientBuilder {
	@Autowired
	private PatientValidator petValidator;
	@Autowired
	private UserValidator userValidator;

	public Patient builder(String document, String name, String age, String weigth, String features, String breed) throws Exception {
		Patient patient = new Patient();
		User owner = new User();
		owner.setDocument(userValidator.documentValidator(document));
		patient.setPatient(patient);
		patient.setAge(petValidator.ageValidator(age));
		patient.setBreed(petValidator.breedValidator(breed));
		patient.setFeatures(petValidator.featuresValidator(features));
		patient.setWeigth(petValidator.weigthValidator(weigth));
		patient.setName(petValidator.nameValidator(name));
		return patient;
	}

}