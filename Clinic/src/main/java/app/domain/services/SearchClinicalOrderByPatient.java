package app.domain.services;

import java.util.List;

import app.domain.model.ClinicalOrder;
import app.domain.model.Patient;
import app.domain.ports.ClinicalOrderPort;
import app.domain.ports.PatientPort;

public class SearchClinicalOrderByPatient {

	private PatientPort patientPort;
	private ClinicalOrderPort clinicalOrderPort;

	public List<ClinicalOrder> search(Patient patient) throws Exception {
		patient = patientPort.findById(patient);
		if (patient == null) {
			throw new Exception("debe consultar ordenes de una mascota registrada");
		}
		return clinicalOrderPort.findByPet(patient);

	}

}