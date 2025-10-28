import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        int nilaiMTK, nilaiInggris, nilaiFisika;

        System.out.print("Masukkan nilai Matematika: ");
        nilaiMTK = ns.nextInt();

        System.out.print("Masukkan nilai Bahasa Inggris: ");
        nilaiInggris = ns.nextInt();

        System.out.print("Masukkan nilai Fisika: ");    
        nilaiFisika = ns.nextInt();

        if (nilaiMTK == 75 && nilaiInggris != 75) {
            System.out.println("Lulus!");
        } else {
            System.out.println("Tidak lulus lulus");
        }

        if (nilaiInggris > 90 || nilaiFisika < 75) {
            System.out.println("Anda pintar");
        } else {
            System.out.println("Harus lebih belajar");
        }
        ns.close();
    }
}
