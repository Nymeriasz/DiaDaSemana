package DiaDaSemana;

public class Main {
    public static void main(String[] args) {
        DiaDaSemana d1 = DiaDaSemana.SEGUNDA;
        System.out.println(d1.getDia());
        System.out.println("-".repeat(20));

        try {
            DiaDaSemana d2 = DiaDaSemana.valueOf("TERCA");
            System.out.println(d2.getDia());
            DiaDaSemana d3 = DiaDaSemana.valueOf("FEIRA");
            System.out.println(d3.getDia());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("-".repeat(20));

        DiaDaSemana[] dias = DiaDaSemana.values();
        for (DiaDaSemana dia:dias) {
            System.out.println(dia.getDia());
        }
        System.out.println("-".repeat(20));

        if (d1 == DiaDaSemana.SEGUNDA){
            System.out.println("É segunda");
        }else{
            System.out.println("Não é segunda");
        }
    }
}
