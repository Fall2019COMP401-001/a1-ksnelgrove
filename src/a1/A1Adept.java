package a1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class A1Adept {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
process(scan);

}



public static void process(Scanner scan) {

int countOfItems = scan.nextInt();
String[] itemName = new String[countOfItems];
double[] itemPrice = new double[countOfItems];
int biggestIndex = 0;
int smallestIndex = 0;
double total = 0.0;

for (int x = 0; x < countOfItems; x++) {
String itemN = scan.next();
itemName[x] = itemN;
double itemP = scan.nextDouble();
itemPrice[x] = itemP;




}

int countOfCustomers = scan.nextInt();
double amount = 0.0;
double average = 0.0;
double biggest = 0.0;
double smallest = 0.0;

String[] customerFirstName = new String[countOfCustomers];
String[] customerLastName = new String[countOfCustomers];
double[] customerAmount = new double[countOfCustomers];

for (int i = 0; i < countOfCustomers; i++) {
String firstName = scan.next();
customerFirstName[i] = firstName;
String lastName;
lastName = scan.next();
customerLastName[i] = lastName;
int countOfTotalItems;
countOfTotalItems = scan.nextInt();
int index = 0;


for (int j = 0; j < countOfTotalItems; j++) {
int quantityOfItem;
quantityOfItem = scan.nextInt();
String nameOfItem;
nameOfItem = scan.next();

for (int k = 0; k < itemName.length; k++) {
if(itemName[k].equals(nameOfItem)) {
index = k;
double cost = itemPrice[index];

customerAmount[i] += (cost * quantityOfItem);
total += (cost * quantityOfItem);
}


}

}


average = (total / countOfCustomers);
}


double biggestSoFar = 0.0;
for (int l = 0; l < countOfCustomers; l++) {
if (customerAmount[l] > biggestSoFar) {
biggestSoFar = customerAmount[l];
biggestIndex = l;
}
}
double smallestSoFar = 198765.0;
for (int m = 0; m < countOfCustomers; m++) {
if (customerAmount[m] < smallestSoFar) {
smallestSoFar = customerAmount[m];
smallestIndex = m ;
}
}



System.out.println("Biggest: " + customerFirstName[biggestIndex] + " " + customerLastName[biggestIndex] + " (" + customerAmount[biggestIndex] + ")");
System.out.println("Smallest: " + customerFirstName[smallestIndex] + " "+ customerLastName[smallestIndex] + " (" + customerAmount[smallestIndex] + ")");
System.out.println ("Average: " + String.format("%.2f", average));
}
}





