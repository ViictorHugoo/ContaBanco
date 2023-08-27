import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        String agencia;
        int numeroDaConta;
        Double saldo;

        Scanner teclado = new Scanner(System.in).useLocale(java.util.Locale.US);
       
        System.out.println("Olá, bem vindo ao Banco do Brasil");
        System.out.println("Digite seu nome: ");
        nomeCliente = teclado.nextLine();
       
        System.out.println("Digite sua agência: ");
        agencia = teclado.nextLine();
       
        System.out.println("Digite sua conta: ");
        numeroDaConta = teclado.nextInt();
       
        System.out.println("Digite seu saldo: ");
        System.out.println("Use ponto para separar os centavos");
        saldo = teclado.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque");

        teclado.close();
    }
}


// "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".