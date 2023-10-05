class Hello{
    public static void main(String a[]){
        //data types
        String namek = "Tito";
        int resultant = 0;
        double hj = 2.3;
        float gh = 5.6f;
        long  fj = 70l;
        int tp = 12;
        int n=9;
        //type casting;conversion of type one literal to another
        int x = (int)gh;
        if (n%2==0){
            System.out.println(namek);

        }
        else{
            System.out.println("This is it");
        }
        //iternary operator
        resultant = x%2==0 ? x : 20;
        //Switch Statement
        switch(n){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            default:
                System.out.println("December");

        }
        //while loop and nested while loop
        int i = 2;
        int t = 3;
        while(i <= 10)
        {
            System.out.println("Hi" + i);
            int j = 1;
            while (j<=3){
                System.out.println(namek);
                j++;
            }
            i++;
        }
        System.out.println("bye" + i);
        do{System.out.println("Mzito");
            t++;
        }while(t<=8);
        //for loop
        for(int k=10;k<=12;k++){
            System.out.println(k*k);

        }
        //multi dimensional array
        int f = 0;
        int b =0;
        int mutiple [][]=new int[10][10];
        for(int z=0; z <=9;z++){
            for(int w =0;w<=9;w++){
                mutiple[z][w]=f;
                f++;
                System.out.print(mutiple[z][w] + " ");
            }
            System.out.println();
        }
        //string in java;mutable(Can be changed ) and immutable string(cannot be changed),
        String namaste = "Tito";
        // String nama = new String(original:"Njuguna");
        System.out.println(namaste); 
        // System.out.println(nama);

       
        }
}
