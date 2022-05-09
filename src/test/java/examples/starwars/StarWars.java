package examples.starwars;

import com.intuit.karate.junit5.Karate;

public class StarWars {

    @Karate.Test
    Karate testUsers() {
        return Karate.run("starwars").relativeTo(getClass());
    }
}
