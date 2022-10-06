import java.time.Period;

public class Mensalista extends Vaga{
   private Turno periodo;
   private Cliente cliente;

 /*   public Mensalista(String identificacao, Turno periodo, Cliente cliente) {
        super(identificacao);
        this.periodo = periodo;
        this.cliente = cliente;
        this.ocupada = true;
    }
*/

    public Mensalista(String identificacao) {
        super(identificacao);
    }

    public boolean addCliente(Cliente cliente, Turno periodo){
        this.periodo = periodo;
        this.cliente = cliente;
        return true;
    }


    public Turno getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Turno periodo) {
        this.periodo = periodo;
    }

    public void display(){
        super.display();
        System.out.println("Periodo: " + this.periodo);
        this.cliente.display();
    }
}
