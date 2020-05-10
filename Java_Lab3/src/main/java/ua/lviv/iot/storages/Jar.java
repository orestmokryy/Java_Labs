package ua.lviv.iot.storages;

import ua.lviv.iot.model.BodyMaterial;
import ua.lviv.iot.model.JarFunction;
import ua.lviv.iot.model.AbstractCappedStorage;

public class Jar extends AbstractCappedStorage {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bottleneckDiameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((jarFunction == null) ? 0 : jarFunction.hashCode());
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
		Jar other = (Jar) obj;
		if (Double.doubleToLongBits(bottleneckDiameter) != Double.doubleToLongBits(other.bottleneckDiameter))
			return false;
		if (jarFunction != other.jarFunction)
			return false;
		return true;
	}

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
			String color, String producer, BodyMaterial bodyMaterial) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer, bodyMaterial);
	}
}