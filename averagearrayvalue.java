public class averagearrayvalue{
    public static void main(String [] arg){
      int [] number = {10,20,30,40};
      double sum = 0;
      
      for(int i=0; i<number.length; i++){
        sum += number[i];
      }

    double average = sum / number.length;

    System.out.println("Average: " + average);
}

}