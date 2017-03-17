import java.util.Scanner;

public class factorial {
.git/
.git/public static void main(String []args) {
.git/Scanner scanInput = new Scanner(System.in);
.git/System.out.print("Introduzca un numero: ");
.git/long num = scanInput.nextLong();
.git/long fac = 1;
.git/for (long i=1; i<=num; ++i) {
.git/fac = fac * i;
.git/}
.git/System.out.println("El factorial de "+num+" es "+fac);
.git/scanInput.close();
.git/}

}
