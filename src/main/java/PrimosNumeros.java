import com.fasterxml.jackson.core.util.Separators.Spacing;

@RestController
public class PrimosNumeros {
/**
 * @return
 */
@GetMapping("/")
String hola() {
    return"Hola mundo";
}

@Override
public String toString() {
    return "PrimosNumeros []";
}   
} 