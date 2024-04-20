public class ElonsToyCar {
    private int distanceDriven;
    private int batteryPercentage = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
        // return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        if (this.batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%" ;
        // return String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        if(this.batteryPercentage !=0) {
            this.distanceDriven += 20;
            this.batteryPercentage -= 1;
        }
    }
}
