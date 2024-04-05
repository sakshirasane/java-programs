package java8features;

interface Sayable{
	   String say(String str);
	   
 }
	
public class LambdaExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sayable s1=(name) -> "Hello "+name;
      System.out.println(s1.say("Priyanka! "));
      
      Sayable s2 =(msg) ->{
    	 return "Message: "+msg; 
      };
      System.out.println(s2.say("Learning java 8 features"));
	}

}
