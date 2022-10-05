public abstract class Vaga {
    private String identificacao;
    private boolean ocupada;

    public Vaga() {
    }

    public Vaga(String identificacao) {
        this.identificacao = identificacao;
        this.ocupada = false;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void display(){
        System.out.println("Vaga: " + this.identificacao);
        System.out.println("Ocupada: " + this.ocupada);
    }
}
