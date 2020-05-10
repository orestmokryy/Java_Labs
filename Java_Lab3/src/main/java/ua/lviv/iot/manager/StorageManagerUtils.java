package ua.lviv.iot.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.model.SortingType;
import ua.lviv.iot.model.AbstractStorage;

public class StorageManagerUtils {
  static SortingType sortingType;

  public static void sortByWeight(List<AbstractStorage> storages, SortingType sortingType) {
    if (sortingType == SortingType.ASCENDING) {
      storages.sort(new StorageSorterByWeight());
    }
    if (sortingType == SortingType.DESCENDING) {
      storages.sort(new StorageSorterByWeight().reversed());
    }
  }

  static class StorageSorterByWeight implements Comparator<AbstractStorage> {

    @Override
    public int compare(AbstractStorage firstStorage, AbstractStorage secondStorage) {
      return (int) (firstStorage.getWeightInKilograms() - secondStorage.getWeightInKilograms());
    }
  }

  public static void sortByColor(List<AbstractStorage> storages, SortingType sortingType) {
    if (sortingType == SortingType.ASCENDING) {
      storages.sort(new StorageManagerUtils().new StorageSorterByColor());
    }
    if (sortingType == SortingType.DESCENDING) {
      storages.sort(new StorageManagerUtils().new StorageSorterByColor().reversed());
    }
  }

  class StorageSorterByColor implements Comparator<AbstractStorage> {

    @Override
    public int compare(AbstractStorage firstStorage, AbstractStorage secondStorage) {
      return firstStorage.getColor().compareTo(secondStorage.getColor());
    }
  }

  public static void sortByCapacity(List<AbstractStorage> storages, SortingType sortingType) {
    Comparator<AbstractStorage> comparator = new Comparator<AbstractStorage>() {
      @Override
      public int compare(AbstractStorage firstStorage, AbstractStorage secondStorage) {
        return (int) (firstStorage.getCapacityInLiters() - secondStorage.getCapacityInLiters());
      }
    };
    storages.sort(sortingType == SortingType.ASCENDING ? comparator : comparator.reversed());
  }

  static Comparator<AbstractStorage> SorterByPrice = (AbstractStorage firstStorage,
      AbstractStorage secondStorage) -> (int) (firstStorage.getPriceInUAH() - secondStorage.getPriceInUAH());

  public static void sortByPrice(List<AbstractStorage> storages, SortingType sortingType) {
    if (sortingType == SortingType.ASCENDING) {
      storages.sort(SorterByPrice);
    } else if (sortingType == SortingType.DESCENDING) {
      storages.sort(SorterByPrice.reversed());
    }
  }
}