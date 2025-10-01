package app.adapter.out;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.model.ClinicalOrder;
import app.domain.model.Patient;
import app.domain.ports.ClinicalOrderPort;
import app.infrastructure.persistence.entities.ClinicalOrderEntity;
import app.infrastructure.persistence.mapper.ClinicalOrderMapper;
import app.infrastructure.persistence.mapper.PatientMapper;
import app.infrastructure.persistence.repository.ClinicalOrderRepository;


@Service
public class ClinicalOrderAdapter implements ClinicalOrderPort {
	@Autowired
	private ClinicalOrderRepository clinicalOrderRepository;

	@Override
	public ClinicalOrder findById(ClinicalOrder clinicalOrder) throws Exception {
		ClinicalOrderEntity clinicalOrderEntity = clinicalOrderRepository.findById(clinicalOrder.getId());
		return ClinicalOrderMapper.toDomain(clinicalOrderEntity);
	}

	@Override
	public List<ClinicalOrder> findByPet(Patient patient) throws Exception {
		List<ClinicalOrder> clinicalOrders = new ArrayList<ClinicalOrder>();
		List<ClinicalOrderEntity> clinicalOrdersEntities = clinicalOrderRepository.findByPet(PetMapper.toEntity(pet));
		for (ClinicalOrderEntity entity : clinicalOrdersEntities) {
			clinicalOrders.add(ClinicalOrderMapper.toDomain(entity));
		}
		return clinicalOrders;
	}

	@Override
	public void save(ClinicalOrder clinicalOrder) throws Exception {
		clinicalOrderRepository.save(ClinicalOrderMapper.toEntity(clinicalOrder));
		
	}

	@Override
	public List<ClinicalOrder> findByPet(Patient patient) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}