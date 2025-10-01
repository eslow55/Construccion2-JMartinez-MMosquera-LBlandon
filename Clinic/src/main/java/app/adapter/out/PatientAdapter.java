package app.adapter.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.infrastructure.persistence.entities.PatientEntity;
import app.infrastructure.persistence.mapper.PatientMapper;
import app.infrastructure.persistence.repository.PatientRepository;


@Service
public class PatientAdapter implements PatientPort {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void save(Patient patient) throws Exception {
		PatientEntity patientEntity = PatientMapper.toEntity(patient);
		patientRepository.save(patientEntity);		
	}

	@Override
	public Patient findById(Patient patient) throws Exception {
		PatientEntity patientEntity = patientRepository.findById(patient.getId());
		return null;
	}
	

}