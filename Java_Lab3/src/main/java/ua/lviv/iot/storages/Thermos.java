package ua.lviv.iot.storages;

import ua.lviv.iot.model.AbstractCappedStorage;
import ua.lviv.iot.model.ThermosType;

public class Thermos extends AbstractCappedStorage {
	protected double bottleneckDiameter;
	protected ThermosType thermosType;

	public ThermosType getThermosType() {
		return thermosType;
	}

	public void setThermosType(ThermosType thermosType) {
		this.thermosType = thermosType;
	}

	public Thermos(double capacityInLiters, double priceInUAH, double weightInKilograms, String productionCountry,
			String color, String producer) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer);
	}

	public double getBottleneckDiameter() {
		return bottleneckDiameter;
	}

	public void setBottleneckDiameter(double bottleneckDiameter) {
		this.bottleneckDiameter = bottleneckDiameter;
	}
}