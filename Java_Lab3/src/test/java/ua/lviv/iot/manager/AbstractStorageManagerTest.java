package ua.lviv.iot.manager;

import java.util.List;
import java.util.LinkedList;
import ua.lviv.iot.model.*;
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
		baskets.add(new Basket(20, 350, 2, "Ukraine", "Brown", null, false, true));
		baskets.add(new Basket(12, 240, 1, "Hungary", "White", null, false, true));
		baskets.add(new Basket(0, 0, 0, null, null, null, false, false));
	}

	public void createJars() {
		jars = new LinkedList<AbstractStorage>();
		jars.add(new Jar(2, 100, 0.3, null, null, null));
		jars.add(new Jar(5, 160, 0.5, "Poland", null, null));
		jars.add(new Jar(0, 0, 0, null, null, null));
	}

	public void createThermoses() {
		thermoses = new LinkedList<AbstractStorage>();
		thermoses.add(new Thermos(1.5, 400, 1, "Germany", "Metalic", "Adolf and Co"));
		thermoses.add(new Thermos(1.5, 400, 1, "China", "Pink", null));
		thermoses.add(new Thermos(0, 0, 0, null, null, null));
	}

	public void createFoodContainers() {
		foodContainers = new LinkedList<AbstractStorage>();
		foodContainers.add(new FoodContainer(5, 240, 0.3, null, "White", "Eco Food Storaging"));
		foodContainers.add(new FoodContainer(3, 200, 0.25, null, "Green", "Et"));
		foodContainers.add(new FoodContainer(0, 0, 0, null, null, null));
	}

	public void createAllStorages() {
		createBaskets();
		createFoodContainers();
		createJars();
		createThermoses();
	}
}
