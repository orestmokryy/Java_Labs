package ua.lviv.iot.manager;

import java.util.List;
import java.util.LinkedList;
import ua.lviv.iot.model.AbstractStorage;
import ua.lviv.iot.model.BodyMaterial;

public abstract class StorageManager {
	private List<AbstractStorage> storages = new LinkedList<>();

	public void addStorage(AbstractStorage storage) {
		this.storages.add(storage);
	}

	public void addStorages(List<AbstractStorage> storages) {
		this.storages.addAll(storages);
	}

	public List<AbstractStorage> findStoragesByBodyMaterial(BodyMaterial bodyMaterial) {
		List<AbstractStorage> result = new LinkedList<>();
		for (AbstractStorage currentStorage : storages) {
			if (currentStorage.getBodyMaterial() == bodyMaterial) {
				result.add(currentStorage);
			}
		}
		return result;
	}
}
