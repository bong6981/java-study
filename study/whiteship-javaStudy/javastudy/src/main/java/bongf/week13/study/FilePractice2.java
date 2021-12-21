package bongf.week13.study;

import java.io.*;

public class FilePractice2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader( "c:\\java2\\file_practice\\test.txt");
        FileWriter fileWriter = new FileWriter("c:\\java2\\file_practice\\fileout.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = "";
        for (int i =1; (line = bufferedReader.readLine()) != null; i++) {
            System.out.println(line);
            bufferedWriter.write(line);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
