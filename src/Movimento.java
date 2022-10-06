import java.time.LocalDateTime;

public class Movimento {
    private Rotativo vaga;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private String placa;

    public void registrarSaida(){
        this.dataSaida = LocalDateTime.now();
        this.vaga.ocupada = false;
        calculaTempo();
    }

    private void calculaTempo(){

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
