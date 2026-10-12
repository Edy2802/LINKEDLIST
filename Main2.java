package POO;
import java.util.LinkedList;

public class Main2 {

    public static void main(String[] args) {

        LinkedList<String> canciones = new LinkedList<>();

        // Agregar canciones
        canciones.add("Blurry Nights");
        canciones.add("Toxic");
        canciones.add("Understand");

        // Agregar una canción al inicio
        canciones.addFirst("Long Drives");

        // Mostrar la lista completa
        System.out.println("=== LISTA DE REPRODUCCION ===");

        for (int i = 0; i < canciones.size(); i++) {
            System.out.println((i + 1) + ". " + canciones.get(i));
        }

        // Consultar primera y ultima canción
        System.out.println("\nPrimera canción: " + canciones.getFirst());
        System.out.println("Última canción: " + canciones.getLast());

        // Eliminar una canción
        canciones.remove("Toxic");

        // Mostrar la lista actualizada
        System.out.println("\n=== LISTA ACTUALIZADA ===");

        for (String cancion : canciones) {
            System.out.println("- " + cancion);
        }

        System.out.println("\nTotal de canciones: " + canciones.size());
    }
}