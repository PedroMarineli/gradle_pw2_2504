package gradlegs;

public class App {
    public static void main(String[] args) {
        Genero g = new Genero();
        g.id = 1;
        g.nome = "Aventura";
        Genero g2 = new Genero();
        g2.id = 2;
        g2.nome = "Ação";
        Genero g3 = g;
        g.nome = "Técnico";

        System.out.println("Olá Gradle");
        System.out.println(g.nome);
    }
}