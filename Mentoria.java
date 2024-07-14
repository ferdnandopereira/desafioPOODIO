import java.time.LocalDate;

public class Mentoria extends Conteudo{

    // atributos
    private LocalDate date;

    // construtor
    public Mentoria(){
    }
    // getters e setters

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate data){
        this.data = data;
    }

    // métodos

    @Override
    public double calcularXP() {
        return XP_PADRAO + 15d;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }
}
