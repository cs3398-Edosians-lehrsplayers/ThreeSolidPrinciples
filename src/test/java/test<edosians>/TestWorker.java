package edosians;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
    private Worker w = new Worker();
    @Test
    @DisplayName("Work Method Test")
    public void testWorkMethod()
    {
        assertEquals(w.work(), "I'm working already!", "Mismatch between test text and method text");
    }

    @Test
    @DisplayName("Oswaldo's Successful Test")
    public void newtestOVWorkerPass()
    {
        assertTrue(w.addition(1, 4), "Indeed, I can do addition, I am a smart program.");
    }

    @Test
    @DisplayName("Oswaldo's Failed Test")
    public void newtestOVWorkerFail()
    {
        
    }
}

