package good.patterns.challenges;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> movieStream = new MovieStore().getMovies();

        List <String> addSomething = new ArrayList<>(Arrays.asList("!"));

        List <String> movieStreamPrint1 = movieStream.entrySet().stream().
                flatMap(stringListEntry -> stringListEntry.getValue().stream()).
                collect(Collectors.toList());
        System.out.println("Print List movieStreamPrint1: " + movieStreamPrint1);

        String movieStreamPrint2 = movieStream.entrySet().stream()
                .flatMap(msp -> msp.getValue().stream())
                .collect(Collectors.joining("!","",""));
        System.out.println(movieStreamPrint2);














    }
}
