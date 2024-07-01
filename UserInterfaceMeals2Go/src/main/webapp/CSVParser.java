package main.webapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVParser {
	ArrayList<CRItem>items = new ArrayList<>();
	
    public ArrayList<CRItem>getMenu(){
        String csvFile = "/home/watso/eclipse_Workspace_JEEE/Parsers/src/com/J1ggy/CafeRomaMenu.csv";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(cvsSplitBy);
                // Assuming the CSV columns are in the order: id, name, price, description, options
                CRItem item = new CRItem(fields[0], fields[1], fields[2], fields[3], fields[4]);
               this. items.add(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Print the list to verify
        for (CRItem item : items) {
            System.out.println(item);
        }*/
        return items;
    }
}