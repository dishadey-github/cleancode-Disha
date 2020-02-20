package EpamTask4.cleanCodeTask;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class simpleInterest{
	double principle,rateOfinterest,time;
	double sI(double principle,double rateOfinterest,double time)
	{
		return (principle*rateOfinterest*time/100);
	}
}
class compoundInterest{
	double principle,rateOfinterest,time;
	double cI(double principle,double rateOfinterest,double time)
	{
		return (principle*Math.pow(1+(rateOfinterest/100),time)-principle);
	}
}
	


public class simpleInt_compoundInt {

	public static void main(String[] args) throws IOException {
		simpleInterest simpInterest=new simpleInterest();
		compoundInterest compInterest=new compoundInterest();
		OutputStreamWriter output=new OutputStreamWriter(System.out);
		Scanner sc=new Scanner(System.in);
		
		output.write("Enter the principal::::");
		output.flush();
		double principle=sc.nextDouble();
		output.write("Enter the Rate of Interest::::");
		output.flush();
		double rateOfInterest=sc.nextDouble();
		output.write("Enter the time::::");
		output.flush();
		double time=sc.nextDouble();
		output.write("The simple interest is "+simpInterest.sI(principle,rateOfInterest,time));
		output.flush();
		output.write("\nThe compound interest is "+compInterest.cI(principle,rateOfInterest,time));
		output.flush();
		
		

	}

}
