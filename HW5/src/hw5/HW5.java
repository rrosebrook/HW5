/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * HW5 - Create a word counter for submitted text that will count the number of
 * times each individual word shows up in a set text file.
 * September 2017
 * Rachel Rosebrook
 */
public class HW5 {
    
    static ArrayList<String> text = new ArrayList<>();
    static String file1 = ""; //= "C:/Users/Public/Documents/Test.txt";
    static String[] arr; 

    /**
     * @param args the command line arguments
     */
    public static void getTextFile() {
        System.out.println("What is the location of the file?");
        Scanner fileloc = new Scanner(System.in);
        file1 = fileloc.nextLine();  
    }
    
    public static void turnTextToArray() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file1));
        while (sc.hasNext()) {
            text.add(sc.next());
            }

        arr = text.toArray(new String[0]);
        
    }
    
    public static void removeNonWords() {
       for(int i=0; i<text.size(); i++) {
           arr[i] = arr[i].replaceAll("[^a-zA-Z']", "");
       } 
       System.out.println(java.util.Arrays.toString(arr));
    }
    
    public static void changeToLowerCase() {
        for(int i=0; i<text.size(); i++) {
            arr[i] = arr[i].toLowerCase();
        }
        System.out.println(java.util.Arrays.toString(arr));
        
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        getTextFile();
        turnTextToArray();
        removeNonWords();
        changeToLowerCase();
    
    }
    
}
