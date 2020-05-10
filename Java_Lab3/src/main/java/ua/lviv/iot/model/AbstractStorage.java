package ua.lviv.iot.model;

public abstract class AbstractStorage {
	protected Integer id;
	protected double capacityInLiters;
	protected double priceInUAH;
	protected double weightInKilograms;
	protected String productionCountry;
	protected String color;
	protected String producer;

	public AbstractStorage(double capacityInLiters2, double priceInUAH2, double weightInKilograms2,
			String productionCountry2, String color2, String producer2, BodyMaterial bodyMaterial) {
	}

	

	public double getCapacityInLiters() {
		return capacityInLiters;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public double getWeightInKilograms() {
		return weightInKilograms;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public String getColor() {
		return color;
	}

	public String getProducer() {
		return producer;
	}

	public String getHeaders() {
		return "capacityInLiters, priceInUAH, weigthInKilograms, productionCountry, color, producer";
	}

	public String toCSV() {
		return "capacityInLiters" + getCapacityInLiters() + "priceInUAH" + getPriceInUAH() + "weigthInKilograms"
				+ getWeightInKilograms() + "productionCountry" + getProductionCountry() + "color" + getColor()
				+ "producer" + getProducer();
	}

	public AbstractStorage(Integer id, double capacityInLiters, double priceInUAH, double weightInKilograms,
			String productionCountry, String color, String producer) {
		super();
		this.id = id;
		this.capacityInLiters = capacityInLiters;
		this.priceInUAH = priceInUAH;
		this.weightInKilograms = weightInKilograms;
		this.productionCountry = productionCountry;
		this.color = color;
		this.producer = producer;
	}

	public AbstractStorage() {
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacityInLiters);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		temp = Double.doubleToLongBits(priceInUAH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		result = prime * result + ((productionCountry == null) ? 0 : productionCountry.hashCode());
		temp = Double.doubleToLongBits(weightInKilograms);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractStorage other = (AbstractStorage) obj;
		if (Double.doubleToLongBits(capacityInLiters) != Double.doubleToLongBits(other.capacityInLiters))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(priceInUAH) != Double.doubleToLongBits(other.priceInUAH))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (productionCountry == null) {
			if (other.productionCountry != null)
				return false;
		} else if (!productionCountry.equals(other.productionCountry))
			return false;
		if (Double.doubleToLongBits(weightInKilograms) != Double.doubleToLongBits(other.weightInKilograms))
			return false;
		return true;
	}
}