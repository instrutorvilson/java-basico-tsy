import enums.Preferencial;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Vaga> vagasRotativas = new ArrayList<>();
    public static void main(String[] args) {
      criarVagasRotativas();
      lerVagas();
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