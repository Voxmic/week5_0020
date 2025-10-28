import java.util.Scanner;

public class luaskelilingSegitiga {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        double sisiA;
        double sisiB;
        double sisiC;
        double alasSg;
        double tinggiSg;
        double kelilingSg;
        double luasSg;

        System.out.print("Masukkan sisi A segitiga: ");
        sisiA = myObj.nextDouble();

        System.out.println("Masukkan sisi B segitiga: ");
        sisiB = myObj.nextDouble();

        System.out.println("Masukkan sisi C segitiga: ");
        sisiC = myObj.nextDouble();

        System.out.println("Masukkan alas segitiga: ");
        alasSg = myObj.nextDouble();

        System.out.println("Masukkan tinggi segitiga: ");
        tinggiSg = myObj.nextDouble();

        kelilingSg = sisiA + sisiB + sisiC;
        System.out.println("Keliling segitiga adalah: " + kelilingSg);

        luasSg = 0.5 * alasSg * tinggiSg;
        System.out.println("Luas segitiga adalah: " + luasSg);
    }

}
