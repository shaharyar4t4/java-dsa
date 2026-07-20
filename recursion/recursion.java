
public class recursion{

    public static int factorial(int num){
        // this is base case 
        // q ye par jo ha 0 or 1 ---> 0 ka factorial 0 hota ha or 1 ka factorial 1 hota ha..
        if(num  == 0  || num == 1){
            return 1;
        }
        // this is recursive case -- > this is call itself..
        return num * factorial(num - 1);
        // let suppose user na 5 input daya ha 
        // 5*4*3*4*1
        // 4*3*2*1
        // 3*2*1
        //2*1
        // 1 return 1 hogya tu base case chala ga 
    }
    public static int sumNatural(int num){
        // this is base case 
        // this case is represent the 1 aajya ga recursion stop hojaya ga..
        if(num == 1){
            return 1;
        }
        // this is recursive case  -->this is call it self
        return num + sumNatural(num - 1);
        // this is recursive case
        // 5 + sum(4)
        // 5 + (4 + sum(3))
        // 5 + (4 + (3 + sum(2)))
        // 5 + (4 + (3 + (2 + sum(1))))
        // 5 + 4 + 3 + 2 + 1
        = 15
    
    }

    public static void main(String [] args){
         System.out.println("the Factorial of input value is: "+ factorial(5));
         System.out.println("the natural of sum value is: "+ sumNatural(10));
    } 
}












// when user the input value 
// import java.util.Scanner;

// public class recursion{

//     public static int factorial(int num){
//         // this is base case 
//         // q ye par jo ha 0 or 1 ---> 0 ka factorial 0 hota ha or 1 ka factorial 1 hota ha..
//         if(num  == 0  || num == 1){
//             return 1;
//         }
//         // this is recursive case -- > this is call itself..
//         return num * factorial(num - 1);
//         // let suppose user na 5 input daya ha 
//         // 5*4*3*4*1
//         // 4*3*2*1
//         // 3*2*1
//         //2*1
//         // 1 return 1 hogya tu base case chala ga 
//     }
//     public static void main(String [] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the value: ");
//          int num = input.nextInt();
//          System.out.println("the Factorial of input value is: "+ factorial(num));
//     } 
// }