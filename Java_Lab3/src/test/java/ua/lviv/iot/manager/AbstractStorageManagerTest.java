package ua.lviv.iot.manager;

import java.util.List;
import java.util.LinkedList;
import ua.lviv.iot.model.*;
import ua.lviv.iot.model.AbstractStorage;
import ua.lviv.iot.storages.Basket;
import ua.lviv.iot.storages.FoodContainer;
import ua.lviv.iot.storages.Jar;
import ua.lviv.iot.storages.Thermos;

public class AbstractStorageManagerTest {
  protected List<AbstractStorage> baskets;
  protected List<AbstractStorage> jars;
  protected List<AbstractStorage> foodContainers;
  protected List<AbstractStorage> thermoses;

  public void createBaskets() {
    baskets = new LinkedList<AbstractStorage>();
    baskets.add(new Basket(20, 350, 2, "Ukraine", "Brown", null, false, true, BodyMaterial.WOOD));
    baskets.add(new Basket(12, 240, 1, "Hungary", "White", null, false, true, BodyMaterial.WOOD));
    baskets.add(new Basket(15, 200, 1.5, "US", "Light Green", null, false, true, BodyMaterial.WOOD));
  }

  public void createJars() {
    jars = new LinkedList<AbstractStorage>();
    jars.add(new Jar(2, 100, 0.3, "Imperium", null, null, BodyMaterial.GLASS));
    jars.add(new Jar(3, 1300, 0.4, "Italy", null, null, BodyMaterial.GLASS));
    jars.add(new Jar(5, 160, 0.5, "Poland", null, null, BodyMaterial.METAL));
  }

  public void createThermoses() {
    thermoses = new LinkedList<AbstractStorage>();
    thermoses.add(new Thermos(1, 300, 0.1, "Japan", "Red", null, BodyMaterial.PLASTIC));
    thermoses.add(new Thermos(1.5, 400, 0.9, "Germany", "Gray", "Adolf and Co", BodyMaterial.GLASS));
    thermoses.add(new Thermos(2, 350, 1.2, "China", "Pink", null, BodyMaterial.PLASTIC));
  }

  public void createFoodContainers() {
    foodContainers = new LinkedList<AbstractStorage>();
    foodContainers.add(new FoodContainer(5, 220, 0.4, "China", "White", "Eco Food Storaging", BodyMaterial.GLASS));
    foodContainers.add(new FoodContainer(3, 200, 0.3, "Poland", "Green", "Et", BodyMaterial.PLASTIC));
    foodContainers.add(new FoodContainer(4, 240, 0.25, "Uganda", "Blue", "Eco Food Storaging", BodyMaterial.GLASS));
  }

  public void createAllStorages() {
    createBaskets();
    createFoodContainers();
    createJars();
    createThermoses();
  }
}
