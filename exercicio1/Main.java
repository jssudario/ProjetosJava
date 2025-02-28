package exercicio1;

public class Main {
    public static void main(String[] args) {
        //instanciar o Objeto Aluno
        Aluno a1 = new Aluno();
        a1.nome = "Julia";
        a1.nota1 = 70;
        a1.nota2 = 69.6;
        a1.calcularMedia();
        
        System.out.println("Média: " + a1.media);
    }
}
