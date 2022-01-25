import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTestKazi {
    @Test
    public void  myTest(){
        System.out.println("myTest");
        assert true;
    }

    @BeforeEach
    public void setupChromeDriver(){
        System.out.println("setupChromeDriver");

    }

}
