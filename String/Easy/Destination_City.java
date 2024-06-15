/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

/**
 *
 * @author Satyam
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

 

Example 1:

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
Example 2:

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly the destination city is "A".
Example 3:

Input: paths = [["A","Z"]]
Output: "Z"
 

Constraints:

1 <= paths.length <= 100
paths[i].length == 2
1 <= cityAi.length, cityBi.length <= 10
cityAi != cityBi
 */
import java.util.*;
public class Destination_City {
    
     public String destCity(List<List<String>> paths) 
    {
// Set is more good for searching than list 
 Set<String> cities = new HashSet<>();

for(List<String> path: paths)
{
    cities.add(path.get(0));
}
for(List<String> path:paths)
{
    String dest = path.get(1);
    if(!cities.contains(dest))
    {
        return dest;
    }
}

return "";

  //optimized->      
//         HashMap<String , String>map = new HashMap<>();
//         for(int i=0; i<paths.size(); i++)
//         {
//             List<String> s = new ArrayList<>();
//             s=paths.get(i);
//             map.put(s.get(0),s.get(1));
//         }

// String string="";
//     for(String s:map.values())
//     {

//         if(!map.containsKey(s))
//         {
//             string=s;
//         }
//     }
// return string;
        
    }
    
    public static void main(String [] arg)
    {
    
    
    
    }
    
}
