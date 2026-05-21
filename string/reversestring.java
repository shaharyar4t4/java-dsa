package string;
public class reversestring{
    public static void main(String [] args){

        // this is immutable === mean it is not changeable
        String original = "Shaharyar";
        String value = reverseString(original);
        System.out.println("the Reverse String: "+value);
        
    }

   public static String reverseString(String val){
    StringBuilder value = new StringBuilder();
    
    for(int i = val.length() -1; i >= 0; i--){
        value.append(val.charAt(i));
    }
    return value.toString();
   }
}

