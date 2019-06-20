package Paquetes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecuenciaParentesisTest {

    @Test
    public void resolverSecuenciaParentesis() {
        SecuenciaParentesis sP = new SecuenciaParentesis(6,"(?????");
        assertEquals("((()))",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis2() {
        SecuenciaParentesis sP = new SecuenciaParentesis(10,"(???(???(?");
        assertEquals(":(",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis3() {
        SecuenciaParentesis sP = new SecuenciaParentesis(10,"((?()??())");
        assertEquals("(((()))())",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis4() {
        SecuenciaParentesis sP = new SecuenciaParentesis(0,"");
        assertEquals("",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis5() {
        SecuenciaParentesis sP = new SecuenciaParentesis(5,"((?()??())");
        assertEquals(":(",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis6() {
        SecuenciaParentesis sP = new SecuenciaParentesis(18,"??)??))?)?)???))))");
        assertEquals("(()(())()()((())))",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis7() {
        SecuenciaParentesis sP = new SecuenciaParentesis(2,"??");
        assertEquals("()",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis8() {
        SecuenciaParentesis sP = new SecuenciaParentesis(30,"((?(?????()?(?)???????)?)??(??");
        assertEquals("(((((((((()((()()))))))))))())",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis9() {
        SecuenciaParentesis sP = new SecuenciaParentesis(1,"?");
        assertEquals(":(",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis10() {
        SecuenciaParentesis sP = new SecuenciaParentesis(300,"?(??(??????????(?????????(????(????)???????????((??????((??(???(?(((????(??((?((((??(?(?????(???????????)??)????????(?(????????(?(??(???????(???(???((???()?????(???????(?????(?????((?????????(??(????(????????((?????????((???????)?()????????(??????)???????????(??(??????(?(???????((????(?(?(??????(???");
        assertEquals("((((((((((((((((((((((((((((((((((()(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((()(()((((((((((((())))))()())()))))))()))()))(()))())))))()))))))()))))()))))(()))))))))())())))())))))))(()))))))))(()))))))))()))))))))())))))))))))))))))())())))))()()))))))(())))()()())))))()))",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis11() {
        SecuenciaParentesis sP = new SecuenciaParentesis(3,"(()");
        assertEquals(":(",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis12() {
        SecuenciaParentesis sP = new SecuenciaParentesis(4,"()()");
        assertEquals(":(",sP.resolverSecuenciaParentesis());
    }

    @Test
    public void resolverSecuenciaParentesis13() {
        SecuenciaParentesis sP = new SecuenciaParentesis(4,"))))");
        assertEquals(":(",sP.resolverSecuenciaParentesis());
    }

}