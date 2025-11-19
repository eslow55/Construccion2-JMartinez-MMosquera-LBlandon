ppackage app.adapter.in.builder;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.adapter.in.validators.ClinicalOrderValidator;
import app.adapter.in.validators.ClinicalRecordValidator;
import app.adapter.in.validators.PatientValidator;
import app.adapter.in.validators.UserValidator;
import app.domain.model.ClinicalOrder;
import app.domain.model.ClinicalRecord;
import app.domain.model.Patient;
import app.domain.model.User;

@Component
public class ClinicalRecordBuilder {
	
	@Autowired
	private ClinicalRecordValidator clinicalRecordValidator;
	@Autowired
	private UserValidator uservalidator;
	@Autowired
	private PatientValidator petValidator;
	@Autowired
	private ClinicalOrderValidator clinialOrderValidator;
	
	
	public ClinicalRecord create(String document,String patientId,String orderId)throws Exception{
		ClinicalRecord clinicalRecord = new ClinicalRecord();
		User veterinarian = new User();
		Patient patient = new Patient();
		ClinicalOrder order = new ClinicalOrder();
		clinic.setDocument(uservalidator.documentValidator(document));
		patient.setId(patienttValidator.idValidator(patienttId));
		order.setId(clinialOrderValidator.idValidator(orderId));
		clinicalRecord.setClinic(clinic);
		clinicalRecord.setPatient(patient);
		clinicalRecord.setClinicalOrder(order);
		clinicalRecord.setDate(new Date(System.currentTimeMillis()));
		clinicalRecord.setStatus(true);
		return clinicalRecord;
	}
}