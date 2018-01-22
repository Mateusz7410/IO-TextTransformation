package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Główna funkcja naszego REST api.
 */

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication{

    /**
     * Metoda wywołuje uruchomienie aplikacji.
     */
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(TextTransformerApplication.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {
            TextTransformerApplication ex = ctx.getBean(TextTransformerApplication.class);
        });
    }
}
