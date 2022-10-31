import java.util.Scanner;
class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("MASUKAN ANGKA:");
        int entry= input.nextInt();


        int num = entry;
        for(int i = 1; i <= 12; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i,num*i);
}
}
}