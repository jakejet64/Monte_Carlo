public class MonteCarloCircle {
    private int pointsInCircle;
    private int radius;
    private int iteration;

    public MonteCarloCircle(int radius){
        this.radius = radius;
        pointsInCircle = 0;
        iteration = 0;
    }

    public void run(int iterations){
        while(iteration <= iterations){
            double randomX = getRandomPoint();
            double randomY = getRandomPoint();
            double distanceFromOrigin =
                    Math.sqrt(Math.pow(randomX, 2) + Math.pow(randomY, 2));
            if(distanceFromOrigin <= 1){
                pointsInCircle++;
            }
            iteration++;
            if(iteration % 100 == 0){
                double estimate = ((double) pointsInCircle / (double) iteration)
                        * Math.pow(radius * 2, 2);
                System.out.println("On iteration: " + iteration);
                System.out.println("Estimated area is: " + estimate);
            }
        }
    }

    private double getRandomPoint(){
        /*
        The obvious use of
        (Math.random() * (2 * radius)) - radius
        would go from [-radius, radius)
        I experimented with different ways of getting
        [-radius, radius] & (-radius, radius),
        and this implementation of (-radius, radius)
        seemed to return the most accurate results
        */
        double ret = Math.random() * radius;
        if(Math.random() < .5){
            ret *= -1;
        }
        return ret;
    }
}
