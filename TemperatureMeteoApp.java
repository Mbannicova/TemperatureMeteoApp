import java.util.Random;
import java.util.Scanner;

public class TemperatureMeteoApp {

	public static void main(String[] args) {
	int cityCode = inputCityCode();

	PrivateMeteoProvider.getCurrentHumidity(cityCode);
		
	}
		
	static int inputCityCode () {
		
	System.out.println("Input city code: \n Moldova - 498 \n Russian Federation - 643 \n "
			+ "Turkey - 792 \n Greece - 300 \n Italy - 380");			
	        
	Scanner code = new Scanner (System.in);
	int answer = code.nextInt();
	return answer;
	}

	} 
   
   class OpenMeteoProvider {
	   
	   static float getRandomNumber() {
		    Random random = new Random();
		    int ri = random.nextInt(50);
		    int minus = random.nextInt(2);
		    if (minus > 0) {
		      ri = ri * -1;
		    }

		    float a = random.nextFloat() * 10;
		    int b = (int) a;
		    float rdd = (float) b;
		    float rd = rdd / 10; 
		    float result = (float) (ri + rd);
		    return result;
		  }
   
	static void getCurrentTemperature( int countryCode ){
		 float r = getRandomNumber();   

		 switch (countryCode) {
		 case (498):
		 System.out.println("Temperature in Moldova = " + r);	
		 break;
		 
		 case (643):
		 System.out.println("Temperature in Russian Federation = " + r);
		 break;
		 
		 case (792):
		 System.out.println("Temperature in Turkey = " + r);
		 break; 
		 
		 case (300):
		 System.out.println("Temperature in Greece = " + r);
		 break;
		 
		 case (380):
		 System.out.println("Temperature in Italy = " + r );
		 break;	
		 
		 default:
		System.out.println("Can't provide data for this country!");	 
		break;
			 
			 
		 }
	      
	   }
	 
}
   

 
   
   class PrivateMeteoProvider extends OpenMeteoProvider {
	   static byte getRandomNumber2() {
		   
		    Random random = new Random();
		    int ri = random.nextInt(100);
		    
		   
		    byte result = (byte)ri;
		    return result;
		  }
	   
	   static  void getCurrentHumidity(int countryCode)  {
		   
			 byte r = getRandomNumber2();  
			 
			 OpenMeteoProvider.getCurrentTemperature(countryCode);
			 

			 switch (countryCode) {
			 case (498):
			 System.out.println("Current Humidity in Moldova = " + r);	
			 break;
			 
			 case (643):
			 System.out.println("Current Humidity in Russian Federation = " + r);
			 break;
			 
			 case (792):
			 System.out.println("Current Humidity in Turkey = " + r);
			 break; 
			 
			 case (300):
			 System.out.println("Current Humidity in Greece = " + r);
			 break;
			 
			 case (380):
			 System.out.println("Current Humidity in Italy = " + r);
			 break;	
			 
			 default:
			System.out.println("Try again!");	 
			break;
			
						 
				 
			 }
		      
		   }
   }

