package ss16_io_text_file.exercise.country.controller;

import ss16_io_text_file.exercise.country.service.ICountryService;
import ss16_io_text_file.exercise.country.service.impl.CountryService;

import java.io.IOException;


public class MainController {
   private static ICountryService iCountryService=new CountryService();
    public static void menuController() throws IOException {
        iCountryService.displayCountry();
    }
}

