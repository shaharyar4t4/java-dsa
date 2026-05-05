public class linearsearch {
    public static void main(String[] args) {
        int[] number = { 10, 20, 30, 40, 50 };
        int target = 20;

        int result = linearsearchvalue(number, target);
        if(result != -1){
            System.out.println("Element found on this index: "+ result);
        }else{
            System.out.println("Element not found on this index"+ result);
        }

    }

    public static int linearsearchvalue(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }
}