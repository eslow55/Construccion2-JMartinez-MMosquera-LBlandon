package app.domain.model;

public class ClinicalOrder {
    private long id;
    private long patientDocument;
    private long doctorDocument;
    private String creationDate;
    
    
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
    
    
}
