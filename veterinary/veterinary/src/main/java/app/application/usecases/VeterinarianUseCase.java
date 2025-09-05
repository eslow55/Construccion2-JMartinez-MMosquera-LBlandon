package app.application.usecases;

import java.util.List;

import app.domain.model.ClinicalOrder;
import app.domain.model.ClinicalRecord;
import app.domain.model.Pet;
import app.domain.model.User;
import app.domain.model.emuns.Role;
import app.domain.service.CreateClinicalOrder;
import app.domain.service.CreateClinicalRecord;
import app.domain.service.CreatePet;
import app.domain.service.CreateUser;
import app.domain.service.SearchClinicalOrderByPet;

public class VeterinarianUseCase {
	
	private CreateUser createUser;
	private CreatePet createPet;
	private CreateClinicalOrder createClinicalOrder;
	private SearchClinicalOrderByPet searchClinicalOrder;
	private CreateClinicalRecord createClinicalRecord;

	public void CreateOwner(User user) throws Exception{
		user.setRole(Role.OWNER);
		createUser.create(user);
	}
	
	public void CreatePet(Pet pet) throws Exception{
		createPet.create(pet);
	}
	
	public void createOrder(ClinicalOrder order) throws Exception {
		createClinicalOrder.create(order);
	}
	
	public List<ClinicalOrder> searchOrders(Pet pet) throws Exception{
		return searchClinicalOrder.search(pet);
	}
	
	public void createClinicalRecord(ClinicalRecord clinicalRecord) throws Exception {
		createClinicalRecord.create(clinicalRecord);
	}
}