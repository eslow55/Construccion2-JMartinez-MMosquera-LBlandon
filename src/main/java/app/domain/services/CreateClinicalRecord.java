
package app.domain.services;

import app.domain.model.entities.ClinicicalRecord;
import app.domain.model.entities.Users;
import app.domain.ports.ClinicalRecordPort;
import app.domain.ports.UserPort;
import app.domain.ports.PetPort;


public class CreateClinicalRecord {

    private final PetPort petPort;
    private final UserPort userPort;
    private final ClinicalRecordPort clinicalRecordPort;

    public CreateClinicalRecord(PetPort petPort, UserPort userPort, ClinicalRecordPort clinicalRecordPort) {
        this.userPort = userPort;
        this.petPort = petPort;
        this.clinicalRecordPort = clinicalRecordPort;
    }
    
    public void createClinicalRecord(ClinicicalRecord record) throws Exception{
        if(this.petPort.findPetById(record.getPet().getId()) == null){
            throw new Exception("Pet Should Exists");
        }
        Users veterinarian = this.userPort.findUserByName(record.getVeterinarian().getName());
        if(veterinarian == null){
            throw new Exception("Veterinarian Should Exists");
        }
        this.clinicalRecordPort.saveMedicalRecord(record);
        
    }
}
