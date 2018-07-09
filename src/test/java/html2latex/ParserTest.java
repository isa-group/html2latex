/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html2latex;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author japarejo
 */
public class ParserTest {
    
    public ParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of parse method, of class Parser.
     */
    @Test
    public void testParse_String() throws Exception {
        System.out.println("parse");
        String input = "<p>This is a paragraph</p><ul><li>This is an item</li></ul>";
        Parser instance = new Parser();
        String expResult =  "\n" +
                            "\n" +
                            "This is a paragraph\n" +
                            "\\begin{itemize}\n" +
                            "	\\item This is an item\n" +
                            "\\end{itemize}";
        String result = instance.parse(input,".");
        assertNotNull(result);
        assertFalse("".equals(result));
        assertEquals(expResult, result);
        
    }
    
}
