package py.edu.unasur.resources;
import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

public class SegundoParcialResource {

    @POST
    @Path("/segundo-parcial")
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaSegundoParcial procesarLista(List<String> palabras) {
        // Lógica para contar y obtener palíndromos

        int contadorPalindromos = 0;
        List<String> listaPalindromos = new ArrayList<>();

        for (String palabra : palabras) {
            if (esPalindromo(palabra)) {
                contadorPalindromos++;
                listaPalindromos.add(palabra);
            }
        }

        return new RespuestaSegundoParcial(contadorPalindromos, listaPalindromos);
    }

    private boolean esPalindromo(String palabra) {
        // Lógica para verificar si una palabra es palíndromo
        StringBuilder reversed = new StringBuilder(palabra).reverse();
        return palabra.equalsIgnoreCase(reversed.toString());
    }

    // Clase anidada para la respuesta
    public static class RespuestaSegundoParcial {
        public int totalPalindromos;
        public List<String> listaPalindromos;

        public RespuestaSegundoParcial(int totalPalindromos, List<String> listaPalindromos) {
            this.totalPalindromos = totalPalindromos;
            this.listaPalindromos = listaPalindromos;
        }
    }
}