public class lazer extends gastos {
    private boolean importante;

    public lazer(String nome, double valor, boolean importante) {
        super(nome, valor);
        this.importante = importante;
    }

    public boolean getImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    @Override
    public void mudarvalor(double valor){
        valor=valor+valor/20;
    }
}
