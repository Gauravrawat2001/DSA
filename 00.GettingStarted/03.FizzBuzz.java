// solution1 
public class Solution{
    public static void main(String[]args){
    for(int i = 1; i<=100; i++){
        if(i % 3 == 0)System.out.print("Fizz");
        if(i%5==0)System.out.print("Buzz");
        else if
        (i%3 != 0)System.out.print(i);System.out.println();
    }

  }
}


// optimized

public class Solution{
    public static void main(String[]args){
        int fizz = 0, buzz = 0;
    for(int i = 1; i<=100; i++){
       fiz++; buzz++;
       if(fizz == 3 && buzz == 3){
        System.out.println("fizzbuzz");
        fizz =0;
        buzz = 0;
       }else if(fizz == 3){
        System.out.println("fizz");
        fizz = 0;
       }else if(buzz == 5){
        System.out.println("buzz");
        buzz = 0;
       }else{
        System.out.println(i);
       }
    }

  }
}
