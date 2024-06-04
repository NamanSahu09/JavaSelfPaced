
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("Naman",21,64.2);
		//Constructors creates a instance of a class 
		//helps to initialize different attributes to each object 
		System.out.println(human.name);
		Human human2 = new Human("Kiran",22,80);
		System.out.println(human2.name);
		System.out.println();
		human2.eat();
		human.drink();
		
	}

}
