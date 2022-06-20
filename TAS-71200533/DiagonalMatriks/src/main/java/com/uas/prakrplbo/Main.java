//Nicolas Gabrian Sugiarto - 71200533 - PRAK-RPL-BO//
package com.uas.prakrplbo;

import java.io.*;

public class Main {

    public Main() throws FileNotFoundException{
        String line = "", fileContent = "";
        try {
            BufferedReader fileInput = new BufferedReader(
                    new FileReader(new File("src/soal.txt")));
            line = fileInput.readLine();
            fileContent = line + "\n";
            while (line != null) {
                line = fileInput.readLine();
                if (line != null)
                    fileContent += line + "\n";
            }
            fileInput.close();
        }
        catch(EOFException eofe) {
            System.out.println("No more lines to read.");
            System.exit(0);
        }
        catch(IOException ioe) {
            System.out.println("Error reading file.");
            System.exit(0);
        }
        //System.out.println(fileContent);//

        String input[] = fileContent.split("\n");
        int baris=1;
        int testCase = Integer.parseInt(input[0]);
        for(int i=0 ; i<testCase ; i++){
            int x,y;
            String diagonal[] = input[baris].split(" ");
            y = Integer.parseInt(diagonal[0]);
            x = Integer.parseInt(diagonal[1]);
            baris = baris + 1;
            if(x != y){
                //System.out.println(x + " "+y);//
                System.out.println("-1");
            }
            else{
                int arr[][] = new int [x+1][x+1];
                //System.out.println(input[baris]);//
                for(int j=0 ; j<y ; j++){
                    String temp[] = input[baris+j].split(" ");
                    for(int k=0 ; k<x ; k++){
                        arr[j][k] = Integer.parseInt(temp[k]);
                    }
                } // masukin angka ke arr dalam bentuk 2d array - dari line ke-baris
                int total = 0;
                for(int k=0 ; k<x ; k++){
                    total = total + arr[k][k];
                }
                System.out.println(total);
            }
            baris = baris + y;
        }
    }




    public static void main(String[] args) throws IOException {
        new Main();
    }
}
