package app.infrastructure.persistence.mapper;

import app.domain.model.Patient;
import app.infrastructure.persistence.entities.PatientEntity;

public class PatientMapper {

    // De dominio → entidad
    public static PatientEntity toEntity(Patient patient) {
        PatientEntity entity = new PatientEntity();
        entity.setId(patient.getId());
        entity.setOwner(UserMapper.toEntity(patient.getOwner()));
        entity.setName(patient.getName());
        entity.setAge(patient.getAge());
        entity.setWeight(patient.getWeigth()); // recuerda corregir en dominio a weight
        entity.setFeatures(patient.getFeatures());
        entity.setBreed(patient.getBreed());
        return entity;
    }

    // De entidad → dominio
    public static Patient toDomain(PatientEntity entity) {
        Patient patient = new Patient();
        patient.setId(entity.getId());
        patient.setOwner(UserMapper.toDomain(entity.getOwner()));
        patient.setName(entity.getName());
        patient.setAge(entity.getAge());
        patient.setWeigth(entity.getWeight()); // recuerda corregir en dominio a weight
        patient.setFeatures(entity.getFeatures());
        patient.setBreed(entity.getBreed());
        return patient;
    }
}