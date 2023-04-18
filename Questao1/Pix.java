package Questao1;

public class Pix extends Pagamento {

    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, String s, String maria_souza, String s1) {
        super();
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCupomFiscal() {
        String chavePix = null;
        return "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n" +
                "Número do Pagamento: " + getNumeroPagamento() + "\n" +
                "Valor Pago: " + getValorPago() + "\n" +
                "Chave Pix: " + chavePix;
    }

}
