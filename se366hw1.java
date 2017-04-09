public class Main {

    //given problem was finding root of e^x = x*x with secant method (which means e^x-x^2 = 0)

    private static double f(double x){
        //function of e^x-x^2
        return (Math.exp(x)-(x*x));
    }

    public static void main(String[] args) {
        //x0 and x1 are initial guesses
        double x0=0, x1=1;
        //initialization
        double x2 = 0;
        //error limit
        double e=0.0000000001;
        //counter and max iteration, for better results just adjust with error and number of iterations...
        int cnt=1, maxIteration = 10;

        //first 10 iterations for finding the roots with secant method of e^x-x^2 = 0
        while(cnt < maxIteration){

            x2 = (x0*f(x1)-x1*f(x0))/(f(x1)-f(x0));

            x0 = x1;
            x1 = x2;

            System.out.println("On iteration "+cnt+" value is "+x2);
            cnt++;

            //if result exceeds error allowance limit
            if(Math.abs(f(x2))<e){
                break;
            }
        }

        System.out.println("The final solution is "+x2);
    }
}