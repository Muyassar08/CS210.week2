//  import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        final double cappuccino=4.50;
//        final double muffins= 3.00;
//        final double tax_rate=0.08;
//        final double fixed_tip= 5.00;
//
//        int cappuccino_quantity= nextInt();
//        int muffins_quantity= nextInt();
//        double cappuccinoTotal= cappuccino_quantity * cappuccino;
//        double muffinsTotal= muffins_quantity * muffins;
//        double subtotal= cappuccinoTotal + muffinsTotal;
//
//        double tax= subtotal * tax_rate;
//        double grandTotal= subtotal + tax + fixed_tip;
//        System.out.printf("Grand Total: $%.2fn" + grandTotal);
//
//        close.scanner();
//    }
//}

//problem2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double way=scanner.nextDouble();
//        System.out.println("Distance: " + way);
//        double fuelPrice=scanner.nextDouble();
//        double fuelConsumption= scanner.nextDouble();
//
//        double totalLiters = (way/100) * fuelConsumption;
//        double totalCost = fuelPrice * totalLiters;
//        System.out.println("Fuel Needed" + totalLiters );
//        System.out.println("Total cost " + totalCost);
//
//    }
//}

//problem3
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int numberOfSeconds= scanner.nextInt();
//        int hours= numberOfSeconds / 3600;
//        int remaining= numberOfSeconds % 3600;
//        int minutes= remaining / 60;
//        int seconds= remaining % 60;
//        System.out.print( hours + "hours," + minutes + "minutes, " + seconds + "seconds");
//
//    }
//}

//problem4
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int age = scanner.nextInt();
//        int price;
//
//        if (age <= 12) {
//            price=7;
//        } else if ( age <= 17) {
//            price = 10;
//        }else if ( age <= 64) {
//            price = 15;
//        } else {
//            price = 10;
//        }
//        System.out.print("Ticket price: $" + price);
//    }
//}

//problem5
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int year = scanner.nextInt();
//
//        boolean leapYear= (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
//        if (leapYear) {
//            System.out.println(year + " Leap Year");
//        } else {
//            System.out.println(year + " Not a Leap Year");
//        }
//    }
//}

//problem6
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double weight = scanner.nextDouble();
//        double shippingCost;
//
//        if (weight <= 2.0) {
//            shippingCost= 5.00;
//        } else if (weight <= 10.0) {
//            shippingCost= 10.0;
//        } else {
//            double extraWeight = weight -10.0;
//            shippingCost= 10.00 + (extraWeight * 2.00);
//        }
//        System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
//    }
//}

//problem7
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        final int correctPin= 1234;
//        final int maxAttempts= 3;
//
//        boolean accessGranted= false;
//
//        for (int attempt =1; attempt <= maxAttempts; attempt++) {
//            int enteredPin= scanner.nextInt();
//
//            if (enteredPin == correctPin) {
//                System.out.println("Access Granted");
//                accessGranted = true;
//                break;
//            } else if (attempt < maxAttempts) {
//                System.out.println("Try again");
//            }
//        }
//        if (!accessGranted) {
//            System.out.println("Account Locked");
//        }
//    }
//}

//problem8
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int population = 100000;
//        double growthRate = 0.05;
//        int targetPopulation = 200000;
//        int year = 0;
//
//        System.out.println("Year 0: " + population);
//
//        for (year =1; population < targetPopulation; year++) {
//        population += (int)(population * growthRate);
//        System.out.println("Year " + year + ": " + population);
//        }
//        System.out.println("It will take " + (year -1) + " years to double.");
//    }
//}
