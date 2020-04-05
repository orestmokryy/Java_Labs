package ua.lviv.iot.storages;

import ua.lviv.iot.model.AbstractCappedStorage;
import ua.lviv.iot.model.JarFunction;

public class Jar extends AbstractCappedStorage {
	protected double bottleneckDiameter;
	protected JarFunction jarFunction;

	public double getBottleneckDiameter() {
		return bottleneckDiameter;
	}

	public JarFunction getJarFunction() {
		return jarFunction;
	}

	public void setJarFunction(JarFunction jarFunction) {
		this.jarFunction = jarFunction;
	}

	public void setBottleneckDiameter(double bottleneckDiameter) {
		this.bottleneckDiameter = bottleneckDiameter;
	}

	public Jar(double capacityInLiters, double priceInUAH, double weightInKilograms, String productionCountry,
			String color, String producer) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer);
	}
}