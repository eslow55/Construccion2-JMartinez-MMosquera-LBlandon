package app.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.ClinicalOrder;
import app.domain.model.ClinicalRecord;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.services.CreateClinicalOrder;
import app.domain.services.CreateClinicalRecord;
import app.domain.services.CreatePatient;
import app.domain.services.CreateUser;
import app.domain.services.SearchClinicalOrderByPatient;

@Service
public class ClinicUseCase {
	@Autowired
	private CreateUser createUser;
	@Autowired
	private CreatePatient createPatient;
	@Autowired
	private CreateClinicalOrder createClinicalOrder;
	private SearchClinicalOrderByPatient searchClinicalOrder;
	@Autowired
	private CreateClinicalRecord createClinicalRecord;

	public void CreateOwner(User user) throws Exception{
		user.setRole(Role.PATIENT);
		createUser.create(user);
	}
	
	public void CreatePet(Patient patient) throws Exception{
		createPatient.create(patient);
	}
	
	public void createOrder(ClinicalOrder order) throws Exception {
		createClinicalOrder.create(order);
	}
	
	public List<ClinicalOrder> searchOrders(Patient patient) throws Exception{
		return searchClinicalOrder.search(patient);
	}
	
	public void createClinicalRecord(ClinicalRecord clinicalRecord) throws Exception {
		createClinicalRecord.create(clinicalRecord);
	}
}