import java.util.Scanner;

public class Ketabkhaneh {
	public static void main(String[]args) {
		Scanner Scanner = new Scanner(System.in);
		
		long[] identity ;
		String[] name  ;
		String namesearch;
		short[] age ;
		short agesearch;
		char[] gender;
		char gensearch;
		boolean[] empty;
		int number;
		long idsearch;
		int WhatToDo = 0;
		int n = 0;
		

		System.out.println("Please Enter number of library members: ");
		number = Scanner.nextInt();
		identity = new long[number];
		name = new String[number];
		gender = new char[number];
		age = new short[number];
		empty = new boolean[number];
		for (int i = 0; i < number; i++)
			empty[i] = false;
		while(WhatToDo != 5) {
							
			System.out.println("Please Enter a number:\n"
					+ "\n"				
					+ "1) Add a new member\n"
					+ "2) View a member info\n"
					+ "3) Edit a member\n"
					+ "4) Delete a member\n"
					+ "5) Exit");
			
			WhatToDo = Scanner.nextInt();
			if((n == number) && (WhatToDo == 1)) {
				System.out.println("Member Limitation!!! ");
				System.out.println("Do another thing! ");
				//WhatToDo = Scanner.nextInt();
				
			}
			switch(WhatToDo) {
			case 1:
				
				
				System.out.println("Please Enter the gender(M/F): ");
				gender[n] = Scanner.next().charAt(0);
				int c = gender[n];
				empty[n] = true;
				
					switch(c) {
					case 'M': 
						System.out.println("Please Enter his name: ");
						for (int i = 0; i < n; i++) {
							if(empty[i] == false)
								n = i;
								break;
						}		
						name[n] = Scanner.next();
						identity[n]=n+1;
						System.out.println("Please Enter his age: ");
						age[n] = Scanner.nextShort();
						n = n + 1;
					
						break;
					case 'F':
						System.out.println("Please Enter her name: ");
						for (int i = 0; i < n; i++) {
							if(empty[i] == false)
								n = i;
								break;
						}
						name[n] = Scanner.next();
						identity[n]=n+1;
						System.out.println("Please Enter her age: ");
						age[n] = Scanner.nextShort();
						n = n + 1;
						break;
					default:	
					}
			
		
					break;
			case 2:
				System.out.println("Please Enter his/her identity number: ");
				idsearch = Scanner.nextLong();
				for(int i=0; i < number;i++) {
					if(identity[i] == idsearch) {
						idsearch = i;
						namesearch = name[i];
						agesearch = age[i];
						gensearch = gender[i];
						System.out.printf("Name: %s \n",namesearch);
						System.out.printf("Age: %d \n",agesearch);
						System.out.printf("Gender: %c \n",gensearch);
						System.out.println(i);
						break;
					}
				}
				break;
			case 3:
				System.out.println("Please Enter his/her identity number: ");
				idsearch = Scanner.nextLong();
				for(int i=0; i < number;i++) {
					if(identity[i] == idsearch) {
						idsearch = i;
						System.out.println("Please Enter new number's name: ");
						namesearch = Scanner.next();
						name[i] = namesearch;
						System.out.println("Please Enter new number's age: ");
						agesearch = Scanner.nextShort();
						age[i] = agesearch;
						System.out.println("Please Enter new number's gender: ");
						gensearch = Scanner.next().charAt(0);
						gender[i] = gensearch;
						break;
						}					
				}
				break;
			case 4:
				System.out.println("Please Enter his/her identity number: ");
				idsearch = Scanner.nextLong();
				for(int i=0; i < number;i++) {
					if(identity[i] == idsearch) {
						idsearch = i;
						name[i] = null;
						age[i] = 0;
						gender[i] = 0;
						empty[i] = false;
						System.out.println(i);
						break;
						}
				}
				break;
			default:	
			}	
		
			}
		
		
		
		}
	}
