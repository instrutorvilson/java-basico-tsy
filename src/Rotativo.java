import enums.Preferencial;

public class Rotativo extends Vaga{
    private Preferencial reservado;

    public Rotativo(Preferencial reservado) {
        this.reservado = reservado;
    }

    public Rotativo(String identificacao, Preferencial reservado) {
        super(identificacao);
        this.reservado = reservado;
    }

    public Preferencial getReservado() {
        return reservado;
    }

    public void setReservado(Preferencial reservado) {
        this.reservado = reservado;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipo: " + this.reservado);
        System.out.println("");
    }
}
