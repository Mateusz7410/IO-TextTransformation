package pl.put.poznan.transformer.rest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Klasa reagująca na wystapienia błędu braku mapowania.
 */
@RestController
public class IndexController implements ErrorController {
    private static final String PATH = "/error";

    /**
     * Nadpisanie metody z błędem.
     */
    @Override
    public String getErrorPath() {
        return PATH;
    }

    /**
     * Zwrócenie własnego komunikatu przy błędzie.
     */
    @RequestMapping(PATH)
    public String error() {
        return "No Mapping available.";
    }
}
