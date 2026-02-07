
class Fan {
    public final int SLOW = 3;
    public final int MEDIUM = 2;
    public final int FAST = 1;

    private int fanSpeed;
    private boolean isOn; 
    private double radius;
    private String color;


    // constructor

    Fan() {
        fanSpeed = 1;
        isOn = false;
        radius = 5;
        color = "Blue";
    }


    // getter

    public int getFanspeed() {
        return fanSpeed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // setter

    public void setFanspeed(int newSpeed) {
        fanSpeed = newSpeed;
    }

    public void setStatus(boolean status) {
        isOn = status;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    // method

    public String toString() {
        String description = "";

        if(isOn) {
            description += "Fan color: " + color + "\nFan radius: " + radius + "\nFan speed: " + fanSpeed + "\n Fan status: Fan is On";
        }

        else {
            description += "Fan color: " + color + "\nFan radius: " + radius + "\n Fan status: Fan is Off";
        }

        return description;
        
    }


}

public class Task4 {
    public static void main(String[] a ) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setColor("Yellow");
        f1.setFanspeed(1);
        f1.setRadius(10);
        f1.setStatus(true);

        f2.setFanspeed(2);
        
        System.out.println("-------------------- FAN 1 DESCRIPTION --------------------");
        System.out.println(f1.toString());

        System.out.println("-------------------- FAN 2 DESCRIPTION --------------------");
        System.out.println(f2.toString());

    }
}
