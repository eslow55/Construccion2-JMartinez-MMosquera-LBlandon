package app.domain.model;

import java.sql.Date;

public class Invoice {
	private Patient patient;
	private ClinicalOrder order;
	private String productName;
	private double productAmount;
	private boolean medicine;
	private Date date;
    private long id;
    private String patientName;
    private int age;
    private long patientDocument;
    private String doctorName;
    private double total;
    
    
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public ClinicalOrder getOrder() {
		return order;
	}
	public void setOrder(ClinicalOrder order) {
		this.order = order;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(double productAmount) {
		this.productAmount = productAmount;
	}
	public boolean isMedicine() {
		return medicine;
	}
	public void setMedicine(boolean medicine) {
		this.medicine = medicine;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPatientDocument() {
		return patientDocument;
	}
	public void setPatientDocument(long patientDocument) {
		this.patientDocument = patientDocument;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
    
    
}
