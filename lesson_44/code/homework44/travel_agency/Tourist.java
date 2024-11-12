package homework44.travel_agency;

import java.util.Arrays;
import java.util.List;

class Tourist {

    private final String name;
    private final List<String> countriesVisited;

    public Tourist(String name, String... countriesVisited) {
        this.name = name;
        this.countriesVisited = Arrays.asList(countriesVisited);
    }

    public String getName() {
        return name;
    }

    public List<String> getCountriesVisited() {
        return countriesVisited;
    }
}