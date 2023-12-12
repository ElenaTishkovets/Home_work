package home_work_6;

import home_work_6.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EasySearchTestRegExSearch {
    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search(ISearchEngine se){
        Assertions.assertEquals(1, se.search("привет, как дела!", "привет"));
    }
    @ParameterizedTest
    @MethodSource ("searchEngineProvider")
    public void search2(ISearchEngine se){
        Assertions.assertEquals(1, se.search("привет,какдела!", "привет"));

    }
    @ParameterizedTest
    @MethodSource ("searchEngineProvider")
    public void search3(ISearchEngine se){
        Assertions.assertEquals(1, se.search("привет;какдела!", "привет"));

    }
    @ParameterizedTest
    @MethodSource ("searchEngineProvider")
    public void search4(ISearchEngine se){
        Assertions.assertEquals(1, se.search("как дела!.Что делаешь?", "дела"));

    }
    @ParameterizedTest
    @MethodSource ("searchEngineProvider")
    public void search5(ISearchEngine se){
        Assertions.assertEquals(0, se.search("Привет-привет", "привет"));

    }
    @ParameterizedTest
    @MethodSource ("searchEngineProvider")
    public void search6(ISearchEngine se){
        Assertions.assertEquals(1, se.search("Привет-привет", "Привет-привет"));

    }
    @Disabled
    @ParameterizedTest
    @MethodSource ("searchEngineProvider")
    public void search7(ISearchEngine se){
        Assertions.assertEquals(0, se.search("Привет--привет", "привет"));
    }

    public static Stream<ISearchEngine> searchEngineProvider(){
        return Stream.of(
                new EasySearch(),
                new RegExSearch(false)
        );


    }
}
