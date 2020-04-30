import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Calculator obj = new Calculator();


        int result = obj.getSum(10,20);
        System.out.println(result);
    }


    public int getSum(int num1, int num2){
        int result = num1+num2;
        return result;
    }
    public int getSub(int num1, int num2){
        int result = num1-num2;
        return result;
    }
    public int getMulti(int num1, int num2){
        int result = num1*num2;
        return result;
    }
    public int getDiv(int num1, int num2){
        int result = num1/num2;
        return result;
    }
}
