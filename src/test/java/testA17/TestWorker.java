package edo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
    

   public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    @DisplayName("Pass Method Test")
    public void newtestJGWorkerPass(){
        TestWorker asft = new TestWorker();
        assertTrue(asft.isEvenNumber(4));
    }

    @Test
    @DisplayName("fail Method Test")
    public void newtestJGWorkerFail(){
        TestWorker as = new TestWorker();
        assertTrue(as.isEvenNumber(3));
    }
}
