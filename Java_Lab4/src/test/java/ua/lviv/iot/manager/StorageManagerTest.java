package ua.lviv.iot.manager;

import ua.lviv.iot.manager.StorageManager;
//import ua.lviv.iot.model.AbstractStorage;
//import ua.lviv.iot.model.BodyMaterial;

//import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class StorageManagerTest extends AbstractStorageManagerTest {

  protected StorageManager storageManager;

  @BeforeEach
  public void setUp() {

    storageManager = new StorageManager();

    createAllStorages();

    storageManager.addStorages(baskets);
    storageManager.addStorages(jars);
    storageManager.addStorages(thermoses);
    storageManager.addStorages(foodContainers);
  }

  /*
   * @Test public void testFindStoragesByBodyMaterial() { List<AbstractStorage>
   * foundStorages =
   * storageManager.findStoragesByBodyMaterial(BodyMaterial.METAL);
   * assertEquals(1,storageManager.findStoragesByBodyMaterial(BodyMaterial.METAL))
   * ; }
   */
}