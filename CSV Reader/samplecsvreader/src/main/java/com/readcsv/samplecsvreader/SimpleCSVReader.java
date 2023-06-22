package com.readcsv.samplecsvreader;

import java.io.*;
public class SimpleCSVReader {
   public static final String delimiter = ",";
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
            tempArr = line.split(delimiter);
            for(String tempStr : tempArr) {
               System.out.print(tempStr + " ");
            }
            System.out.println();
         }
         br.close();
         } catch(IOException e) {
            e.printStackTrace();
         }
   }
   public static void main(String[] args) {
      // csv file to read
      String csvFile = "./src/main/java/SampleCSV_File.csv";
       SimpleCSVReader.read(csvFile);
   }
}
