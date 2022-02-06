package inner;



public class Methodinner {

	public void display()
	{
		class Inner{
			
			int a=10;
			
			void print()
			{
				System.out.println("Method of Inner class");
				System.out.println("Value of a "+a);
			}
		}
		
		Inner inner= new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		Methodinner  outer =new Methodinner ();
		outer.display();
	}
}

