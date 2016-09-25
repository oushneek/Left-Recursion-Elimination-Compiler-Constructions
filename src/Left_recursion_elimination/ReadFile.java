/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Left_recursion_elimination;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tazbeea Tazakka
 */
public class ReadFile {
    public void read(){
        String line=new String();
        try {
              //  BufferedReader br = new BufferedReader(new FileReader("/home/ratul/NetBeansProjects/WordCountOushneek/src/wordcountoushneek/word.txt"));
                BufferedReader br = new BufferedReader(new FileReader("task3.txt"));

                
                while((line=br.readLine())!=null){
                    GetRecursion input=new GetRecursion();
                    input.run(line);
                    //System.out.println("next ");
                }
                
            
            }
        catch(IOException Ex){
            System.out.println("Exception");
        }
    }
}
