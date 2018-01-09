package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Arrays;

/**
 * Klasa kontrolująca nasze REST api, odbierająca i wysyłająca dane odpowiednio przetworzone prze inne klasy.
 */
@RestController
@RequestMapping("/{text}")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);
    /**
     * Metoda pobierająca dane i przechwytująca zapytanie po ?transforms= przekazane w linku.
     * Następnie zwracająca przekonwertowany text według transformacji (kolejność ma znaczenie) w formacie JSON.
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="nothing") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        TextTransformer transformer = new TextTransformer(transforms);
        return "{ \"result\":\"" + transformer.transform(text) + "\"}";
    }
    /**
     * Metoda pobierająca dane i przechwytująca zapytanie po ?transforms= przekazane w pakiecie.
     * Następnie zwracająca przekonwertowany text według transformacji (kolejność ma znaczenie) w formacie JSON.
     */
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                      @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        TextTransformer transformer = new TextTransformer(transforms);
        return "{ \"result\":\"" + transformer.transform(text) + "\"}";
    }



}


