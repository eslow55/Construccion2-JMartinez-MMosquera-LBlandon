package app.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.ClinicalOrder;
import app.domain.model.Invoice;
import app.domain.model.Patient;
import app.domain.services.CreateInvoice;
import app.domain.services.SearchClinicalOrderByPatient;

@Service
public class SellerUseCase {
	@Autowired
	private CreateInvoice createInvoice;
	private SearchClinicalOrderByPatient searchClinicalOrderByPatient;

	public void CreateInvoice(Invoice invoice) throws Exception {
		createInvoice.create(invoice);
	}
	
	public List<ClinicalOrder> searchClinicalOrder(Patient patient) throws Exception{
		return searchClinicalOrderByPatient.search(patient);
	}

}