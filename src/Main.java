
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car(0,0,"");
		
		Sedan sedan1 = new Sedan(90 ,500000 ,"Kırmızı" ,21);
		
		System.out.println("Sedan modelinin satış fiyatı:" + sedan1.getSalePrice());
		
		Ford ford1 = new Ford(70 ,300000 ,"Beyaz",3,26000);
		
		System.out.println("Ford1 modelinin satış fiyatı:" + ford1.getSalePrice());
		
		Ford ford2 = new Ford(60 ,370000,"Siyah",1,47000);
		
		System.out.println("Ford2 modelinin satış fiyatı:" + ford2.getSalePrice());

		
		

	}

}
