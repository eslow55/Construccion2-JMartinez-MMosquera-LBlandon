package app.adapter.in.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.ClinicalOrderValidator;
import app.adapter.in.validators.PatientValidator;
import app.adapter.in.validators.UserValidator;
import app.domain.model.ClinicalOrder;
import app.domain.model.Patient;
import app.domain.model.User;

@Component
public class ClinicalOrderBuilder {
	@Autowired
	private UserValidator userValidator;
	@Autowired
	private PatientValidator patientValidator;
	@Autowired
	private ClinicalOrderValidator clinicalOrderValidator;
	
	public ClinicalOrder builder(String document,String id, String medicine,String doce) throws Exception {
		User veterinarian = new User();
		Patient patient = new Patient();
		ClinicalOrder clinicalOrder = new ClinicalOrder();
		clinic.setDocument(userValidator.documentValidator(document));
		patient.setId(patientValidator.idValidator(id));
		clinicalOrder.setClinic(clinic);
		clinicalOrder.setPatient(patient);
		clinicalOrder.setMedicine(clinicalOrderValidator.medicineValidator(medicine));
		clinicalOrder.setDoce(clinicalOrderValidator.doceValidator(doce));
		return clinicalOrder;
	}

}