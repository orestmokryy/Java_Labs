package ua.lviv.iot.spring.first.rest.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.first.rest.business.ThermosService;
import ua.lviv.iot.spring.first.rest.model.Thermos;

@RequestMapping("/thermoses")
@RestController
public class ThermosController {
	private AtomicInteger idCounter = new AtomicInteger();
	@Autowired
	private ThermosService thermosService;

	@GetMapping
	public List<Thermos> getThermoses() {
		return new LinkedList<Thermos>(thermosService.findAllThermoses());
	}

	@GetMapping(path = "/{id}")
	public Thermos getThermos(final @PathVariable("id") Integer storageId) {
		return thermosService.findThermos(storageId);
	}

	@PostMapping
	public void createThermos(final @RequestBody Thermos thermos) {
		thermosService.createThermos(thermos);
		thermos.setId(idCounter.incrementAndGet());

	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Thermos> updateThermos(final @PathVariable("id") Integer storageId,
			final @RequestBody Thermos thermos) {
		if (thermosService.checkIfThermosExists(storageId)) {
			return ResponseEntity.ok(thermosService.updateThermos(storageId, thermos));
		}
		return new ResponseEntity<Thermos>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Thermos> deleteThermos(final @PathVariable("id") Integer storageId) {
		if (thermosService.checkIfThermosExists(storageId)) {
			thermosService.deleteThermos(storageId);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}