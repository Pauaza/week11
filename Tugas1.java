import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            // instruksi untuk memasukkan nilai N
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
            //jika nilai N kurang dari sama dengan 3 maka prgram akan berulang
        if (n < 3) {
            System.out.println("Nilai N harus lebih besar atau sama dengan 3");
            return;
        }
            //untuk melakukan perulangan print i sesuai dengan nilai N
        for (int i = 1; i <= n; i++) {
            //untuk mengprint spasi sesuai dengan nilai N dan menjorok kekanan
            String spasi = "";
            for (int j = n - i; j > 0; j--) {
                spasi += " ";
            }
            for (int j = 1; j <= i; j++) {
                spasi += j;
            }
            System.out.println(spasi);
        }
    }
}

