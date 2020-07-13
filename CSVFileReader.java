package LitmusBloxProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Write a java program that does the following:
// Reads the attached csv file.
// Will print Status, Priority, Deadline, Fixed Cost, Actual Hrs columns in the console.
// Will print the total of Fixed Cost & Actual Hrs columns.

// STATUS	            PRIORITY	DEADLINE	TASK NAME	ASSIGNEE	DESCRIPTION	DELIVERABLE	% DONE	FIXED COST	    EST. HRS	ACTUAL HRS
//                                                                                                38%	    $1,640.00 	 55	            56      
// On Hold	                High	9/9/2017	Task		             Details 1		          100%	    $200.00 	 30             25
// Not Yet Started	        Low	    9/10/2017	Task		             Details 2		          50%	    $600.00 	 11             10
// In Progress	            Medium	9/11/2017	Task		             Details 3		          0%	    $800.00 	 12	            18
// Complete	                Medium	9/12/2017	Task		             Details 4		          0%	    $40.00 	     2	            3

public class CSVFileReader {
    public static void main(String[] args) {
        String fixedCost = "";
        String arr[];
        double actualHours = 0.0;
        String csvFile = "J:/Java/LitmusBloxProject/JavaProject.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                System.out.println(data[0]+"  "+data[1]+"   "+data[2]+"   "+data[8] + "    " + data[10]);
                // fixedCost += Long.parseLong(data[8]);
                // actualHours += Double.parseDouble(data[10]);
                arr = data[8].split("\\$");
                int i;
                for(i=0; i<arr.length;i++){
                    
                }
                fixedCost = fixedCost + arr[--i];
            }
            System.out.println("Fixed Cost : "+fixedCost);
            System.out.println("Total Actual Hours : "+actualHours);

        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }

    }
    
}