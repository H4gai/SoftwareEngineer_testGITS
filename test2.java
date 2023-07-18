import java.util.*;
import java.lang.*;
import java.io.*;

public class test2 {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Tukar elemen jika elemen saat ini lebih besar dari elemen berikutnya
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, m, o;

        m = input.nextInt();
        int[] array1 = new int[m];

        for (int i = 0; i < m; i++) {
            array1[i] = input.nextInt();
        }

        o = input.nextInt();
        int[] array2 = new int[o];
        for (int i = 0; i < o; i++) {
            array2[i] = input.nextInt();
        }

        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        System.arraycopy(array1, 0, mergedArray, 0, length1);
        System.arraycopy(array2, 0, mergedArray, length1, length2);

        bubbleSort(mergedArray);

        // Buat map untuk menyimpan peringkat
        Map<Integer, Integer> rankMap = new HashMap<>();

        // Tentukan peringkat masing-masing elemen berdasarkan urutan mereka dalam

        // salinan
        for (int i = 0; i < mergedArray.length; i++) {
            rankMap.put(mergedArray[i], i + 1);
            // System.out.print(mergedArray[i] + " ");
        }

        // Cetak peringkat dari setiap elemen
        for (int num : array2) {
            System.out.print(rankMap.get(num) + " ");
        }

    }
}