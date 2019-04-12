
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MorseTest {
    
    private Morse morse;
    
    @Before
    public void inicializa(){
        morse = new Morse ( );
    }
    
    
   @Test
    public void testaSOS(){
        morse.setMensagem("SOS");
        assertEquals("*** --- ***",morse.codifica());
    }   
    @Test
    public void testaSSS(){
        morse.setMensagem("SSS");
        assertEquals("*** *** ***",morse.codifica());    
   }

}
    
    