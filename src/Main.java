public class Main {
    public static void main(String[] args) {

        Calc calc = new Calc();

        int divide = calc.divide(4, 2);
        System.out.println(divide);

        if (divide == 2){
            System.out.println("test case 1 is passed");
        }else {
            System.out.println("test case 1 is failed");
        }

        int result = calc.divide(15, 3);
        if (result == 5){
            System.out.println("test case 2 is passed");
        }else {
            System.out.println("test case 2 is failed");
        }

    }
}
