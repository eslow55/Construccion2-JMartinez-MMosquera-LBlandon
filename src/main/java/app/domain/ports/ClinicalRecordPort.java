
package app.domain.ports;
import app.domain.model.entities.ClinicicalRecord;

public interface ClinicalRecordPort {
    public ClinicalRecordPort findMedicalRecordById(int medicalRecordId);
    public void saveMedicalRecord(ClinicicalRecord medicalRecord);
}
