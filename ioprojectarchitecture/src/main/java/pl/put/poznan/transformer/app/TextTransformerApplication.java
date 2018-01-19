package pl.put.poznan.transformer.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Główna funkcja naszego REST api.
 */

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {

    /**
     * Metoda wywołuje uruchomienie aplikacji.
     */
    public static void main(String[] args) {

        SpringApplication.run(TextTransformerApplication.class, args);
    }
}
