import java.util.Scanner;
public class HelloWord{
   public static void main(String[] args){

	msg("Ola, poderia informar seu nome?");
	String name = new Scanner(System.in).nextLine();
	msg("Então esse e o seu nome "+name);


 }

 private static void msg(String msg){
	 System.out.println(msg);
   }
}

