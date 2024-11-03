package  py.edu.unasur.resources;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/segundo-parcial")
public class SegundoParcialResource {

    @Inject
    SegundoParcialService segundoParcialService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public RespuestaSegundoParcial procesarLista(List<String> palabras) {
        // Validaciones básicas
        if (palabras == null || palabras.isEmpty()) {
            throw new IllegalArgumentException("La lista de palabras no puede ser nula o vacía");
        }

        // Invocar al servicio
        int totalPalindromos = segundoParcialService.contarPalindromos(palabras);
        List<String> listaPalindromos = segundoParcialService.obtenerPalindromos(palabras);

        return new RespuestaSegundoParcial(totalPalindromos, listaPalindromos);
    }

    public SegundoParcialService getSegundoParcialService() {
        return segundoParcialService;
    }

    public void setSegundoParcialService(SegundoParcialService segundoParcialService) {
        this.segundoParcialService = segundoParcialService;
    }
}

class SegundoParcialService {

    public int contarPalindromos(List<String> palabras) {
        int contador = 0;
        for (String palabra : palabras) {
            if (esPalindromo(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    public List<String> obtenerPalindromos(List<String> palabras) {
        List<String> palindromos = new ArrayList<>();
        for (String palabra : palabras) {
            if (esPalindromo(palabra)) {
                palindromos.add(palabra);
            }
        }
        return palindromos;
    }

    private boolean esPalindromo(String palabra) {
        // Invertir la palabra y comparar con la original
        StringBuilder reversed = new StringBuilder(palabra).reverse();
        return palabra.equalsIgnoreCase(reversed.toString());
    }
}

class RespuestaSegundoParcial {
    public int totalPalindromos;
    public List<String> listaPalindromos;

    public RespuestaSegundoParcial(int totalPalindromos, List<String> listaPalindromos) {
        this.totalPalindromos = totalPalindromos;
        this.listaPalindromos = listaPalindromos;
    }
}