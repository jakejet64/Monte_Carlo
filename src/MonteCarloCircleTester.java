public class MonteCarloCircleTester {
    public static void main(String[] args){
        MonteCarloCircle test = new MonteCarloCircle(1);
        test.run(10000);
        /*
        Side-note: I believe that the Math.random() function isn't
        quite evenly distributed in this case due to the short
        running time of the program, when tested with higher iterations
        that take longer to compute the result gets closer and closer to
        what the answer should be, pi

        For Example:
            On iteration: 100000000
            Estimated area is: 3.1415978303030303
         */
    }
}
