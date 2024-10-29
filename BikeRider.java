//BikeRider.java
import java.util.Scanner;

class BikeRider{
    public static void main(String[] agrs){
        Scanner scn = new Scanner(System.in);
        Bike bike = new Bike("xyz123Abc456","red Wine");

       bike.setOwnerName("Satyam Kumar");
       bike.setBikeNumber("TS 09 BJ 1234");

       System.out.println("The Customer" + bike.getOwnerName()+"has bought "+ bike.getBrand()+"Bike");

       loop:while(true){
        System.out.println("\n Choose one Option");
        System.out.println("\n 1. display bike detail ");
        System.out.println("\n 2. start bike");
        System.out.println("\n 3. move bike");
        System.out.println("\n 4. stop bike");
        System.out.println("\n 5. Exit");

        System.out.print("Enter option:");

        int option = scn.nextInt(); scn.nextLine();

        switch (option) {
            case 1: {
                System.out.println("Bike detail");
                System.out.println(bike);
                break;
            }
            case 2:{
                bike.start();
                break;
            }
            case 3:{
                bike.move();
                break;
            }
            case 4:{
                bike.stop();
                break;
            }
            case 5:{
                System.out.println("Engine Stopped ");
                break loop; //loop is lable (name )
            }
                

        
            default:{
                System.out.println("invalid Option");
            }
               
        

       
       }//swtch close
       System.out.println("After switch");

    }//while close
       System.out.println("After loop , program terminated");



    }


}
