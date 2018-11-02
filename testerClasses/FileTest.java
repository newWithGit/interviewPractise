package testerClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class FileTest {
  public static void main(String[] args) {
    /*try (BufferedReader br = new BufferedReader(new FileReader("/media/saurav/BC5E72695E721C78/Coding/puchu/junk.txt"));) {
      //System.getProperty(line.seperator);
        //read(br);
        //readLines(br);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }*/
    File file = new File("/media/saurav/BC5E72695E721C78/Coding/puchu/fileWrite.txt");
    try (
    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
    BufferedReader br = new BufferedReader(new FileReader(file));) {
      //writeToFile(bw);
      String lineToWrite = "I am learning java fast.";
      writeArray(bw, lineToWrite);
      readLines(br);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  private static void readLines(BufferedReader br) throws IOException {
    String line = null;
    while ((line = br.readLine()) != null)
      System.out.println(line);
  }

  /*private static void read(BufferedReader br) {
    int data = 0;
    while ((data = br.read()) != -1)
      System.out.println((char) data);
  }*/

  private static void writeToFile(final BufferedWriter bw) throws IOException, Exception {
    bw.write(98);
    bw.newLine();
    bw.write(99);
  }

  private static void writeArray(final BufferedWriter bw, final String str) throws IOException {
    bw.newLine();
    bw.write(str, 3, str.length()-4); // array, starting position, length till write
    bw.flush();
  }

}
