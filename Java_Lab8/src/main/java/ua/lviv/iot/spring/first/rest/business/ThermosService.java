package ua.lviv.iot.spring.first.rest.business;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.first.rest.dataaccess.ThermosRepository;
import ua.lviv.iot.spring.first.rest.model.Thermos;

@Service
public class ThermosService {
	
	@Autowired
	private ThermosRepository thermosRepository;

	public Thermos createThermos(Thermos thermos) {
		return thermosRepository.save(thermos);
	}

	public void deleteThermos(Integer storageId) {
		thermosRepository.deleteById(storageId);
	}

	public boolean checkIfThermosExists(Integer storageId) {
		return thermosRepository.existsById(storageId);
	}

	public Thermos findThermos(Integer storageId) {
		return thermosRepository.findById(storageId).get();
	}

	public List<Thermos> findAllThermoses() {
		return thermosRepository.findAll();
	}

	public Thermos updateThermos(Integer storageId, Thermos thermos) {

		Thermos thermosToUpdate = null;
		Thermos temporaryThermos = thermosRepository.findById(storageId).orElse(null);
		if (temporaryThermos != null) {
			thermosToUpdate = new Thermos();
			BeanUtils.copyProperties(temporaryThermos, thermosToUpdate);
			thermosRepository.save(thermos);
		}
		return thermosToUpdate;
	}
}