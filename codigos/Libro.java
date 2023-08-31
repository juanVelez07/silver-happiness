import java.util.Scanner;

public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String resumen() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Número de páginas: " + numeroPaginas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el número de páginas del libro: ");
        int numeroPaginas = scanner.nextInt();

        Libro libro = new Libro(titulo, autor, numeroPaginas);
        String resumenLibro = libro.resumen();
        System.out.println("\nResumen del libro:\n" + resumenLibro);

        scanner.close();
    }
}
