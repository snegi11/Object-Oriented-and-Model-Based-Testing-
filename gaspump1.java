import java.io.*;
import java.util.Scanner;

public class gaspump1 extends GasPump{
	
	public static void main(String args[])throws IOException{
		GasPump gp= new GasPump();
		int i=0;
		int y;
		float a, b ,d , cash;
		System.out.println("Driver for the GasPump Class");
		    
	    System.out.println("\n"+"PRESS ANY KEY TO CONTINUE..");
		System.in.read();
		
		 //System.out.println(k);	
	while(i==0){
    
	System.out.println();
	System.out.println("1.Activate");
	System.out.println("2.PayCredit");
	System.out.println("3.Reject");
	System.out.println("4.Approved");
	System.out.println("5.PayCash");
	System.out.println("6.Cancel");
	System.out.println("7.Regular");
	System.out.println("8.Super");
	System.out.println("9.Diesel");
	System.out.println("10.StartPump");
	System.out.println("11.PumpLiter");
	System.out.println("12.StopPump");
	System.out.println("13.NoReceipt");
	System.out.println("14.Receipt");
	System.out.println("15.TurnOff\n");
	
	System.out.println("Testing-related methods");
	System.out.println("16.Show_price");
	System.out.println("17.Show state");
	System.out.println("18.Show Number of Gallons");
	System.out.println("19.Display all the variables");
	System.out.println("20.Quit Gas Pump Driver\n");
	
	System.out.println("Enter Selection:");
	
	
	y=new Scanner(System.in).nextInt();

	 switch(y){
	 
     case 1 :  System.out.println("Activate() method\n");
	 System.out.println("enter Regular");
	 a=new Scanner(System.in).nextFloat();
	 System.out.println("enter Super");
	 b=new Scanner(System.in).nextFloat();
	 System.out.println("enter Diesel");
	 d=new Scanner(System.in).nextFloat();
	 
	 System.out.println("Return Value is"+" "+gp.Activate(a,b,d));
	 
     System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case 2 : System.out.println("Pay Credit() method\n");
	 System.out.println("Return Value is"+" "+gp.PayCredit());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  3: System.out.println("Reject() method\n");
	 System.out.println("Return Value is"+" "+gp.Reject());
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  4: System.out.println("Approved() method\n");
	 System.out.println("Return Value is"+" "+gp.Approved());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  5: System.out.println("Pay Cash() method\n");
	 System.out.println("enter cash");
	 cash=new Scanner(System.in).nextFloat();
	 System.out.println("Return Value is"+" "+gp.PayCash(cash));
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  6: System.out.println("Cancel() method\n");
	 System.out.println("Return Value is"+" "+gp.Cancel());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
     
	 case  7: System.out.println("Regular() method\n");
	 System.out.println("Return Value is"+" "+gp.Regular());
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  8: System.out.println("Super() method\n");
	 System.out.println("Return Value is"+" "+gp.Super());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  9: System.out.println("Diesel() method\n");
	 System.out.println("Return Value is"+" "+gp.Diesel());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  10: System.out.println("StartPump() method\n");
	 System.out.println("Return Value is"+" "+gp.StartPump());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  11: System.out.println("PumpLiter() method\n");
	 System.out.println("Return Value is"+" "+gp.PumpLiter());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  12: System.out.println("StopPump() method\n");
	 System.out.println("Return Value is"+" "+gp.StopPump());
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 
	 case  13: System.out.println("NoReceipt() method\n");
	 System.out.println("Return Value is"+" "+gp.NoReceipt());
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  14: System.out.println("Receipt() method\n");
	 System.out.println("Return Value is"+" "+gp.Receipt());
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case  15: System.out.println("TurnOff() method\n");
	 System.out.println("Return Value is"+" "+gp.TurnOff());
	
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case 16: 
	 System.out.println("Rprice: "+gp.getRegularPrice()+
			 "\n"+ "Sprice: "+gp.getSuperPrice()
			 +"\n"+"Dprice: "+gp.getDieselPrice());
	 System.out.println( " \nPrice : "+gp.getPrice());
	 
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case 17: 
	
	 if(gp.getState()==-2){
		 System.out.println("State: Exit");
	 }
	 
	 if(gp.getState()==-1){
		 System.out.println("State: Start");
	 }
	 else{
	 System.out.println("The State is: " +"S"+gp.getState());
	 }
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case 18: System.out.println("Number of Gallons pumped:"+gp.getNumberOfGallons() );
	 
	 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
     System.in.read();
	 break;
	 
	 case 19: 
		 if(gp.getState()==-2){
			 System.out.println("State: Exit");
		 }
		 
		 if(gp.getState()==-1){
			 System.out.println("State: Start");
		 }
		 else{
		 System.out.println("State is: " +"S"+gp.getState());
		 }
		 
		 System.out.println("Values:- ");
		 System.out.println("Rprice: "+gp.getRegularPrice()+"\n"+ "Sprice: "+gp.getSuperPrice()
				 +"\n"+"Dprice: "+gp.getDieselPrice());
		 System.out.println("w: "+gp.getW()+ " \nPrice : "+gp.getPrice()+
				 "\nCash: "+gp.getCash()+"\nTotal Cost: "+gp.getTotal()+ 
				 "\nTotal Gasoline pumped: "+gp.getNumberOfGallons());
		 
		 System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	     System.in.read();
		 break;
	 
	 
	 case  20: System.out.println("Quit Gas Pump driver");
	 i = 1;
	 break;
		
	 default:
		 System.out.println("Please enter valid input");
			// This breaks the switch, not the loop.
			break;
	 
	 }	
	 System.out.println("-------------------------------------------------");
	 	 
	} 	 
   }
  }


  
   
   
	

