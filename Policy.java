
public class Policy {

   //setting up all private instances that do not change
   private String policyNum;
   private String providerName;
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //defult constructor that has nothing in it 
   public Policy() {
   
      this.policyNum = " ";
      this.providerName = " ";
      this.policyholderFirstName= " ";
      this.policyholderLastName= " ";
      this.policyholderAge = 0;
      this.smokingStatus= " ";
      this.height = 0.0;
      this.weight = 0.0;
   
   }
   //constructor that takes in input and sets it to the private instances/variables
   public Policy(String policyNum, String providerName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String smokingStatus, double height, double weight){
   
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
   
   }
   //getters and setters for all private instances/variables
   public void setPolicyNum(String policyNum){
      this.policyNum= policyNum;
   }
   
   public String getPolicyNum() {
      return policyNum;
   }
   //setter and getter for policynum complete
   
   public void setProviderName(String providerName){
      this.providerName = providerName;
   }
   
   public String getProviderName() {
      return providerName;
   }
   //setter and getter for providername complete
   
   public void setPolicyholderFirstName(String policyholderFirstName){
      this.policyholderFirstName = policyholderFirstName;
   }
   
   public String getPolicyholderFirstName() {
      return policyholderFirstName;
   }
   //setter and getter for policyholder first name complete
   
   public void setPolicyholderLastName(String policyholderLastName){
      this.policyholderLastName = policyholderLastName;
   }
   public String getPolicyholderLastName(){
      return policyholderLastName;
   }
   //setter and getter for policyholder last name complete
   public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }
   public int getPolicyholderAge() {
        return policyholderAge;
    }
    //setter and getter for policyholder age

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    public String getSmokingStatus() {
        return smokingStatus;
    }
    //setter and getter for smoking status
    
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    //setter and getter for height
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    //setter and getter for weight
    
    //calculateBMI and return it 
    public double calculateBMI() {
      return (weight * 703) / (height * height);
    }
    
    //calculate policy price including fees if the user is older than 50, a smoker, and if their bmi is less than 35
    public double calculatePolicyPrice(){
    
    double policyPrice = 600.0;
    
      if (policyholderAge > 50){
         policyPrice += 75.0;
      }
      if (smokingStatus.equalsIgnoreCase("smoker")){
         policyPrice += 100.0;
      }
      
      double bmi = calculateBMI();
      if (bmi > 35){
         policyPrice += (bmi - 35) * 20;
      }
         return policyPrice;
      }
    
    }

