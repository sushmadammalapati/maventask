package com.epamwork.hometask12;
import java.util.*;
public class Newyeargiftbox {
	public static void main(String[] args) {
		int choice,total_weight=0,dairymilk_weight=180,darkchocolate_weight=90,kitkat_weight=60,snickers_weight=100,laddu_weight=40,gulabjamun_weight=20,rasgulla_weight=25,quantity;
		char addmore; 
		boolean flag=true;
		Giftbox object;
		HashMap<String, Integer> mygiftbox = new HashMap<>();
		Scanner scanner_object = new Scanner(System.in);
		System.out.println("Select items in your giftbox : ");
		while(flag) {
			System.out.println("1.Dairymilk\n 2.Darkchocolate\n 3.Kitkat\n 4.Snickers\n 5.Rasgulla\n 6.Laddu\n 7.Gulabjamun\n Enter your choice");
			choice=scanner_object.nextInt();
			System.out.println(choice);
			switch(choice) {
				case 1: 
						System.out.println("Enter Dairymilk units : ");
						quantity=scanner_object.nextInt();
						object=new Dairymilk();
						total_weight += object.calculate_weight(dairymilk_weight,quantity);
						mygiftbox.put("dairymilk", quantity);
						System.out.println("Do you want to add more items to the giftbox?(y/n)");
						addmore=scanner_object.next().charAt(0);
						if(addmore =='y' || addmore == 'Y') {
							flag=true;
							break;
						}else {
							flag=false;
							System.out.println("Gift box consist of ");
							object.print(mygiftbox);
							System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
							break;
						}
				case 2: 
					System.out.println("Enter Darkchocolate units : ");
					quantity=scanner_object.nextInt();
					object=new Darkchocolate();
					total_weight += object.calculate_weight(darkchocolate_weight,quantity);
					mygiftbox.put("Darkchocolate", quantity);
					System.out.println("Do you want to add more items to the giftbox?(y/n)");
					addmore=scanner_object.next().charAt(0);
					if(addmore =='y' || addmore == 'Y') {
						flag=true;
						break;
					}else {
						flag=false;
						System.out.println("Gift box consist of ");
						object.print(mygiftbox);
						System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
						break;
					}
				case 3: 
					System.out.println("Enter Kitkat units : ");
					quantity=scanner_object.nextInt();
					object=new Kitkat();
					total_weight += object.calculate_weight(kitkat_weight,quantity);
					mygiftbox.put("kitkat", quantity);
					System.out.println("Do you want to add more items to the giftbox?(y/n)");
					addmore=scanner_object.next().charAt(0);
					if(addmore =='y' || addmore == 'Y') {
						flag=true;
						break;
					}else {
						flag=false;
						System.out.println("Gift box consist of ");
						object.print(mygiftbox);
						System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
						break;
					}
				case 4: 
					System.out.println("Enter Snickers units : ");
					quantity=scanner_object.nextInt();
					object=new Snickers();
					total_weight += object.calculate_weight(snickers_weight,quantity);
					mygiftbox.put("snickers", quantity);
					System.out.println("Do you want to add more items to the giftbox?(y/n)");
					addmore=scanner_object.next().charAt(0);
					if(addmore =='y' || addmore == 'Y') {
						flag=true;
						break;
					}else {
						flag=false;
						System.out.println("Gift box consist of ");
						object.print(mygiftbox);
						System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
						break;
					}
				case 5: 
					System.out.println("Enter Rasgulla units : ");
					quantity=scanner_object.nextInt();
					object=new Rasgulla();
					total_weight += object.calculate_weight(rasgulla_weight,quantity);
					mygiftbox.put("Rasgulla", quantity);
					System.out.println("Do you want to add more items to the giftbox?(y/n)");
					addmore=scanner_object.next().charAt(0);
					if(addmore =='y' || addmore == 'Y') {
						flag=true;
						break;
					}else {
						flag=false;
						System.out.println("Gift box consist of ");
						object.print(mygiftbox);
						System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
						break;
					}
				case 6: 
					System.out.println("Enter Laddu units : ");
					quantity=scanner_object.nextInt();
					object=new Laddu();
			    	total_weight += object.calculate_weight(laddu_weight,quantity);
				    mygiftbox.put("laddu", quantity);
					System.out.println("Do you want to add more items to the giftbox?(y/n)");
					addmore=scanner_object.next().charAt(0);
					if(addmore =='y' || addmore == 'Y') {
						flag=true;
						break;
					}else {
						flag=false;
						System.out.println("Gift box consist of ");
						object.print(mygiftbox);
						System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
						break;
					}
				case 7: 
					System.out.println("Enter Gulabjamun units : ");
					quantity=scanner_object.nextInt();
					object=new Gulabjamun();
					total_weight += object.calculate_weight(gulabjamun_weight,quantity);
					mygiftbox.put("Gulabjamun", quantity);
					System.out.println("Do you want to add more items to the giftbox?(y/n)");
					addmore=scanner_object.next().charAt(0);
					if(addmore =='y' || addmore == 'Y') {
						flag=true;
						break;
					}else {
						flag=false;
						System.out.println("Gift box consist of ");
						object.print(mygiftbox);
						System.out.println("Yout sweet box is "+total_weight+" grams.\nHAPPY NEW YEAR");
					}
				default : System.out.println("Enter correct choice ");
			}
		}
	}

}