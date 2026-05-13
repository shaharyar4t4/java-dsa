
public class intersumarray{
    public static void main (String [] agr){
        
        int[] number = {10, 20, 30, 40};
        int sum = 0;
        
        for(int i =0; i < number.length; i++){
            sum += number[i];
        }

        System.out.println("the Sum of All Value: "+ sum);
    }
}