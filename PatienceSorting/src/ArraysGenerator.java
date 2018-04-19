import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class ArraysGenerator {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        for (int i = 100; i <= 10000; i += 100) {
            int [] array = new int[i];
            String filename = "arrays" + Integer.toString(i) + ".txt";
            try (FileWriter writer = new FileWriter(filename, false)) {
                for (int j = 0; j < array.length; j++) {
                    array[j] = r.nextInt(200001)-100000; // -100000 - это от какого начинаем, и 200000 - это диапазон
                    writer.write(array[j] + " ");
                }
                writer.close();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}