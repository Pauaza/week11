import java.util.Scanner;
public class NestedLoop_2341760063 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double [][] Nested= new double [5][7];
        int total=0;
        double[] Ratarata= new double[5];
        for (int i = 0; i < Nested.length; i++) { 
                System.out.println("Kota ke-" + (i+1)); 
            for (int j = 0; j < Nested[0].length; j++) { 
             System.out.print("Hari ke-" + (j + 1) + ": "); 
            Nested[i][j] = sc.nextDouble(); 
            total += Nested[i][j];
            } 
                System.out.println();
                Ratarata[i]= total/7; 
                total=0;
           } 
           for (int i = 0; i < Nested.length; i++) { 
                System.out.print("Kota ke-" + (i + 1) + ": "); 
            for (double suhu : Nested[i]){
                System.out.print(suhu + " ");
            }
                System.out.println();
            System.out.printf("Rata rata : %.2f\n "+ Ratarata[i]); 
            } 
        
           }
    

    }

