package ua.lviv.iot.spring.first.rest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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

import ua.lviv.iot.storages.Thermos;

@RequestMapping("/storages")
@RestController
public class StorageController {

	private Map<Integer, Thermos> storages = new HashMap<>();
	private AtomicInteger idCounter = new AtomicInteger();

	@GetMapping
	public List<Thermos> getStorages() {
		return new LinkedList<Thermos>(storages.values());
	}

	@GetMapping(path = "/{id}")
	public Thermos getStorage(final @PathVariable("id") Integer storageId) {
		return storages.get(storageId);
	}

	@PostMapping
	public Thermos createStorage(final @RequestBody Thermos storage) {
		storage.setId(idCounter.incrementAndGet());
		storages.put(storage.getId(), storage);
		return storage;
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Thermos> updateStorage(final @PathVariable("id") Integer storageId,
			final @RequestBody Thermos newStorage) {
		Thermos oldStorage = storages.get(storageId);
		if (oldStorage != null) {
			storages.put(storageId, newStorage);
			return new ResponseEntity<Thermos>(oldStorage, HttpStatus.OK);
		}
		return new ResponseEntity<Thermos>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Thermos> deleteStorage(final @PathVariable("id") Integer storageId) {
		HttpStatus status = storages.remove(storageId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
		return ResponseEntity.status(status).build();
	}

}
