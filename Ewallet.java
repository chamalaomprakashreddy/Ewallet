import java.util.Scanner;
public class Ewallet
{

  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("-------------Welcome to E-Wallet---------------");
    int pwd=1234;
    boolean b=false;
    double bal=2000;
    while(!b)
    {
      System.out.println("please enter your password");
      int password=sc.nextInt();
      if(pwd==password)
      {
        System.out.println("             Login successfull             ");
		System.out.println("------------------------------------------------");
		while(!b)
		{
        System.out.println("1 to shopping");
        System.out.println("2 to Add Money");
        System.out.println("3 to Check Balance");
		System.out.println("4 to exit");
        System.out.println("Enter your option");
        int s=sc.nextInt();
		while(s > 4 || s <= 0)
		{
			System.out.println("Invalid input");
			System.out.println("1 to shopping");
       	    System.out.println("2 to Add Money");
            System.out.println("3 to Check Balance");
		    System.out.println("4 to exit");
            System.out.println("Enter your option");
			s = sc.nextInt();
		}
           switch(s)
           {
			case 1:
			while(!b)
			{
			System.out.println("-------------shopping menu-----------------");
            System.out.println("1 to Watch");
            System.out.println("2 to Shoes");
            System.out.println("3 to Hoodies");
            System.out.println("4 to Caps");
            System.out.println("5 to Bags");
            System.out.println("6 to Make-up-kit");
			System.out.println("7 to Main menu");
            int s2=sc.nextInt();
			while(s2>7||s2<1)
			{
	            System.out.println("Invalid input");
				System.out.println("-------------shopping menu-----------------");
				System.out.println("1 to Watch");
           		System.out.println("2 to Shoes");
            	System.out.println("3 to Hoodies");
            	System.out.println("4 to Caps");
            	System.out.println("5 to Bags");
           		System.out.println("6 to Make-up-kit");
				System.out.println("7 to main menu");
				s2=sc.nextInt();
			}
            switch(s2)
            {
              case 1:
			  while(!b)
			  {
			  System.out.println("watch options");
			  System.out.println("1 to ROLEX price 5000");
			  System.out.println("2 to TIMEX price 3000");
			  System.out.println("3 to FASTRACK price 2000");
			  System.out.println("4 to shopping menu");
			  int sh1=sc.nextInt();
		      while(sh1>4||sh1<=0)
		      {
			   System.out.println("Invalid input");
			   System.out.println("watch options");
			   System.out.println("1 to ROLEX price 5000");
			   System.out.println("2 to TIMEX price 3000");
			   System.out.println("3 to FASTRACK price 2000");
			   System.out.println("4 to shopping menu");
			   sh1 = sc.nextInt();
		      }
			  switch(sh1)
			  {
				  case 1:
				  int wpr1 =5000;
				  if(bal-wpr1 >= 2000)
					{
                        System.out.println("Rolex ");
						System.out.println("1 to buy the product");
                        System.out.println("2 to Watch options");
						System.out.println("3 to Shopping menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("Rolex ");
						    System.out.println("1 to buy the product");
                    	    System.out.println("2 to Watch options");
							System.out.println("3 to Shopping menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" rolex price " + wpr1);
									bal = bal - wpr1;
                                    System.out.println("current balance is " + bal);
									b=false;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
                                    System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println( "BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change the option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change the option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
				   case 2:
				   int wpr2 =3000;
				   if(bal-wpr2 >= 2000)
					{
                        System.out.println("Timex");
						System.out.println("1 to buy the product");
                        System.out.println("2 to Watch options");
						System.out.println("3 to shopping menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("Timex");
							System.out.println("1 to buy the product");
                        	System.out.println("2 to Watch options");
							System.out.println("3 to shopping menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" Timex price " + wpr2);
									bal = bal - wpr2;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to BACK");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change options");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 3:
				   int wpr3 =2000;
				   if(bal-wpr3>= 2000)
					{
                        System.out.println("Fastrack");
						System.out.println("1 to buy the product");
                        System.out.println("2 to Watch options");
						System.out.println("3 to shopping menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("Fastrack");
							System.out.println("1 to buy the product");
                        	System.out.println("2 to watch options");
							System.out.println("3 to shopping menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" Fastrack price " + wpr3);
									bal = bal - wpr3;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                   
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 4:
					b=true;
					break;
			  }
			}b=false;
			  break;
			  case 2:
			  while(!b)
			  {
			  System.out.println("shoes options");
			  System.out.println("1 to BATA price 5000");
			  System.out.println("2 to PUMA price 3000");
			  System.out.println("3 to NIKE price 2000");
			  System.out.println("4 to shopping main menu");
			  int sh2=sc.nextInt();
		      while(sh2 > 4 || sh2 <= 0)
		      {
			   System.out.println("Invalid input");
			   System.out.println("shoes options");
			   System.out.println("1 to BATA price 5000");
			   System.out.println("2 to PUMA price 3000");
			   System.out.println("3 to NIKE price 2000");
			   System.out.println("4 to shopping main menu");
			   sh2 = sc.nextInt();
		      }
			  switch(sh2)
			  {
				  case 1:
				  int spr1 =5000;
				  if(bal-spr1 >= 2000)
					{
                        System.out.println("BATA ");						
						System.out.println("1 to buy the product");
                        System.out.println("2 to shoes options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("BATA ");						
							System.out.println("1 to buy the product");
							System.out.println("2 to shoes options");
							System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" bata price " + spr1);
									bal = bal - spr1;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
				   case 2:
				   int spr2 =3000;
				   if(bal-spr2>= 2000)
					{
                        System.out.println("Puma");						
						System.out.println("1 to buy the product");
                        System.out.println("2 to shoes options");
						System.out.println("3 to main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("Puma");						
							System.out.println("1 to buy the product");
                        	System.out.println("2 to shoes options");
						    System.out.println("3 to main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" Puma price " + spr2);
									bal = bal - spr2;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 3:
				   int spr3 =2000;
				   if(bal-spr3>= 2000)
					{
                        System.out.println("Nike");					
						System.out.println("1 to buy the product");
                        System.out.println("2 to shoes options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. "); 
							System.out.println("Nike");					
							System.out.println("1 to buy the product");
							System.out.println("2 to shoes options");
							System.out.println("3 to shopping main menu");         
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" Nike price " + spr3);
									bal = bal - spr3;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 4:
					b=true;
					break;
				}
			  }b=false;
			  break;
            
			  case 3:
			  while(!b)
			  {
			  System.out.println("hoodies options");
			  System.out.println("1 to WROGH price 5000");
			  System.out.println("2 to NIKE price 3000");
			  System.out.println("3 to VEROMODU price 2000");
			  System.out.println("4 to Shopping main menu");
			  int sh3=sc.nextInt();
		      while(sh3 > 4 || sh3 <= 0)
		      {
			   System.out.println("Invalid input");
			   System.out.println("hoodies options");
			  System.out.println("1 to WROGH price 5000");
			  System.out.println("2 to NIKE price 3000");
			  System.out.println("3 to VEROMODU price 2000");
			  System.out.println("4 to shopping main menu");
			   sh3 = sc.nextInt();
		      }
			  switch(sh3)
			  {
				  case 1:
				  int hpr1 =5000;
				  if(bal-hpr1>= 2000)
					{
                        System.out.println("wrogh");
						System.out.println("1 to buy the product");
                        System.out.println("2 to hoodies options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("wrogh");
						System.out.println("1 to buy the product");
                        System.out.println("2 to hoodies options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" wrogh price " + hpr1);
									bal = bal - hpr1;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println( "BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
				   case 2:
				   int hpr2 =3000;
				   if(bal-hpr2>=2000)
					{
                        System.out.println("nike");					
						System.out.println("1 to buy the product");
                        System.out.println("2 to hoodies option");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("nike");					
						System.out.println("1 to buy the product");
                        System.out.println("2 to hoodies option");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" NIKE price " + hpr2);
									bal = bal - hpr2;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 :
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 3:
				   int hpr3 =2000;
				   if(bal-hpr3>= 2000)
					{
                        System.out.println("veromodu");
						System.out.println("1 to buy the product");
                        System.out.println("2 to hoodies options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("veromodu");
							System.out.println("1 to buy the product");
							System.out.println("2 to hoodies options");
							System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" veromodu price " + hpr3);
									bal = bal - hpr3;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
                                    System.out.println("main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 4:
					b=true;
					break;
				}
			  }b=false;
			  break;
			  case 4:
			  while(!b)
			  {
			  System.out.println("caps options");
			  System.out.println("1 to PUMA price 5000");
			  System.out.println("2 to nike price 3000");
			  System.out.println("3 to ILU price 2000");
			  System.out.println("4 to shopping main menu ");
			  int sh4=sc.nextInt();
		      while(sh4 > 4 || sh4 <= 0)
		      {
			   System.out.println("Invalid input");
			   System.out.println("caps options");
			  System.out.println("1 to PUMA price 5000");
			  System.out.println("2 to nike price 3000");
			  System.out.println("3 to ILU price 2000");
			  System.out.println("4 to shopping main menu ");
			   sh4 = sc.nextInt();
		      }
			  switch(sh4)
			  {
				  case 1:
				  int cpr1 =5000;
				  if(bal-cpr1>= 2000)
					{
                        System.out.println("puma ");						
						System.out.println("1 to buy the product");
                        System.out.println("2 to cap options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("puma ");						
						System.out.println("1 to buy the product");
                        System.out.println("2 to cap options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" puma price " + cpr1);
									bal = bal - cpr1;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println( "BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
				   case 2:
				   int cpr2 =3000;
				   if(bal-cpr2>= 2000)
					{
                        System.out.println("NIKE");						
						System.out.println("1 to buy the product");
                        System.out.println("2 to cap options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("NIKE");						
						System.out.println("1 to buy the product");
                        System.out.println("2 to cap options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" NIKE price " + cpr2);
									bal = bal - cpr2;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 3:
				   int cpr3 =2000;
				   if(bal-cpr3>= 2000)
					{
                        System.out.println("ILU");					
						System.out.println("1 to buy the product");
                        System.out.println("2 to caps options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("ILU");					
						System.out.println("1 to buy the product");
                        System.out.println("2 to caps options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" ILU price " + cpr3);
									bal = bal - cpr3;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("Add money");
                        System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
				
					break;
					case 4:
					b=true;
					break;
				}
			  }b=false;
			  break;
			  case 5:
			  while(!b)
			  {
			  System.out.println("bags options");
			  System.out.println("1 to SKY BAGS price 5000");
			  System.out.println("2 to WILD CRAFT price 3000");
			  System.out.println("3 to FASTRACK price 2000");
			  System.out.println("4 to shopping main menu");
			  int sh5=sc.nextInt();
		      while(sh5 > 4 || sh5 <= 0)
		      {
			   System.out.println("Invalid input");
			   System.out.println("bags options");
			   System.out.println("1 to SKY BAGS price 5000");
			   System.out.println("2 to WILD CRAFT price 3000");
			   System.out.println("3 to FASTRACK price 2000");
			   System.out.println("4 to shopping main menu");
			   sh5 = sc.nextInt();
		      }
			  switch(sh5)
			  {
				  case 1:
				  int bpr1 =5000;
				  if(bal-bpr1>= 2000)
					{
                        System.out.println("skybags ");
						System.out.println("1 to buy the product");
                        System.out.println("2 to bags options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("skybags ");
						System.out.println("1 to buy the product");
                        System.out.println("2 to bags options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" skybags price " + bpr1);
									bal = bal - bpr1;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+ bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change opiton");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change opiton");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
				   case 2:
				   int cpr2 =3000;
				   if(bal-cpr2 >= 2000)
					{
                        System.out.println("WILD CRAFT");
						System.out.println("1 to buy the product");
                        System.out.println("2 to bags options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("WILD CRAFT");
						System.out.println("1 to buy the product");
                        System.out.println("2 to bags options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" wild craft price " + cpr2);
									bal = bal - cpr2;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 3:
				   int bpr3 =2000;
				   if(bal-bpr3>= 2000)
					{
                        System.out.println("Fastrack");
						System.out.println("1 to buy the product");
                        System.out.println("2 to bags options");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("Fastrack");
						System.out.println("1 to buy the product");
                        System.out.println("2 to bags options");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" Fastrack price " + bpr3);
									bal = bal - bpr3;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 4:
					b=true;
					break;
				}
			  }b=false;
			  break;
			  case 6:
			  while(!b)
			  {
			  System.out.println("make-up-kit options");
			  System.out.println("1 to COLOR BAR price 5000");
			  System.out.println("2 to REVION price 3000");
			  System.out.println("3 to BOBBI BROWN price 2000");
			  System.out.println("4 to Shopping main menu");
			  int sh6=sc.nextInt();
		      while(sh6 > 4 || sh6 <= 0)
		      {
			   System.out.println("Invalid input");
			   System.out.println("make-up-kit options");
			   System.out.println("1 to COLOR BAR price 5000");
			   System.out.println("2 to REVION price 3000");
			   System.out.println("3 to BOBBI BROWN price 2000");
			   System.out.println("4 to shopping main menu");
			   sh6 = sc.nextInt();
		      }
			  switch(sh6)
			  {
				  case 1:
				  int mpr1 =5000;
				  if(bal-mpr1>= 2000)
					{
                        System.out.println("COLOR BAR");
						System.out.println("1 to buy the product");
                        System.out.println("2 to make-up-kit");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("COLOR BAR");
						System.out.println("1 to buy the product");
                        System.out.println("2 to make-up-kit");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println("color bar price " + mpr1);
									bal = bal - mpr1;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println( "BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
				   case 2:
				   int mpr2 =3000;
				   if(bal-mpr2 >= 2000)
					{
                        System.out.println("REVION");
						System.out.println("1 to buy the product");
                        System.out.println("2 to make-up-kit");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("REVION");
						System.out.println("1 to buy the product");
                        System.out.println("2 to make-up-kit");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" REVION price " + mpr2);
									bal = bal - mpr2;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to change option");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to change option");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 3:
				   int mpr3 =2000;
				   if(bal-mpr3 >= 2000)
					{
                        System.out.println("BOBBI BROWN");
						System.out.println("1 to buy the product");
                        System.out.println("2 to make-up-kit");
						System.out.println("3 to shopping main menu");
                        int bill = sc.nextInt();
                        while(bill>3|| bill<= 0)
						{
                            System.out.println("\nInvalid number selected. ");
							System.out.println("BOBBI BROWN");
						System.out.println("1 to buy the product");
                        System.out.println("2 to make-up-kit");
						System.out.println("3 to shopping main menu");          
                            bill= sc.nextInt();
						}
                        switch (bill) 
						{
                            case 1 : 
                                    System.out.println(" BOBBI BROWN price " + mpr3);
									bal = bal - mpr3;
                                    System.out.println("current balance is " + bal);
									b=true;
									break;
							case 2 :
							        System.out.println("continue");
									b =false;		
									break;
                            case 3 : 
									System.out.println("Main menu");
									b = true;
                                    break;                    
                        }
                    }
					else 
					{
                        System.out.println("BALANCE="+bal);
						System.out.println("you donot have suffient balance");
						System.out.println("1 to Add money");
						System.out.println("2 to make-up-kit");
						int p1=sc.nextInt();
						while(p1>2|| p1<=0)
						{
							System.out.println("\nInvalid number selected. ");
							System.out.println("1 to Add money");
							System.out.println("2 to make-up-kit");
							p1=sc.nextInt();
						}	
						switch(p1)
						{
							case 1:
							System.out.println("Add money");
							System.out.println("enter the amount you want add ");
            				double add=sc.nextLong();
							while(add<1000||add>1000000)
							{
								System.out.println("invaild amount added");
								add = sc.nextLong();
							}
            				if(add>=1000&&add<=1000000)
            				{
             				if(add>=1000&&add<=10000)
			 				{
				 			 	bal=bal+add-100;
				 			 	System.out.println("Balance="+bal);
							 	 b=false;
			 				}
			  				else if(add>10000&&add<=100000)
			  				{
				 				 bal=bal+add-1000;
				  				System.out.println("Balance="+bal);
				 				 b=false;
			  				}
			  				else
			 				{
				  			bal=bal+add-10000;
				  			System.out.println("Balance="+bal);
				  			b=false;
			  				}
            				}
							else
							{
								System.out.println("you cannot add less than 1000 and greater than 1000000");
							}b=false;
							break;
							case 2:
							b=false;
							break;
						}
                    }
					break;
					case 4:
					b=true;
					break;
			  }
			}b=false;
			break;
			case 7:
			System.out.println("Back");
			b=true;
            }
		}
		b=false;
        break;

            case 2:
            System.out.println("Add money");
			System.out.println("enter the amount you want add ");
            double add=sc.nextLong();
			while(add<1000||add>1000000)
			{
				System.out.println("invaild amount added you can add money greater than or equal 1000 and less than or equal to 1000000");
				add = sc.nextLong();
			}
            if(add>=1000&&add<=1000000)
            {
              if(add>=1000&&add<=10000)
			  {
				  bal=bal+add-100;
				  System.out.println("Balance="+bal);
				  b=false;
			  }
			  else if(add>10000&&add<=100000)
			  {
				  bal=bal+add-1000;
				  System.out.println("Balance="+bal);
				  b=false;
			  }
			  else
			  {
				  bal=bal+add-10000;
				  System.out.println("Balance="+bal);
				  b=false;
			  }
            }
			else
			{
			System.out.println("you cannot add less than 1000 and greater than 1000000");
			}
			b=false;
			System.out.println("main menu or Exit");
			System.out.println("1 to main menu");
			System.out.println("2 to exit");
			int s9=sc.nextInt();
			while(s9>2&&s9<1)
			{
				System.out.println("main menu or Exit");
				System.out.println("1 to main menu");
				System.out.println("2 to exit");
				s9=sc.nextInt();
			}
			switch(s9)
			{
				case 1:
					System.out.println("main menu");
					b=false;
					break;
				case 2:
					System.out.println("exit");
					b=true;
					break;
			} 
            break;
            case 3:
            System.out.println("Balance="+bal);
		    System.out.println("main menu or Exit");
			System.out.println("1 to main menu");
			System.out.println("2 to exit");
			int s3=sc.nextInt();
			switch(s3)
			{
				case 1:
					System.out.println("main menu");
					b=false;
					break;
				case 2:
					System.out.println("exit");
					b=true;
					break;
			} 
			break;
            case 4:
			System.out.println("EXIT");
            b=true;
            break;
		} 
        }		
      }
      else
      {    
        System.out.println("password incorrect");
        System.out.println("try again or exit");
		System.out.println("1 to try again");
		System.out.println("2 to exit");
        int s1=sc.nextInt();
		while(s1>2||s1<1)
		{
			System.out.println("invalid input");
			System.out.println("1 to try again");
		    System.out.println("2 to exit");
			s1 = sc.nextInt();
		}
        switch(s1)
        {
        case 1:
          break;
        case 2:
          System.out.println("exit");
          b=true;
          break;
        }
      }
    }
  }
}
