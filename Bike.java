//Bike.java
import java.util.Scanner;
public class Bike{
    private static String brand;
    private static int count;

private String engNum;
private String bikeNumber;
private String ownerName;
private String color;
static{
        Scanner scn  =  new Scanner(System.in);
        System.out.print("Enter brand:");
        brand = scn.nextLine();

    }
    {
        count++;
    }

   public Bike(String engNum, String color){
    this.engNum =engNum;
   }

   public void  setOwnerName(String ownerName){
    this.ownerName = ownerName;

   }
   public String getOwnerName(){
        return ownerName;
   }

   public void setBikeNumber(String bikeNumber){
    this.bikeNumber = bikeNumber;

   }

   public String getBikeNumber(){
      return bikeNumber;
   }

   public static String getBrand(){
    return brand;

   }

     public static int grtCount(){
        return count;
     }

     public String getEngNum(){
        return engNum;
     }

     public String getColor(){
        return color;
     }

     //bike logic operation
       
     public void start (){
        System.out.println(ownerName+ "started" + brand + "Bike");
     }

     public void move(){
        System.out.println(ownerName +"is moving on" + brand +"Bike");
     }
    
     public void stop(){
        System.out.println(ownerName +"stop" + brand +"Bike");
     }

     //display Method
     @Override
        public String toString(){
            return "Brand\t:"+ brand +"\n"+
                  "EngNum\t:"+ engNum +"\n"+
                   "color\t:"+ color +"\n"+
                   "ownerName\t:"+ ownerName +"\n"+
                    "bikeNumber\t:"+ bikeNumber ;
        }

}