package br.com.cepp.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${word-config.lucky-word}")
    private String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckWord() {
        return String.format("The lucky word is %s", this.luckyWord);
    }
}
