package homework2;

import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = null;
        try {
            File file = new File("E:\\function.txt");
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            double x = 1.00;
            while (x <= 2.00) {
                double y;
                y = x * x + 2 * x + 3;
                bw.write(String.valueOf(df.format(y)));
                bw.newLine();
                x += 0.01;
            }
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }

        }
        BufferedReader dataReader = new BufferedReader(new FileReader("E:\\function.txt"));
        String line;
        List<Double> doubles = new ArrayList<>();

        while ((line = dataReader.readLine()) != null) {
            doubles.add(Double.parseDouble(line));
        }

        dataReader.close();

        System.out.println("Min number in file: " + Collections.min(doubles));
        System.out.println("Max number in file: " + Collections.max(doubles));

    }
}


