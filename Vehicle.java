class Vehicle {
    private boolean engineStarted;
    private double fuel;
    private int distanceTraveled;

    public Vehicle(){
        this.engineStarted = false;
        this.fuel = 0;
        this.distanceTraveled = 0;
    }

    public boolean toggleEngineStatus(){
        this.engineStarted = !this.engineStarted;
        return this.engineStarted;
    }

    public void refuel(double fuel){
        if(fuel > 1){
            this.fuel += fuel;
        }else{
            System.out.println("ERROR: Engine not started, no fuel, or insufficient fuel to travel.");
        }
    }

    public boolean drive(int distance){
        if(!this.engineStarted){
            System.out.println("ERROR: engine is not yet started");
            return false;
        }

        if (distance < 0){
            System.out.println("ERROR: engine is not yet started");
            return false;
        }
        
        double fuelConsumed = distance * 0.5;
        if(fuelConsumed > this.fuel){
            System.out.println("ERROR: Engine not started, no fuel, or insufficient fuel to travel.");
            return false;
        }
        this.fuel -= fuelConsumed;
        this.distanceTraveled += distance;
        System.out.println("");
        System.out.println("New fuel: " + this.fuel) ;
        System.out.println("Distance traveled: " +  this.distanceTraveled);
        return true;
    }

    
    public boolean getEngineStatus(){
        return this.engineStarted;
    }

    public double getFuel(){
        return this.fuel;
    }

    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }
}


