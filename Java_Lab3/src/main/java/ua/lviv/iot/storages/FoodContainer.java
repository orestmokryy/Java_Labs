package ua.lviv.iot.storages;

import ua.lviv.iot.model.AbstractCappedStorage;
import ua.lviv.iot.model.ContainerShape;
import ua.lviv.iot.model.ContainerType;

public class FoodContainer extends AbstractCappedStorage {
	protected ContainerType containerType;

	public ContainerType getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}

	public ContainerShape getContainerShape() {
		return containerShape;
	}

	public void setContainerShape(ContainerShape containerShape) {
		this.containerShape = containerShape;
	}

	protected ContainerShape containerShape;

	public FoodContainer(double capacityInLiters, double priceInUAH, double weightInKilograms, String productionCountry,
			String color, String producer) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer);
	}

}