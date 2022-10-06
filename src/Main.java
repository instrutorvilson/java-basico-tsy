import enums.Preferencial;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    static List<Vaga> vagasRotativas = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    static List<Mensalista> mensalistas = new ArrayList<>();
    public static void main(String[] args) {
      criarVagasRotativas();
      //lerVagas();
      // criarVagasMensalistas();
        Rotativo r = new Rotativo("A10",Preferencial.GERAL);

      Movimento m = new Movimento(r,"LZZ-1976");
      m.registrarSaida();

    }

    public static void datas(){
        LocalDateTime dataEntrada = LocalDateTime.parse("2022-10-06T08:00:00.000");
        LocalDateTime dataSaida = LocalDateTime.parse("2022-10-06T12:00:00.000");
        System.out.println(dataSaida.getHour() - dataEntrada.getHour());
        System.out.println(dataEntrada.toEpochSecond(OffsetDateTime.now().getOffset()));
        System.out.println(dataSaida.toEpochSecond(OffsetDateTime.now().getOffset()));

        System.out.println(dataSaida.toInstant(OffsetDateTime.now().getOffset()));
        System.out.println(dataEntrada.toInstant(OffsetDateTime.now().getOffset()));
        long horaSaida = dataSaida.toInstant(OffsetDateTime.now().getOffset()).getEpochSecond();
        long horaEntrada = dataEntrada.toInstant(OffsetDateTime.now().getOffset()).getEpochSecond();
        System.out.println((horaSaida - horaEntrada)/60/60);

        System.out.println(dataEntrada.until(dataSaida, ChronoUnit.HOURS));
    }
    public static void criarVagasMensalistas(){
        criarCliente();
        Cliente cli = clientes.get(0);
        Cliente cli1 = clientes.get(1);
        // Mensalista m = new Mensalista("A50",Turno.MATUTINO, cli);
        Mensalista m = new Mensalista("A50");
        m.addCliente(cli, Turno.MATUTINO);
        mensalistas.add(m);

        m.addCliente(cli1,Turno.VESPERTINO);
        mensalistas.add(m);
        //  m.display();
        for(Mensalista ms: mensalistas){
            ms.display();
        }

        // Mensalista m1 = new Mensalista("A50",Turno.VESPERTINO, cli1);
        // m1.display()
    }
    public static void criarCliente(){
        Carro fusca = new Carro("LZZ-1976","Fusca");
        Carro kombi = new Carro("ABC-1978","Kombi");
        Carro kombi2 = new Carro("ABC-1978","Kombi");

        System.out.println(kombi);
        System.out.println(kombi2);

        Cliente c = new Cliente("Jose");
        c.addCarro(fusca);
        c.addCarro(kombi);
        c.addCarro(kombi2);

        clientes.add(c);

        Cliente c1 = new Cliente("Maria");
        c1.addCarro(fusca);
        clientes.add(c1);
    }

    public static  void lerVagas(){
        for(Vaga r : vagasRotativas){
            r.display();
        }
    }
    public static void criarVagasRotativas(){
        Rotativo a1 = new Rotativo("A1",Preferencial.CADEIRANTE);
        vagasRotativas.add(a1);

        Rotativo a10 = new Rotativo("A10",Preferencial.IDOSO);
        vagasRotativas.add(a10);

        Rotativo a20 = new Rotativo("A20",Preferencial.GRAVIDAS);
        vagasRotativas.add(a20);

        Rotativo a30 = new Rotativo("A30",Preferencial.GERAL);
        vagasRotativas.add(a30);

        Rotativo a31 = new Rotativo("A31",Preferencial.GERAL);
        vagasRotativas.add(a31);

    }

}