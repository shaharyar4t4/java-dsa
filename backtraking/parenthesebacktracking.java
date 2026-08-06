// this question mostly ask in leetcode question..

public class parenthesebacktracking{
    static int count = 0; // this variable is used for count the total number of valid parenthese pattern..
    public static void main(String [] args){
        int n = 3; // n is refer the pair of parenthese like () () ()... ye "(" => 1 charater ha..
        String [] result = new String [100];
        char [] current = new char[2*n];
        // this formula is refer the total no of n is multpile of 2
    
        generate(n, 0 , 0, 0, current, result);
        // n==> pair of parenthese 
        // first wala "0" => kitni parenthesis open hogi "("
        // second wala "0" => kitni parenthesis close hogi ha ")"
        // third wala "0" => current index konse ha 
        // current ==> represent static (parenthesis)
        // result ==> show the result of parenthesis..

        for(int i =0; i<count; i++){
            System.out.println(result[i]);
        }
         
    }
    public static void generate(int n, int open, int close, int index, char[] current , String[] result){

        if(index == 2*n){
            result[count] =new String(current);
            count ++;
            return;
        }

        // main concept parenthese ka ye hota ha kiya hum jitna parenthese open karta itni he bnd karta ha agr hum 3 parenthese open kiya 
        // ha tu ap ko three parenthese bnd karna hogya ..
        // agr three parenthesis open ha .. in me 2 bnd kardi ha baki 1 open raha gi tu parenthese.. tu parenthesis invalid hojya gi..

        if(open < n){
            current[index] = '('; // 1++ yehe sub ki increases hogi..
            generate(n, open +1 , close, index +1, current, result);
        }
        if(close < open ){
            current[index] = ')';
            generate(n, open , close +1, index + 1, current, result);
        }

    }
}


