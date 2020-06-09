package inf.informatics;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//
//        File fileReference = new File("resources/enemy_teritory");
//        try {
//            FileReader fileReferenceReader = new FileReader(fileReference);
//            BufferedReader bufferedReader = new BufferedReader(fileReferenceReader);
//
//            System.out.println(bufferedReader.readLine());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }
    public static void print2d(String[][]arr){
        for (int i =0;i<arr.length;i++)
        for (int j =0; j<arr.length;j++){
            System.out.print(arr[i][j] + " ");
        }
    }
}
