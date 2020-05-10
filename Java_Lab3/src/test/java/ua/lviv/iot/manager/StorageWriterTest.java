package ua.lviv.iot.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.model.AbstractStorage;

public class StorageWriterTest extends StorageManagerTest {

  private static final String FILE_PATH = "storages.csv";

  @BeforeEach
  public void setUp() {
    createAllStorages();
  }

  @Test
  public void writeToFile() throws IOException {

    try (Writer writerToFile = new FileWriter(FILE_PATH)) {

      StorageWriter writer = new StorageWriter();
      writer.setStorageWriter(writerToFile);
      writer.writeToFile(jars);

    }
  }

  @Test
  public void testWriting() throws IOException {
    try (Writer csvWriter = new StringWriter()) {

      StorageWriter writer = new StorageWriter();
      writer.setStorageWriter(csvWriter);
      writer.writeToFile(jars);

      String writtenString = "";

      for (AbstractStorage storage : jars) {
        writtenString += storage.getHeaders() + "\n" + storage.toCSV() + "\n";
      }

      assertEquals(writtenString, writer.toString());

    }
  }

}