
public class MeterConversionUnit {
	double value;

	public MeterConversionUnit(double value) {
		super();
		this.value = value;
	}
	

}
 class Centimeter extends MeterConversionUnit {

	public Centimeter(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	
   public double convertToCm(double value)
   {
	   return value*1000;
   }

}
 class Kilometer extends MeterConversionUnit {

	public Kilometer(double value) {
		super(value);
		// TODO Auto-generated constructor stub
		
	}
	 public double convertToKm(double value)
	   {
		   return value/1000;
	   }

	

}
