package ua.lviv.iot.storages;

import ua.lviv.iot.model.AbstractStorage;
import ua.lviv.iot.model.ContainerShape;

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
			String color, String producer, boolean hasHaft, boolean hasCover) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer);
		this.hasHaft = hasHaft;
		this.hasCover = hasCover;
	}
}
