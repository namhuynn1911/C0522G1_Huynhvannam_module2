package ss16_io_text_file.exercise.country.service.impl;

import ss16_io_text_file.exercise.country.model.Country;
import ss16_io_text_file.exercise.country.service.ICountryService;
import ss16_io_text_file.exercise.country.utils.ReadFileUtil;

import java.io.IOException;
import java.util.List;

public class CountryService implements ICountryService {
    private static final String PATH = "src/ss16_io_text_file/exercise/country/model/Country.java";


    @Override
    public void displayCountry() throws IOException {
        List<Country> countryList = ReadFileUtil.readCountryFile(PATH);
        for (Country country : countryList) {
            System.out.println(country.getInfo());
        }
    }
}
