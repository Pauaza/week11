import java.util.Scanner;;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //instruksi untuk memasukkan nilai n
        System.out.print("Masukkan Nilai N: ");
        int n = sc.nextInt();
        //jika input kurang dari 3 maka program akan berulang
        while (n < 3) {
            System.out.println("Nilai N minimal 3");
            System.out.println("------------------");
            System.out.println("SILAHKAN COBA LAGI");
            System.out.println("------------------");
            System.out.print("Masukkan Nilai N: ");
            n = sc.nextInt();
        }   
        //untuk melakukan perulangan per baris ketika nilai i kurang dari sama dengan n nilai i dan nilai i bertambah
        for (int i = 1 ; i <= n ; i++){
            //untuk melakukan perulangan ketika j kurang dari sama dengan n pada baris ke i dan nilai j akan bertambah
            for(int j = 1 ; j <= n ; j++){
                //ketika nilai i sama dengan 1 atau nilai i smaa dengan n atau nilai j sama dengan 1 atau nilai j sama dengan n, maka print n
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print(n + " ");
                //ketika perintah didalam if tidak ada yang sesuai, maka akan print spasi
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
    