package typecasting;

import java.util.Scanner;

public class TypeCastingMain {

	public static void main(String[] args) {
byte byteVariable;
short  shortVariable;
int intVariable;
long longVariable;
float floatVariable;
double doublevariable;
		

Scanner input = new Scanner(System.in);
System.out.println("Please enter the value of byte variable : ");
byteVariable=input.nextByte();
System.out.println("Please enter the value of short variable : " );
shortVariable=input.nextShort();
 
intVariable= byteVariable + shortVariable;
System.out.println("storing sum of byte and short in int variable : " + intVariable);


longVariable = intVariable + shortVariable;
System.out.println("storing sum of int and short in long variable : " + longVariable);

floatVariable = intVariable + longVariable;
System.out.println("storing sum of int  and long in float variable : " + floatVariable);

doublevariable = floatVariable + intVariable;
System.out.println("storing sum of float and int in double variable : " + shortVariable);

//Typecasting needed
shortVariable = (short) (byteVariable + intVariable) ;
System.out.println("storing sum of byte and int in short variable : " + shortVariable);

floatVariable = (float)(doublevariable +  longVariable);
System.out.println("storing sum of double  and long in float variable : " + floatVariable);

byteVariable =(byte)( floatVariable +  doublevariable);
System.out.println("storing sum of float and double in byte variable : " + shortVariable);






	}

}
