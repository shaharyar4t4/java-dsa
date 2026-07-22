public class insectionsorting{

    // insection sort me array centre se work like value insert hoti centre add hoti phir wo sort hoti ha..
    // is me key value ko right side par shift hojaya..
    // mostly hum is algothrim ko hum jab use karrta ha jab humme data humraha online aaraha ho... continous
    public static void insection(int [] marks){

        int n = marks.length;
        for(int i = 1; i< n; i++){
            int key = marks[i];
            // "J" handle karta unsorted values ko
            int j = i - 1;

            // mark[j] > key value ko compare karta ha..
            while(j >= 0 && marks[j] > key){
                marks[j + 1] = marks[j];
                j -- ;
            }

            marks[j+1] = key;
        }

    }

    public static void showArray(int [] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }



    public static void main(String[] args){
        int[] marksvalue = {150, 130, 120, 185, 174, 200};
        System.out.print("\n Before the Sorting: ");
        showArray(marksvalue);

        System.out.print("\n After the Sorting: ");
        insection(marksvalue);
        showArray(marksvalue);
    } 
}