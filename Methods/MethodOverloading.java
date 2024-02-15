package Methods;

public class MethodOverloading {

    // a. By changing the return type : 
    int multiply(int a, int b) {
        return a * b;
    }
    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);

    }
}
