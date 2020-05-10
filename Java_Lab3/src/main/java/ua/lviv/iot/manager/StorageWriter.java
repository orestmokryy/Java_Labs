package ua.lviv.iot.manager;

import ua.lviv.iot.model.AbstractStorage;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class StorageWriter {
  private Writer storageWriter;

  public void setStorageWriter(Writer storageWriter) {
    this.storageWriter = storageWriter;
  }

  public void writeToFile(List<AbstractStorage> storages) throws IOException {
    for (AbstractStorage storage : storages) {
      writeLine(this.storageWriter, storage.getHeaders());
      writeLine(this.storageWriter, storage.toCSV());
    }
    this.storageWriter.flush();
  }

  private void writeLine(Writer storageWriter, String line) throws IOException {
    storageWriter.write(line + "\n");
  }

  @Override
  public String toString() {
    return storageWriter.toString();
  }
}