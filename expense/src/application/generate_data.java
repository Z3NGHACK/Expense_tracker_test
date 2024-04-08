package application;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class generate_data {
    private static final Random rand = new Random();
    private static Scanner scanner = new Scanner(System.in);
    
    private static String name = "as";
    private static int age = 5;
    private static String phoneNum = "616161";
    private static String email = "sdvkss";
    private static String password = "kvndfn";
    private static int amount;
    private static int sport;
    private static int entertainment;
    private static int shopping;
    private static int housing;
    private static int study;
    private static int food;
    private static int clothing;
    private static int transportation;
    private static boolean check = true;
    private final static String filename = "expense.csv";
    
    public static void main(String[] args) {
    	while(check) {
        	
        	do {
	        	sport = rand.nextInt(900) + 10;
	        	entertainment = rand.nextInt(900) + 10;
	        	shopping = rand.nextInt(900) + 10;
	        	housing = rand.nextInt(900) + 10;
	        	study = rand.nextInt(900) + 10;
	        	food = rand.nextInt(900) + 10;
	        	clothing = rand.nextInt(900) + 10;
	        	transportation = rand.nextInt(900) + 10;
	        	
	        	amount = sport + entertainment + shopping + housing + study + food + clothing + transportation;
        	}while(sport <= 0 && entertainment <= 0 
        			&& shopping <= 0 && housing <= 0 
        			&& study <= 0 && food <= 0 
        			&& clothing <= 0 && transportation <= 0);
        	
        	// System.out.println(name);
        	// System.out.println(age);
        	// System.out.println(phoneNum);
        	// System.out.println(email);
        	// System.out.println(password);
        	// System.out.println(sport);
        	// System.out.println(entertainment);
        	// System.out.println(shopping); 
        	// System.out.println(housing);
        	// System.out.println(study);
        	// System.out.println(food);
        	// System.out.println(clothing);
        	// System.out.println(transportation);
        	// System.out.println(amount);
        	// check = false;
        	
        	setData(name, age, phoneNum, email,
            		password, amount, sport, 
            		entertainment, shopping, housing,
            		study, food, clothing, transportation
            		);
        	saveToFile(name, age, phoneNum, email,
            		password, amount, sport, 
            		entertainment, shopping, housing,
            		study, food, clothing, transportation
            		);
        	readFromFile(filename);
    	}
    }
    
    private static void setData(
    		String name, int age,
    		String phoneNum, String email,
    		String password, int amount,
    		int sport, int entertainment,
    		int shopping, int housing,
    		int study, int food,
    		int clothing, int transportation
    		){
    	generate_data.name = name;
    	generate_data.age = age;
    	generate_data.phoneNum = phoneNum;
    	generate_data.email = email;
    	generate_data.password = password;
    	generate_data.amount = amount;
    	generate_data.sport = sport;
    	generate_data.entertainment = entertainment;
    	generate_data.shopping = shopping;
    	generate_data.housing = housing;
    	generate_data.study = study;
    	generate_data.food = food;
    	generate_data.clothing = clothing;
        generate_data.transportation = transportation;
    }
    
    private static void saveToFile(
    		String name, int age,
    		String phoneNum, String email,
    		String password, int amount,
    		int sport, int entertainment,
    		int shopping, int housing,
    		int study, int food,
    		int clothing, int transportation
    		) {
    	try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
    		writer.write(name + "," + age + "," +
    				phoneNum + "," + email + "," +
    				password + "," + amount + "," +
    				sport + "," + entertainment + "," +
    				shopping + "," + housing + "," +
    				study + "," + food + "," +
    				clothing + "," + transportation + "\n");
    	}catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    private static void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (lineCount < 5) { // Display user details
                    System.out.println("User Details:");
                    System.out.println("Name: " + parts[0]);
                    System.out.println("Age: " + parts[1]);
                    System.out.println("Phone Number: " + parts[2]);
                    System.out.println("Email: " + parts[3]);
                    System.out.println("Password: " + parts[4]);
                    System.out.println();
                } else { // Display expense details
                    System.out.println("Expense Details:");
                    System.out.println("Sport: " + parts[6]);
                    System.out.println("Entertainment: " + parts[7]);
                    System.out.println("Shopping: " + parts[8]);
                    System.out.println("Housing: " + parts[9]);
                    System.out.println("Study: " + parts[10]);
                    System.out.println("Food: " + parts[11]);
                    System.out.println("Clothing: " + parts[12]);
                    System.out.println("Transportation: " + parts[13]);
                    System.out.println();
                }
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
