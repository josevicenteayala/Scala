package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawDiamondTest {

    @Test
    public void createADiamondOf23Asterisks(){
        String result = "           *\n" +
                "          ***\n" +
                "         *****\n" +
                "        *******\n" +
                "       *********\n" +
                "      ***********\n" +
                "     *************\n" +
                "    ***************\n" +
                "   *****************\n" +
                "  *******************\n" +
                " *********************\n" +
                "***********************\n" +
                " *********************\n" +
                "  *******************\n" +
                "   *****************\n" +
                "    ***************\n" +
                "     *************\n" +
                "      ***********\n" +
                "       *********\n" +
                "        *******\n" +
                "         *****\n" +
                "          ***\n" +
                "           *\n";
        assertEquals(result, DrawDiamond.drawDiamond(23));
    }

    @Test
    public void createADiamondOf3Asterisks() {
        String result = " *\n" +
                "***\n" +
                " *\n";
        assertEquals(result, DrawDiamond.drawDiamond(3));
    }

    @Test
    public void createADiamondOf7Asterisks() {
        String result = "   *\n" +
                "  ***\n" +
                " *****\n" +
                "*******\n" +
                " *****\n" +
                "  ***\n" +
                "   *\n";
        assertEquals(result, DrawDiamond.drawDiamond(7));
    }

    @Test
    public void createADiamondFromNegativeNumber() {
        assertEquals(null, DrawDiamond.drawDiamond(-7));
    }

    @Test
    public void createADiamondFromEvenNumber() {
        assertEquals(null, DrawDiamond.drawDiamond(8));
    }

    @Test
    public void createADiamondFromZeroNumber() {
        assertEquals(null, DrawDiamond.drawDiamond(0));
    }

    @Test
    public void createADiamondOf23AsterisksUsingEnhancedMethod(){
        String result = "           *\n" +
                "          ***\n" +
                "         *****\n" +
                "        *******\n" +
                "       *********\n" +
                "      ***********\n" +
                "     *************\n" +
                "    ***************\n" +
                "   *****************\n" +
                "  *******************\n" +
                " *********************\n" +
                "***********************\n" +
                " *********************\n" +
                "  *******************\n" +
                "   *****************\n" +
                "    ***************\n" +
                "     *************\n" +
                "      ***********\n" +
                "       *********\n" +
                "        *******\n" +
                "         *****\n" +
                "          ***\n" +
                "           *\n";
        assertEquals(result, DrawDiamond.drawDiamondEnhanced(23));
    }
}