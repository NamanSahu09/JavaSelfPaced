package JavaSelfPaced.Arraylist;
import java.util.*;
public class twodArraylist {
  
  public static void main(String[] args)
  {
    ArrayList <ArrayList<String>> groceryList = new ArrayList <> ();
	  
	  
	  ArrayList<String> bakeryList = new ArrayList<String>();
	    bakeryList.add("pasta");
	    bakeryList.add("Garlic bread");
	    bakeryList.add("donuts");

	    ArrayList<String> produceList = new ArrayList<String>();
	    produceList.add("Tomatoes");
	    produceList.add("zucchini");
	    produceList.add("pepper");

	    ArrayList<String> drinksList = new ArrayList<String>();
	    drinksList.add("Soda");
	    drinksList.add("Coffee");

	    groceryList.add(bakeryList);
	    groceryList.add(produceList);
	    groceryList.add(drinksList);

    //System.out.println(groceryList);

  
    System.out.println(groceryList.get(2).get(1));
  
    
    


    System.out.println(bakeryList);
  }
}
