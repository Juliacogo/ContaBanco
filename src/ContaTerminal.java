import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {

        double saldo = 237.48;
    
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o número da agência com dígito: ");
        String agencia = entrada.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numero = entrada.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque!");

        entrada.close();
    }

}
