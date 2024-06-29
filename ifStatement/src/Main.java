public class Main {
    public static void main(String[] args) {
           int x = Integer.parseInt(args[0]);
            int result = x;
            if (x % 2 == 0) {
                result *= 10;
                System.out.println("arg[0] == " + x + ": The value is: " + result);
            }
            else{
                System.out.println("arg[0] == " + x + ": The value is: " + result);
            }
        System.out.println(args[0]);
        }
    }