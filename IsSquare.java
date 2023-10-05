public class IsSquare {
    public static  void main (String[] args){
        int numberToCheck = 12;
        if(perfectSquare(numberToCheck)){
            System.out.println(numberToCheck  + "is A perfect Square");
        }
        else{
            System.out.println(numberToCheck  + "is not a perfect Square");
        }
    }
    public static boolean perfectSquare(int num){
        if (num < 0){
            return false;
        }
        for(int i = 0; i * i<= num; i++){
            if(i * i == num){
                return true;
            }
            
        }
        return false;
    }
}
