package CollectionsFramework;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
       System.out.println(a);
       a.remove(0);
       System.out.println(a);
      if(a.contains("orange")){
          System.out.println("Orange is found");
      }
      else{
          System.out.println("Not found");
      }
      System.out.println(a.size());
       for(int i=0;i<a.size();i++){
    	   String fruit =a.get(i);
           System.out.println(a.indexOf(fruit)+"." + a.get(i));
          
           
           
       }
        
        

	}

}
