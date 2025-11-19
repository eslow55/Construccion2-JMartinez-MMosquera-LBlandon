package app.domain.model;

import java.sql.Date;

public class ClinicalRecord {
	private long id;
	private Patient patient;
	private User clinic;
	private Date date;
	private String motive;
	private String Diagnosis;
	private String medicine;
	private String medicalProcedure;
	private String doce;
	private ClinicalOrder clinicalOrder; 
	private String vaccinationRecord;
	private String allergies;
	private String proceddureDetail;
	private String symptoms;
	private boolean status;
    private long patientDocument;
    private String recordDate;
    private String doctorDocument;
    private String consultationReason;
    private String diagnosis;
    
    
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMotive() {
		return motive;
	}
	public void setMotive(String motive) {
		this.motive = motive;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getMedicalProcedure() {
		return medicalProcedure;
	}
	public void setMedicalProcedure(String medicalProcedure) {
		this.medicalProcedure = medicalProcedure;
	}
	public String getDoce() {
		return doce;
	}
	public void setDoce(String doce) {
		this.doce = doce;
	}
	public ClinicalOrder getClinicalOrder() {
		return clinicalOrder;
	}
	public void setClinicalOrder(ClinicalOrder clinicalOrder) {
		this.clinicalOrder = clinicalOrder;
	}
	public String getVaccinationRecord() {
		return vaccinationRecord;
	}
	public void setVaccinationRecord(String vaccinationRecord) {
		this.vaccinationRecord = vaccinationRecord;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getProceddureDetail() {
		return proceddureDetail;
	}
	public void setProceddureDetail(String proceddureDetail) {
		this.proceddureDetail = proceddureDetail;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
	public String getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}
	public String getDoctorDocument() {
		return doctorDocument;
	}
	public void setDoctorDocument(String doctorDocument) {
		this.doctorDocument = doctorDocument;
	}
	public String getConsultationReason() {
		return consultationReason;
	}
	public void setConsultationReason(String consultationReason) {
		this.consultationReason = consultationReason;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
		
    
    
}
