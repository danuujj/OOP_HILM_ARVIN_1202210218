public class Calculation implements Runnable {
    private final double radius ;
    private final double side ;
    private static double area ;
    static double phi = 3.14;

    public Calculation (double radius, double side, double area, double phi){
        this.radius = radius;
        this.side = side;
        this.area = area;
    }

    

    private void setSquare() {
        area = side*side;
    }
        
    public static double getSquare() {
        return area;
    }

    private void setCircle() {
        double radius = phi*radius*radius;
    }

    public static int getCircle() {
        return radius;
    }

    private void setTrapezoid(double a, double b, double t) {
        double side = 0.5 *(a*b) * t;
    }

    public static int getTrapezoid() {
        return area;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    
    


        


}

    