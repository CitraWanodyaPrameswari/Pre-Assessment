import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int counter, number, item, array[];
        System.out.println("Masukkan jumlah integer:");
        number = input.nextInt();
        array = new int[number];

        System.out.println("Masukkan " + number + " integer nya");
        for (counter = 0; counter < number; counter++)
            array[counter] = input.nextInt();

        System.out.println("Masukkan integer yang ingin dicari:");
        item = input.nextInt();

        for (counter = 0; counter < number; counter++)
        {
            if (array[counter] == item)
            {
                System.out.println(item+" berada di "+(counter+1));
                break;
            }
        }
        if (counter == number)
            System.out.println(item + " tidak ditemukan.");
    }
}