public class sayHello{
	
	public static void main(String[] args){
		try{
				System.out.println("Hola " + args[0]);		

		}catch(Exception e){
			System.out.println("La ejecucion correcta es: ");
			System.out.println("java sayHello [Tu nommbre]");
		}
	}
		
}