package app.domain.services;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.ClinicalOrder;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.ports.ClinicalOrderPort;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;


@Service
public class CreateClinicalOrder {
	@Autowired
	private UserPort userPort;
	@Autowired
	private PatientPort patientPort;
	@Autowired
	private ClinicalOrderPort clinicalOrderPort;

	public void create(ClinicalOrder clinicalOrder) throws Exception {
		User clinic = userPort.findByDocument(clinicalOrder.getClinic());
		if (clinic == null || !clinic.getRole().equals(Role.CLINIC)) {
			throw new Exception("Las ordenes solo las pueden crear medicos");
		}
		Patient patient = patientPort.findById(clinicalOrder.getPatient());
		if (patient == null) {
			throw new Exception("las ordenes se deben aplicar a pacientes registradas");
		}
		clinicalOrder.setDate(new Date(System.currentTimeMillis()));
		clinicalOrder.setPatient(patient);
		clinicalOrder.setClinic(clinic);
		
		clinicalOrderPort.save(clinicalOrder);
	}
}