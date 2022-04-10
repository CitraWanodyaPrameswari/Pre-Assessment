import java.util.Scanner;
public class InsertionSort {
    public static void sort( int array[] ) {
        int Nilai = array.length;
        int i, j, temp;
        for (i = 1; i< Nilai; i++) {
            j = i;
            temp = array[i];
            while (j > 0 && temp < array[j-1]) {
                array[j] = array[j-1];
                j = j-1;
            }
            array[j] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int nilai2, i;
        System.out.println("Masukkan jumlah integer Insertion Sort");
        nilai2 = input.nextInt();
        int arr[] = new int[ nilai2 ];
        System.out.println("\nMasukkan "+ nilai2 +" integer yang ingin di Insertion Sort ");
        
        for (i = 0; i < nilai2; i++)
            arr[i] = input.nextInt();
            sort(arr);
            System.out.println("\nInteger sesudah di Insertion Sort  ");
            for (i = 0; i < nilai2; i++)
            System.out.print(arr[i]+" ");
            System.out.println();
    }
}