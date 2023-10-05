//learning oop in java

class Calculator {
    // this.num1 = ;
    // int num2;
    
    public int AddTwo(int num1,int num2){
        return num1 + num2;
    }
    
}
public class Oop{
    public static void main(String args[]){
        int num1 = 1;
        int num2 = 2;
        int result;
        Calculator car = new Calculator();
        result = car.AddTwo(num1,num2);
        System.out.println(result);
    
    }

}
