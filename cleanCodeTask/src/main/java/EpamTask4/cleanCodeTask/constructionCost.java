package EpamTask4.cleanCodeTask;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class standardHome{
	double price(double area)
	{
		return 1200*area;
	}
	
}
class aboveStandard{
	double price(double area)
	{
		return 1500*area;
	}
	
}
class highStandard{
	
	double price(double area)
	{
		return 1800*area;
	}
	
}
class auto_highStandard{
	double price(double area)
	{
		return 2500*area;
	}
	
}

public class constructionCost {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter output=new OutputStreamWriter(System.out);
		Scanner sc=new Scanner(System.in);
		standardHome sdHome=new standardHome();
		aboveStandard asdHome=new aboveStandard();
		highStandard hsdHome=new highStandard();
		auto_highStandard atsdHome=new auto_highStandard();
		output.write("Enter the area of Your house :::::");
		output.flush();
		double area=sc.nextDouble();
		output.write("------------------------------------------------------");
		output.flush();
		output.write("\n1.standardHome");
		output.flush();
		output.write("\n2.aboveStandard");
		output.flush();
		output.write("\n3.highStandard");
		output.flush();
		output.write("\n4.Automatic HighStandard");
		output.flush();
		output.write("\nEnter your Choice Between 1-4::::");
		output.flush();
		double choice=sc.nextDouble();
		if(choice==1)
		{
			output.write("The cost of your House Will be"+sdHome.price(area));
			output.flush();
		}
		if(choice==2)
		{
			output.write("The cost of your House Will be"+asdHome.price(area));
			output.flush();
		}
		if(choice==3)
		{
			output.write("The cost of your House Will be"+hsdHome.price(area));
			output.flush();
		}
		if(choice==4)
		{
			output.write("The cost of your House Will be"+atsdHome.price(area));
			output.flush();
		}
	
			
		
		
		// TODO Auto-generated method stub

	}

}
