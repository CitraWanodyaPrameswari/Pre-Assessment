import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int counter, num, item, array[], first, last, middle;
        System.out.println("Masukkan jumlah angka:");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Masukkan " + num + " angkanya");

        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.println("Masukkan angka yang ingin dicari:");
        item = input.nextInt();
        first = 0;
        last = num - 1;
        middle = (first + last)/2;

        while( first <= last ) {
            if ( array[middle] < item )
                first = middle + 1;
            else if ( array[middle] == item ) {
                System.out.println(item + " berada di " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(item + " tidak ditemukan.\n");
    }
}