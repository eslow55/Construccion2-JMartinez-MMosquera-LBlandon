package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.ClinicalOrder;
import app.domain.model.ClinicalRecord;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.ClinicalOrderPort;
import app.domain.ports.ClinicalRecordPort;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

@Service
public class CreateClinicalRecord {
	
	@Autowired
	private UserPort userPort;
	@Autowired
	private PatientPort patientPort;
	@Autowired
	private ClinicalOrderPort clinicalOrderPort;
	@Autowired
	private ClinicalRecordPort clinicalRecordPort;
	
	public void create(ClinicalRecord clinicalRecord) throws Exception{
		Patient patient = patientPort.findById(clinicalRecord.getPatient());
		if(patient == null) {
			throw new Exception("la historia debe tener una mascota valida");
		}
		User clinic = userPort.findByDocument(clinicalRecord.getClinic());
		if(clinic==null || !clinic.getRole().equals(Role.CLINIC)) {
			throw new Exception("la historia clinica debe ser registrada por un doctor valido");
		}
		ClinicalOrder clinicalOrder = clinicalOrderPort.findById(clinicalRecord.getClinicalOrder());
		if(clinicalOrder==null) {
			throw new Exception("la historia clinica debe tener una orden valida asociada");
		}
		clinicalRecord.setPatient(patient);
		clinicalRecord.setClinic(clinic);
		clinicalRecord.setClinicalOrder(clinicalOrder);
		clinicalRecordPort.save(clinicalRecord);
		
	}

}
