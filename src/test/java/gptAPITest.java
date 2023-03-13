
import org.testng.annotations.Test;

public class gptAPITest {


    public class gptResponseTest {

        @Test
        public void responseTest(){
            gptAPI respTest = new gptAPI();
            respTest.getAnswer();

        }
    }

}
