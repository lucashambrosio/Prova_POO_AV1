package Questao1;

public class CartaoDebito extends Pagamento {

    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal() {
        String bandeiraCartao = null;
        return "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n" +
                "Número do Pagamento: " + getNumeroPagamento() + "\n" +
                "Valor Pago: " + getValorPago() + "\n" +
                "Bandeira do Cartão: " + bandeiraCartao + "\n" +
                "Número do Cartão: " + numCartao;
    }

}
