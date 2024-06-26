import java.util.Scanner;

public class VerificacaoChequeEspecial{
    /** <h1> DIO </h1>
   * <h1> Verificador de Cheque Especial </h1>
   * Desafio de código 4 / 5  da DIO - Verificação de Cheque Especial
   *@author victoriaflb
    @version 2024.1
    @since 25/06/2024
    */

    public static void main(String[] args){
       
        
        Scanner scanner = new Scanner(System.in);

       System.out.println("Quanto é o seu saldo?");
        double saldo = scanner.nextDouble();
        System.out.println("Quanto você gostaria de sacar?");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transação realizada com sucesso.");
            System.out.println(saldo);
        } else {
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            VerificarSeUsouChequeEspecial(saldo,limiteChequeEspecial);
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            if(VerificarSeUsouChequeEspecial(saldo, limiteChequeEspecial) > saque){
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
                System.out.println(saldo);
            }else{
                // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
              System.out.println("Transação não realizada. Limite do cheque especial excedido.");
              System.out.println(saldo);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    private static Double VerificarSeUsouChequeEspecial(double saldo, double limiteChequeEspecial){
        return saldo + limiteChequeEspecial;
    }
}
