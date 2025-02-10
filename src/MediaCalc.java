import java.util.Scanner;

public class MediaCalc {
    Scanner s = new Scanner(System.in);

    private Double noteOne;
    private Double noteTwo;
    private Double noteTree;
    private Double noteFor;
    private Double media;

    public void Calculator() {
        System.out.println("Informe as 4 notas do aluno:");

        System.out.println("Informe a primeira nota: ");
        noteOne = s.nextDouble();

        System.out.println("Informe a segunda nota: ");
        noteTwo = s.nextDouble();

        System.out.println("Informe a terceira nota: ");
        noteTree = s.nextDouble();

        System.out.println("Informe a quarta nota: ");
        noteFor = s.nextDouble();

        media = (noteOne + noteTwo + noteTree + noteFor) / 4;

        if(media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if(media < 7 && media >= 5) {
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        };
    };
}
