import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

     System.out.println("Digite seu Nome");
     String nome  = scanner.next();

     System.out.println("Digite seu Sobrenome");
     String sobrenome  = scanner.next();

     System.out.println("Digite número da conta");
     int conta  = scanner.nextInt();

     System.out.println("Digite o número da agência");
     String agencia = scanner.next();

     
     System.out.println("Nome "  + nome +  " " + sobrenome);
     System.out.println("conta "  +  conta);
     System.out.println("agencia "  +  agencia);
     System.out.print("Saldo " + 237.48 );

}

}



