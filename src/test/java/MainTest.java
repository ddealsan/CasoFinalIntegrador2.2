import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testMain_visitanteOption() {
        // Simulamos la entrada del usuario como "visitante"
        String input = "visitante\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirigimos la salida estándar a un ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutamos el método main
        Main.main(new String[]{});

        // Verificamos que se haya impreso el mensaje de bienvenida
        assertTrue(outContent.toString().contains("Bienvenido al kiosko"));
    }

    @Test
    void testMain_trabajadorOption() {
        // Simulamos la entrada del usuario como "trabajador"
        String input = "trabajador\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirigimos la salida estándar a un ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Ejecutamos el método main
        Main.main(new String[]{});

        // Verificamos que se haya impreso el mensaje de bienvenida para trabajador
        assertTrue(outContent.toString().contains("Bienvenido, trabajador."));
    }

    // Se pueden agregar más tests para cubrir otras funcionalidades del programa

}