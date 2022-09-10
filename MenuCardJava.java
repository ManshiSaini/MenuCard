import java.util.ArrayList;
import java.util.List;
public class MenuCardJava{
    public static void main(String[] args) {
        Cake cake1 = new Cake();
        Cake cake2 = new Cake();
        Pastry pastry1 = new Pastry();
         Pastry pastry2 = new Pastry();
  
         cake1.setName("Chocolate Brownie");
         cake1.setPrice(250f);
         cake2.setName("Chocolate maple");
         cake2.setPrice(350f);
         pastry1.setName("Black Forest");
	pastry1.setPrice(35f);
		pastry2.setName("Choco Truffle");
		pastry2.setPrice(40f);
                /* ArrayList for `Cakes` & `Pastries` */
		ArrayList<Cake> cakesList = new ArrayList<Cake>();
		cakesList.add(cake1);
		cakesList.add(cake2);
		List<Pastry> pastriesList;
        pastriesList = new ArrayList<Pastry>();
		pastriesList.add(pastry1);
		pastriesList.add(pastry2);
	
		System.out.println("        Today's Special Menu        ");
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("Special Cakes                       ");
		System.out.println("------------------------------------");
		/*cake1.display();
		cake2.display();*/
		for (Cake object : cakesList)
		{
			object.display();
		}
	
		System.out.println();
		System.out.println("Special Pastries                    ");
		System.out.println("------------------------------------");
		/*pastry1.display();
		pastry2.display();*/
	for (Pastry object : pastriesList)
		{
			object.display();
		}
        
    }
}
    


class Cake{
    String name;
     float price;
    //use the Getter and setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getPrice(){
        return price;
}
    public void setPrice(float price){
        this.price = price;
    }
    void display()
    {
        System.out.println(name+" : " + '\u20B9'+" " + price+ "per pound");
    }
}
   class Pastry extends Cake {
       @Override
       void display(){
           System.out.println(name+" : " + '\u20B9'+" " + price+ "per pound");
       }
} 

