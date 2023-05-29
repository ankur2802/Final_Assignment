class Fruit {

	Fruit() 
  {
    System.out.println("I am a Fruit");
  }

  Fruit(String type) 
  {
	  this();
    System.out.println("Type: "+type);
  }
}

class Mango extends Fruit {

 Mango() {

    //super();
    super("Fruit");

    System.out.println("I am a Mango");
  }
}
public class Question_2 {

	public static void main(String[] args) {
		Mango d= new Mango();
		}

}
