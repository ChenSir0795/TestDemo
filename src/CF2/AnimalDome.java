package CF2;

public class AnimalDome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Cat();
		//System.out.println();
		AnimalOperation ao=new AnimalOperation();
		Cat c=new Cat();
		ao.useanimal(c);
		Dog d=new Dog();   
		ao.useanimal(d);
	}

}
