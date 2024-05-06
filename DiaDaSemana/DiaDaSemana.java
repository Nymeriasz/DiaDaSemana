package DiaDaSemana;

public enum DiaDaSemana {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private String dia;
    DiaDaSemana(String dia){
        this.dia = dia;
    }
    public String getDia(){
        return dia;
    }
}
