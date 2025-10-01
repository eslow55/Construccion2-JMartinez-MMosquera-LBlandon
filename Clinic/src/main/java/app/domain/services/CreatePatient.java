package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

public class CreatePatient {
	
	private UserPort userPort;
	private PatientPort patientPort;
	public void create(Patient patient)throws Exception {
		User owner = userPort.findByDocument(patient.getName());
		if(owner== null) {
			throw new Exception("El paciente debe ser valido");
		}
		patientPort.save(patient);
	}

}