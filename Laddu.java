package com.epamwork.hometask12;
import java.util.Map;
public class Laddu implements Giftbox{
	public int calculate_weight(int weight,int quantity) {
		return weight*quantity;
	}
	public void print(Map<String, Integer> map) 
    { 
        if (map.isEmpty()) { 
            System.out.println("map is empty"); 
        } 
  
        else { 
            System.out.println(map); 
        } 
    }
}
