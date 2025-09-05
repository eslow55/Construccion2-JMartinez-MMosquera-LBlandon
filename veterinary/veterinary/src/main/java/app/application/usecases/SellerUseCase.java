package app.application.usecases;

import java.util.List;

import app.domain.model.ClinicalOrder;
import app.domain.model.Invoice;
import app.domain.model.Pet;
import app.domain.service.CreateInvoice;
import app.domain.service.SearchClinicalOrderByPet;

public class SellerUseCase {

	private CreateInvoice createInvoice;
	private SearchClinicalOrderByPet searchClinicalOrderByPet;

	public void CreateInvoice(Invoice invoice) throws Exception {
		createInvoice.create(invoice);
	}
	
	public List<ClinicalOrder> searchClinicalOrder(Pet pet) throws Exception{
		return searchClinicalOrderByPet.search(pet);
	}

}