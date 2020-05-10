package ua.lviv.iot.manager;

import java.util.List;

import ua.lviv.iot.model.AbstractStorage;

import java.util.LinkedList;

public class StorageManager {
  private List<AbstractStorage> storages = new LinkedList<AbstractStorage>();

  public void addStorage(AbstractStorage storage) {
    this.storages.add(storage);
  }

  public void addStorages(List<AbstractStorage> storages) {
    this.storages.addAll(storages);
  }

  /*
   * public List<AbstractStorage> findStoragesByBodyMaterial(BodyMaterial
   * bodyMaterial) { List<AbstractStorage> result = new
   * LinkedList<AbstractStorage>(); for (AbstractStorage currentStorage :
   * storages) { if (currentStorage.getBodyMaterial() == bodyMaterial) {
   * result.add(currentStorage); } } return result; }
   */
}
