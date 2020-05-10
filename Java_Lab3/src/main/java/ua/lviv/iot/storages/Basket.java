package ua.lviv.iot.storages;

import ua.lviv.iot.model.BodyMaterial;
import ua.lviv.iot.model.ContainerShape;
import ua.lviv.iot.model.AbstractStorage;

public class Basket extends AbstractStorage {

	protected boolean hasHaft;
	protected boolean hasCover;
	protected ContainerShape basketShape;

	public boolean isHasHaft() {
		return hasHaft;
	}

	public void setHasHaft(boolean hasHaft) {
		this.hasHaft = hasHaft;
	}

	public boolean isHasCover() {
		return hasCover;
	}

	public void setHasCover(boolean hasCover) {
		this.hasCover = hasCover;
	}

	public ContainerShape getBasketShape() {
		return basketShape;
	}

	public void setBasketShape(ContainerShape basketShape) {
		this.basketShape = basketShape;
	}

	public Basket(double capacityInLiters, double priceInUAH, double weightInKilograms, String productionCountry,
			String color, String producer, boolean hasHaft, boolean hasCover, BodyMaterial bodyMaterial) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer, bodyMaterial);
		this.hasHaft = hasHaft;
		this.hasCover = hasCover;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((basketShape == null) ? 0 : basketShape.hashCode());
		result = prime * result + (hasCover ? 1231 : 1237);
		result = prime * result + (hasHaft ? 1231 : 1237);
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
		Basket other = (Basket) obj;
		if (basketShape != other.basketShape)
			return false;
		if (hasCover != other.hasCover)
			return false;
		if (hasHaft != other.hasHaft)
			return false;
		return true;
	}
}
