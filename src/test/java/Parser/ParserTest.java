package Parser;

import Task.Todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {
    @Test
    void parseEchoTest() {
        Todo simpleTask = new Todo("Apple");
        assertEquals(simpleTask.toString(), Parser.parseEcho("todo Apple").toString());
    }

    @Test
    void parseFileReaderTest() {
        Todo simpleTask = new Todo(true,"Apple");
        Todo task = (Todo) Parser.parseFileReader("todo Apple", true);
        assertEquals(simpleTask.toString(), task.toString());
        assertTrue(task.getIsDone());
    }
}