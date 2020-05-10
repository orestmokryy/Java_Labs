package ua.lviv.iot.model;

import ua.lviv.iot.model.AbstractCappedStorage;

public class Cap extends AbstractCappedStorage {

	protected double capDiameterInCantimeters;

	protected CapMaterial capMaterial;

	public double getCapDiameterInCantimeters() {
		return capDiameterInCantimeters;
	}
	public void setCapDiameterInCantimeters(double capDiameterInCantimeters) {
		this.capDiameterInCantimeters = capDiameterInCantimeters;
	}

	public Cap(double capacityInLiters, double priceInUAH, double weightInKilograms, String productionCountry,
			String color, String producer, BodyMaterial bodyMaterial) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer, bodyMaterial);

	}
}