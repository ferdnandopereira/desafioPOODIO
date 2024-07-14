import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Boot de Programação em Java");
        curso1.setCargaHoraria(90);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Francês");
        mentoria1.setDescricao("Curso de Frances para Iniciantes");
        mentoria1.setCargaHoraria(160);

        Conteudo conteudo = new Curso();

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}