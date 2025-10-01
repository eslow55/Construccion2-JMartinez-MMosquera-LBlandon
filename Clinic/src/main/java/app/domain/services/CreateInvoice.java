package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.ClinicalOrder;
import app.domain.model.Invoice;
import app.domain.model.Patient;
import app.domain.ports.ClinicalOrderPort;
import app.domain.ports.InvoicePort;
import app.domain.ports.PatientPort;

@Service
public class CreateInvoice {
	@Autowired
	private PatientPort patientPort;
	@Autowired
	private ClinicalOrderPort clinicalOrderPort;
	@Autowired
	private InvoicePort invoicePort;
	
	public void create(Invoice invoice) throws Exception {
		Patient patient = patientPort.findById(invoice.getPatient());
		if(patient == null) {
			throw new Exception("la factura debe tener una mascota asociada");
		}
		if(invoice.isMedicine()) {
			ClinicalOrder clinicalOrder = clinicalOrderPort.findById(invoice.getOrder());
			if(clinicalOrder==null || patient.getId()!=clinicalOrder.getPatient().getId()) {
				throw new Exception ("la venta de un medicamento requiere de una orden asociada");
			}
			invoice.setOrder(clinicalOrder);
		}
		invoice.setPatient(patient);
		invoicePort.save(invoice);
	}

}