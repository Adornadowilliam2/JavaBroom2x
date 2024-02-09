import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Driver {
    public static void main(String[] args)throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int option;
        Vehicle vehicle = new Vehicle();
        double fuelAmout;
        
        do{
            System.err.println();
            System.out.println("=========================");
            System.out.println("[1] Engine start/stop");
            System.out.println("[2] Refuel");
            System.out.println("[3] Drive");
            System.out.println("[4] Exit");
            System.out.print("Select an option: ");
            option = Integer.parseInt(br.readLine());
            System.out.println("=========================");
            switch (option) {
                case 1:
                    boolean getEngineStatus = vehicle.toggleEngineStatus();
                    System.out.println("Engine: " + (getEngineStatus ? "Started" : "Stopped"));
                    break;
                case 2:
              
                        System.out.println();
                        System.out.println("Current fuel: " + vehicle.getFuel());
                        System.out.print("Refuel amount: " );
                        fuelAmout = scanner.nextDouble();
                        vehicle.refuel(fuelAmout);
                        System.out.println("New fuel amount: " + vehicle.getFuel());
               
                break;
                case 3:
                    if(vehicle.getEngineStatus()){
                      
                        System.out.println();
                        System.out.println("Current fuel:" + vehicle.getFuel());
                        System.out.println("Distance traveled: " + vehicle.getDistanceTraveled());
                        System.out.print("Enter distance: ");
                        int distance = scanner.nextInt();
                        vehicle.drive(distance);
                        
                       }else{
                        System.out.println("ERROR: engine is not yet started");
                    }
                break;
                case 4:
                    System.out.println("Exiting...");
                    System.out.println("=========================");
                    break;
                default:
                System.out.println("Error, please try again!");
                    break;
            }
        }while(option !=4);
        scanner.close(); 
    }
}
