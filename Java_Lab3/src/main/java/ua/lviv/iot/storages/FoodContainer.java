package ua.lviv.iot.storages;

import ua.lviv.iot.model.BodyMaterial;
import ua.lviv.iot.model.ContainerShape;
import ua.lviv.iot.model.ContainerType;
import ua.lviv.iot.model.AbstractCappedStorage;

public class FoodContainer extends AbstractCappedStorage {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((containerShape == null) ? 0 : containerShape.hashCode());
		result = prime * result + ((containerType == null) ? 0 : containerType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodContainer other = (FoodContainer) obj;
		if (containerShape != other.containerShape)
			return false;
		if (containerType != other.containerType)
			return false;
		return true;
	}

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
			String color, String producer, BodyMaterial bodyMaterial) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer, bodyMaterial);
	}

}