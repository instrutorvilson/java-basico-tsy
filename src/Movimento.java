import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Movimento {
    private Rotativo vaga;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private String placa;

    public void emitirRecibo(){
        System.out.println("Entrada: " + this.dataEntrada);
        System.out.println("Saida: " + this.dataSaida);
        System.out.println("Duração: " + calculaTempo());
        System.out.println("Valor R$: " + calculaTempo() * 10);
    }

    public void registrarSaida(){
        //this.dataSaida = LocalDateTime.now();
        this.dataSaida = LocalDateTime.parse("2022-10-06T15:00:00.000");
        this.vaga.ocupada = false;
        emitirRecibo();
    }

    private long calculaTempo(){
      return  dataEntrada.until(dataSaida, ChronoUnit.HOURS);
    }

    public Movimento() {
    }

    public Movimento(Rotativo vaga, String placa) {
        this.vaga = vaga;
        this.dataEntrada = LocalDateTime.now();
        this.placa = placa;
        this.vaga.ocupada = true;
    }

    public Rotativo getVaga() {
        return vaga;
    }

    public void setVaga(Rotativo vaga) {
        this.vaga = vaga;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
