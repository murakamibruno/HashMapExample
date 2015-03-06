/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bruno_akira
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HashMap<Integer,Profile> hashMap = new HashMap<Integer,Profile>();
        Profile bruno = new Profile("Bruno",22,"12345");
        Profile christian = new Profile("Christian", 25, "23456");
        Profile john = new Profile("John", 40, "54545");
        
        hashMap.put(1,bruno);
        hashMap.put(2,christian);
        hashMap.put(3,john);
       
        
        for (Map.Entry<Integer,Profile> entry : hashMap.entrySet())
        {
            int empId = entry.getKey();
            Profile profile = entry.getValue();
            System.out.println(empId + "   " + profile);
        }
    }
    
}
