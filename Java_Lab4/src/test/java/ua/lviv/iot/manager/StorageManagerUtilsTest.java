package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.*;

public class StorageManagerUtilsTest extends StorageManagerTest {
  @BeforeEach
  void SetUp() {
    createAllStorages();
  }

  @Test
  public void testSortingAscending() {
    StorageManagerUtils.sortByWeight(thermoses, SortingType.ASCENDING);
    assertEquals(0.1, thermoses.get(0).getWeightInKilograms());
    assertEquals(0.9, thermoses.get(1).getWeightInKilograms());
    assertEquals(1.2, thermoses.get(2).getWeightInKilograms());

    StorageManagerUtils.sortByCapacity(baskets, SortingType.ASCENDING);
    assertEquals(12, baskets.get(0).getCapacityInLiters());
    assertEquals(15, baskets.get(1).getCapacityInLiters());
    assertEquals(20, baskets.get(2).getCapacityInLiters());

    StorageManagerUtils.sortByColor(thermoses, SortingType.ASCENDING);
    assertEquals("Gray", thermoses.get(0).getColor());
    assertEquals("Pink", thermoses.get(1).getColor());
    assertEquals("Red", thermoses.get(2).getColor());

    StorageManagerUtils.sortByPrice(thermoses, SortingType.ASCENDING);
    assertEquals(300, thermoses.get(0).getPriceInUAH());
    assertEquals(350, thermoses.get(1).getPriceInUAH());
    assertEquals(400, thermoses.get(2).getPriceInUAH());

  }

  @Test
  public void testSortingDescending() {
    StorageManagerUtils.sortByWeight(foodContainers, SortingType.DESCENDING);
    assertEquals(0.4, foodContainers.get(0).getWeightInKilograms());
    assertEquals(0.3, foodContainers.get(1).getWeightInKilograms());
    assertEquals(0.25, foodContainers.get(2).getWeightInKilograms());

    StorageManagerUtils.sortByCapacity(foodContainers, SortingType.DESCENDING);
    assertEquals(5, foodContainers.get(0).getCapacityInLiters());
    assertEquals(4, foodContainers.get(1).getCapacityInLiters());
    assertEquals(3, foodContainers.get(2).getCapacityInLiters());

    StorageManagerUtils.sortByColor(foodContainers, SortingType.DESCENDING);
    assertEquals("White", foodContainers.get(0).getColor());
    assertEquals("Green", foodContainers.get(1).getColor());
    assertEquals("Blue", foodContainers.get(2).getColor());

    StorageManagerUtils.sortByPrice(foodContainers, SortingType.DESCENDING);
    assertEquals(240, foodContainers.get(0).getPriceInUAH());
    assertEquals(220, foodContainers.get(1).getPriceInUAH());
    assertEquals(200, foodContainers.get(2).getPriceInUAH());

  }
}
