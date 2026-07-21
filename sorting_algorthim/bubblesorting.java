package sorting_algorthim;

// time complex = 0(n)
// worst case = o(n)^2
public class bubblesorting {
    public static void bubblesorting(int[] height) {
        // first part hoga array ki jo height hogi wo aajya gi.
        int n = height.length;

        // why n-1 means koi hum last wali value ko check nhi karya ga wo humsha se
        // sorting formate me hogi..
        for (int i = 0; i < n - 1; i++) {
            // jese swapp hogi value humme pata chala ga yehe swapping hui ha.. like
            // swappedd ki value automatically
            boolean swapped = false;
            // this loop preform main task like yehe loop values ko swapp karta ha...
            for (int j = 0; j < n - 1 - i; j++) {
                if (height[j] > height[j + 1]) {
                    int temp = height[j];
                    height[j] = height[j + 1];
                    height[j + 1] = temp;

                    swapped = true;
                }
            }

        }

    }

    public static void showArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] studentHeights = { 170, 150, 180, 160, 190 };
        System.out.println("Before Sorting: ");
        showArray(studentHeights);

        System.out.println("After Sorting: ");
        bubblesorting(studentHeights);
        showArray(studentHeights);

    }

}