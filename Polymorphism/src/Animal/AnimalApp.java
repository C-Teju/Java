package Animal;

public class AnimalApp {

	public static void main(String[] args) {
		Forest f=new Forest();
		f.acceptAnimal(new Tiger());
		f.acceptAnimal(new Deer());
		f.acceptAnimal(new Monkey());

	}

}
