package ua.lviv.iot.model;

public abstract class AbstractStorage {

	protected double capacityInLiters;
	protected double priceInUAH;
	protected double weightInKilograms;
	protected String productionCountry;
	protected String color;
	protected String producer;

	public BodyMaterial getBodyMaterial() {
		return bodyMaterial;
	}

	public void setBodyMaterial(BodyMaterial bodyMaterial) {
		this.bodyMaterial = bodyMaterial;
	}

	protected BodyMaterial bodyMaterial;

	public double getCapacityInLiters() {
		return capacityInLiters;
	}

	public void setCapacityInLiters(double capacityInLiters) {
		this.capacityInLiters = capacityInLiters;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public double getWeightInKilograms() {
		return weightInKilograms;
	}

	public void setWeightInKilograms(double weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public AbstractStorage(double capacityInLiters, double priceInUAH, double weightInKilograms,
			String productionCountry, String color, String producer) {
		this.capacityInLiters = capacityInLiters;
		this.priceInUAH = priceInUAH;
		this.weightInKilograms = weightInKilograms;
		this.productionCountry = productionCountry;
		this.color = color;
		this.producer = producer;
	}
}
