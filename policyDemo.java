import java.util.*;

public class policyDemo {


   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("Please enter the Policy Number: ");
      String policyNum = scanner.nextLine();
   
      System.out.print("Please enter the Provider Name: ");
      String providerName = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's First Name: ");
      String policyholderFirstName = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Last Name: ");
      String policyholderLastName = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Age: ");
      int policyholderAge = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = scanner.nextLine();
   
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = scanner.nextDouble();
   
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight = scanner.nextDouble();
      
      Policy policy = new Policy(policyNum, providerName, policyholderFirstName, policyholderLastName, policyholderAge, smokingStatus, height, weight);
         System.out.println("\nPolicy Information:");
         System.out.println("Policy Number: " + policy.getPolicyNum());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder First Name: " + policy.getPolicyholderFirstName());
         System.out.println("Policyholder Last Name: " + policy.getPolicyholderLastName());
         System.out.println("Policyholder Age: " + policy.getPolicyholderAge());
         System.out.println("Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Height: " + policy.getHeight());
         System.out.println("Weight: " + policy.getWeight());
         System.out.printf("Policy Price: $%.2f\n" , policy.calculatePolicyPrice());
         
       }
   }
