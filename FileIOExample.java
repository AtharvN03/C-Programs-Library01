import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a file I/O example in Java.\n");
            writer.write("We are writing and then reading from the same file.");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            System.out.println("\nReading data from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
