package app.domain.model;

import java.sql.Date;

public class ClinicalOrder {
	private Patient patient;
	private User clinic;
	private String medicine;
	private String doce;
	private Date date;
    private long id;
    private long patientDocument;
    private long doctorDocument;
    private String creationDate;
    private long clinicalOrder;
    
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public User getClinic() {
		return clinic;
	}
	public void setClinic(User clinic) {
		this.clinic = clinic;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getDoce() {
		return doce;
	}
	public void setDoce(String doce) {
		this.doce = doce;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getClinicalOrder() {
		return clinicalOrder;
	}
	public void setClinicalOrder(long clinicalOrder) {
		this.clinicalOrder = clinicalOrder;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPatientDocument() {
		return patientDocument;
	}
	public void setPatientDocument(long patientDocument) {
		this.patientDocument = patientDocument;
	}
	public long getDoctorDocument() {
		return doctorDocument;
	}
	public void setDoctorDocument(long doctorDocument) {
		this.doctorDocument = doctorDocument;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public void setPatientDocument(Patient patient) {
		
		
	}
    
    
    
}
