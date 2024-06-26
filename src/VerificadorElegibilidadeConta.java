import java.util.Scanner;

public class VerificadorElegibilidadeConta {
   /**<p> Correto </p> 
   * <h1> Verificador de Idade para Conta Bancária </h1>
   * Desafio de código 3 / 5  da DIO - Verificação de Idade para Conta Bancária
   * @author victoriaflb
     @version 2024.1
     @since 23/06/2024
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int idade = scanner.nextInt();

        if(idade >= 18){
        System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else{
        System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
    }
        scanner.close();
    }

   
}