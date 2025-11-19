package app.domain.services;

import java.util.List;

import app.domain.model.ClinicalRecord;
import app.domain.model.Patient;
import app.domain.ports.ClinicalRecordPort;
import app.domain.ports.PatientPort;

public class SearchClinicalRecordByPatient {
	
	private PatientPort patientPort;
	private ClinicalRecordPort clinicalRecordPort;
	
	public List<ClinicalRecord> search(Patient patient) throws Exception{
		patient = patientPort.findById(patient);
		if(patient == null) {
			throw new Exception("no existe la mascota buscada");
		}
		return clinicalRecordPort.findByPatient(patient);
		
	}

}