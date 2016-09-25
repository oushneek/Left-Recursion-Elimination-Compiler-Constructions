/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Left_recursion_elimination;

import java.util.ArrayList;

/**
 *
 * @author Tazbeea Tazakka
 */
public class Eliminate {
    public void eliminate(String first,ArrayList<String> recursive,ArrayList<String> notRecursive){
        String a=new String();
        String b=new String();
        int i;
        for(i=0;i<notRecursive.size()-1;i++){
            a+=notRecursive.get(i);
            a+=first;
            a+="`";
            a+="|";
        }
        a+=notRecursive.get(i);
        a+=first;
        a+="`";
        
        String firstoutput=first+"="+a;
        System.out.println(firstoutput);

        i=0;
        for(i=0;i<recursive.size()-1;i++){
            b+=recursive.get(i);
            b+=first;
            b+="`";
            b+="|";
        }
        b+=recursive.get(i);
        b+=first;
        b+="`";
        
        String secondoutput=first+"'="+b;
        System.out.println(secondoutput);
    }
}
