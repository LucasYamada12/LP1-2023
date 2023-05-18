public class variavel extends gastos {
    private int tempomeses;

    public variavel(String nome, double valor, int tempomeses) {
        super(nome, valor);
        this.tempomeses = tempomeses;
    }

    public int getTempomeses() {
        return tempomeses;
    }

    public void setTempomeses(int tempomeses) {this.tempomeses = tempomeses;}
}
