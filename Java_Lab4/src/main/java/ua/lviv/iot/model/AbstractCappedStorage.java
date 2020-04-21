package ua.lviv.iot.model;

public abstract class AbstractCappedStorage extends AbstractStorage {

  protected double height;

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public AbstractCappedStorage(double capacityInLiters, double priceInUAH, double weightInKilograms,
      String productionCountry, String color, String producer, BodyMaterial bodyMaterial) {
    super(capacityInLiters, priceInUAH, weightInKilograms, productionCountry, color, producer, bodyMaterial);

  }
}
