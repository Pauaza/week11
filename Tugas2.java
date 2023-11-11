import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //instruksi untuk memasukkan nilai N
        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();

        //untuk melakukan perulangan input nilai, jika nilai N kurang dari 5 maka program akan mengulang 
        while (n < 5){
            System.out.println("Nilai N minimal 5");
            System.out.println("------------------");
            System.out.println("SILAHKAN COBA LAGI");
            System.out.println("------------------");
            System.out.print("Masukkan Nilai N: ");
            n = sc.nextInt();
        }

        //melakukan perulangan bintang sesuai dengan nilai n pada baris pertama
        for (int i = 0 ; i < n ; i++){
            //melakukan print sesuai dengan perintah sampai nilai j sama dengan n
            for (int j = n ; j > i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
