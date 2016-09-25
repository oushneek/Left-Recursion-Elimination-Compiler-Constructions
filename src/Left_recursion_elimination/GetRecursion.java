/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Left_recursion_elimination;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Tazbeea Tazakka
 */
public class GetRecursion {
    public void run(String line){
        System.out.println("Input : "+line);
        StringTokenizer tokenizer=new StringTokenizer(line,"=|");
        
        
        String first=tokenizer.nextToken();
        String next=new String();
        
        ArrayList<String> recursive=new ArrayList<String>();
        ArrayList<String> notRecursive=new ArrayList<>();
       
        while(tokenizer.hasMoreTokens()){
            //System.out.println("token= "+tokenizer.nextToken());
            next=tokenizer.nextToken();
            if(next.startsWith(first)){
                next=next.replaceFirst(first,"");
                recursive.add(next);
            }
            else{
                notRecursive.add(next);
            }
        }
        
        Eliminate recursions=new Eliminate();
        recursions.eliminate(first,recursive, notRecursive);

    }
}
