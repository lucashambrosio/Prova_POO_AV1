package Questao1;

public class main {
    public static void main(String[] args) {
        // Criando objeto CartaoCredito
        CartaoCredito cartaoCredito = new CartaoCredito("17/04/2023 14:30", 123456, 500.0, "1234 5678 9012 3456", "João Silva");
        String cupomFiscalCartaoCredito = cartaoCredito.imprimirCupomFiscal();
        System.out.println(cupomFiscalCartaoCredito);

        // Criando objeto Pix
        Pix pix = new Pix("17/04/2023 15:00", 654321, 250.0, "joao.silva@gmail.com", "Maria Souza", "12345678900");
        String cupomFiscalPix = pix.imprimirCupomFiscal();
        System.out.println(cupomFiscalPix);

        // Criando objeto CartaoDebito
        CartaoDebito cartaoDebito = new CartaoDebito("17/04/2023 16:30", 789123, 100.0, "9876 5432 1098 7654", "João Silva");
        String cupomFiscalCartaoDebito = cartaoDebito.imprimirCupomFiscal();
        System.out.println(cupomFiscalCartaoDebito);
    }



}
