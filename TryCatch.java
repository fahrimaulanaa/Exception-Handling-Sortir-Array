import java.util.ArrayList;

public class TryCatch {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> array10 = new ArrayList<Integer>();
            ArrayList<Integer> array25 = new ArrayList<Integer>();
            ArrayList<Integer> array50 = new ArrayList<Integer>();
            ArrayList<Integer> array100 = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                double random = (Math.random() * 10 + i);
                array10.add((int) Math.round(random));
            }
            for (int i = 0; i < 25; i++) {
                double random = (Math.random() * 10 + i);
                array25.add((int) Math.round(random));
            }
            for (int i = 0; i < 50; i++) {
                double random = (Math.random() * 10 + i);
                array50.add((int) Math.round(random));
            }
            for (int i = 0; i < 100; i++) {
                double random = Math.random() * 10 + i;
                array100.add((int) Math.round(random));
            }
            System.out.println("Array 10 elemen belum disortir: " + array10);
            bubbleSort(array10, array10.size());
            System.out.println("");
            System.out.println("Array 25 elemen belum disortir: " + array25);
            bubbleSort(array25, array25.size());
            System.out.println("");
            System.out.println("Array 50 elemen belum disortir: " + array50);
            bubbleSort(array50, array50.size());
            System.out.println("");
            System.out.println("Array 100 elemen belum disortir: " + array100);
            bubbleSort(array100, array100.size());
            System.out.println("\n");

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }


    static void bubbleSort(ArrayList<Integer> arr, int n) {
        int i, j, temp;
        for (i = 0; i < arr.size(); i++) {
            for (j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {// swap the elements
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        System.out.println("");
        System.out.println("Seluruh Array yang sudah disortir: ");
        System.out.println(arr);
    }
}


