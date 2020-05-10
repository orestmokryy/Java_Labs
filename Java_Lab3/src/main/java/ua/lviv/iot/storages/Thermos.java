package ua.lviv.iot.storages;

import ua.lviv.iot.model.BodyMaterial;
import ua.lviv.iot.model.ThermosType;
import ua.lviv.iot.model.AbstractCappedStorage;

public class Thermos extends AbstractCappedStorage {
	protected double bottleneckDiameter;
	protected ThermosType thermosType;
	protected Integer id;

	public ThermosType getThermosType() {
		return thermosType;
	}

	public void setThermosType(ThermosType thermosType) {
		this.thermosType = thermosType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Thermos(double capacityInLiters, double priceInUAH, double weightInKilograms, String productionCountry,
			String color, String producer, BodyMaterial bodyMaterial) {
		super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer, bodyMaterial);
	}
	public Thermos() {
		super();
	}
	public double getBottleneckDiameter() {
		return bottleneckDiameter;
	}

	public void setBottleneckDiameter(double bottleneckDiameter) {
		this.bottleneckDiameter = bottleneckDiameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bottleneckDiameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((thermosType == null) ? 0 : thermosType.hashCode());
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
		Thermos other = (Thermos) obj;
		if (Double.doubleToLongBits(bottleneckDiameter) != Double.doubleToLongBits(other.bottleneckDiameter))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (thermosType != other.thermosType)
			return false;
		return true;
	}
}