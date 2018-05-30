/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html2latex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        try {
            System.out.println("main");
            String inputFile="";
            String outputFile="";
            String[] args = {};
            Main.main(args);
            Path outputPath=Paths.get(outputFile);
            assertTrue(outputPath.toFile().exists());
            List<String> contents= Files.readAllLines(outputPath);
            assertFalse(contents.isEmpty());
        } catch (IOException ex) {
            Logger.getLogger(MainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
