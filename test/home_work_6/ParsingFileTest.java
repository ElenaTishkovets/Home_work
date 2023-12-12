package home_work_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;

public class ParsingFileTest {

       @Test
    public void saveSearchResult(){
        ParsingFile file = new ParsingFile();
        Assertions.assertEquals("Поиск по файлу: work1.txt  -- значения \" работа \"  -- дал результат -- 10", file.saveSearchResult("work1.txt", "работа", 10));
    }





}
