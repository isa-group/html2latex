/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html2latex;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author japarejo
 */
public class SVGTest {
    @Test
    public void svgSimpleTest(){

        String content="<svg xmlns=\"http://www.w3.org/2000/svg\"  width=\"100\" height=\"100\">\n" +
                       "  <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"red\" stroke-width=\"4\" fill=\"red\" />\n" +
                        "</svg>";
        Parser parser=new Parser();
        String path="./src/test/resources/output";
        String image=path+"/Latex-OutputFolder/Image0.pdf";
        File f=new File(image);
        if(f.exists())
            f.delete();
        try {
            parser.parse(content, path);
        } catch (FatalErrorException ex) {
            Logger.getLogger(SVGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(f.exists());
        assertTrue(f.length()>0);
        
    }
    
    @Test
    public void svgComplexText(){
        String content="<svg version=\"1.1\" class=\"highcharts-root\" style=\"font-family:&quot;Lucida Grande&quot;, &quot;Lucida Sans Unicode&quot;, Arial, Helvetica, sans-serif;font-size:12px;\" xmlns=\"http://www.w3.org/2000/svg\" width=\"1365\" height=\"400\" viewBox=\"0 0 1365 400\">\n" +
"    <desc>Created with Highcharts 6.1.0</desc>\n" +
"    <defs>\n" +
"        <clipPath id=\"highcharts-7nxa8g6-15\">\n" +
"            <rect x=\"0\" y=\"0\" width=\"1285\" height=\"300\" fill=\"none\"></rect>\n" +
"        </clipPath>\n" +
"    </defs>\n" +
"    <rect fill=\"#FFFFFF\" class=\"highcharts-background\" x=\"0\" y=\"0\" width=\"1365\" height=\"400\" rx=\"0\" ry=\"0\"></rect>\n" +
"    <rect fill=\"none\" class=\"highcharts-plot-background\" x=\"40\" y=\"60\" width=\"1285\" height=\"300\"></rect>\n" +
"    <g class=\"highcharts-pane-group\"></g>\n" +
"    <g class=\"highcharts-grid highcharts-xaxis-grid \">\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 120.5 60 L 120.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 246.5 60 L 246.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 373.5 60 L 373.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 499.5 60 L 499.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 625.5 60 L 625.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 751.5 60 L 751.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 877.5 60 L 877.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 1003.5 60 L 1003.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 1129.5 60 L 1129.5 360\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-grid-line\" d=\"M 1255.5 60 L 1255.5 360\" opacity=\"1\"></path>\n" +
"    </g>\n" +
"    <g class=\"highcharts-grid highcharts-yaxis-grid \">\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 360.5 L 1325 360.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 300.5 L 1325 300.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 240.5 L 1325 240.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 180.5 L 1325 180.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 120.5 L 1325 120.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 59.5 L 1325 59.5\" opacity=\"1\"></path>\n" +
"    </g>\n" +
"    <g class=\"highcharts-grid highcharts-yaxis-grid \">\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 360.5 L 1325 360.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 300.5 L 1325 300.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 240.5 L 1325 240.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 180.5 L 1325 180.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 120.5 L 1325 120.5\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" stroke=\"#e6e6e6\" stroke-width=\"1\" class=\"highcharts-grid-line\" d=\"M 40 59.5 L 1325 59.5\" opacity=\"1\"></path>\n" +
"    </g>\n" +
"    <rect fill=\"none\" class=\"highcharts-plot-border\" x=\"40\" y=\"60\" width=\"1285\" height=\"300\"></rect>\n" +
"    <g class=\"highcharts-axis highcharts-xaxis \">\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 120.5 360 L 120.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 246.5 360 L 246.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 373.5 360 L 373.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 499.5 360 L 499.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 625.5 360 L 625.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 751.5 360 L 751.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 877.5 360 L 877.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 1003.5 360 L 1003.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 1129.5 360 L 1129.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-tick\" stroke=\"#ccc\" stroke-width=\"1\" d=\"M 1255.5 360 L 1255.5 370\" opacity=\"1\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-axis-line\" stroke=\"#999\" stroke-width=\"1\" d=\"M 40 360.5 L 1325 360.5\"></path>\n" +
"    </g>\n" +
"    <g class=\"highcharts-axis highcharts-yaxis \">\n" +
"        <path fill=\"none\" class=\"highcharts-axis-line\" d=\"M 40 60 L 40 360\"></path>\n" +
"    </g>\n" +
"    <g class=\"highcharts-axis highcharts-yaxis \">\n" +
"        <text x=\"1351\" text-anchor=\"start\" transform=\"translate(0,0)\" class=\"highcharts-axis-title\" style=\"color:#969696;font-size:11pt;fill:#969696;\" y=\"60\">\n" +
"            <tspan>Counts</tspan>\n" +
"        </text>\n" +
"        <path fill=\"none\" class=\"highcharts-axis-line\" d=\"M 1325 60 L 1325 360\"></path>\n" +
"    </g>\n" +
"    <g class=\"highcharts-series-group\">\n" +
"        <g class=\"highcharts-series highcharts-series-0 highcharts-column-series highcharts-tracker \" transform=\"translate(40,60) scale(1 1)\" clip-path=\"url(https://localhost:8181/app/editor#highcharts-7nxa8g6-15)\">\n" +
"            <rect x=\"12.5\" y=\"264.5\" width=\"137\" height=\"36\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"            <rect x=\"151.5\" y=\"24.5\" width=\"137\" height=\"276\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"            <rect x=\"290.5\" y=\"168.5\" width=\"137\" height=\"132\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"            <rect x=\"441.5\" y=\"96.5\" width=\"137\" height=\"204\" fill=\"rgb(227,227,227)\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point \"></rect>\n" +
"            <rect x=\"580.5\" y=\"216.5\" width=\"137\" height=\"84\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"            <rect x=\"718.5\" y=\"288.5\" width=\"137\" height=\"12\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"            <rect x=\"857.5\" y=\"299.5\" width=\"137\" height=\"1\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"            <rect x=\"996.5\" y=\"276.5\" width=\"137\" height=\"24\" fill=\"#e3e3e3\" stroke=\"#666\" stroke-width=\"0.5\" class=\"highcharts-point\"></rect>\n" +
"        </g>\n" +
"        <g class=\"highcharts-markers highcharts-series-0 highcharts-column-series \" transform=\"translate(40,60) scale(1 1)\" clip-path=\"none\"></g>\n" +
"    </g>\n" +
"    <g class=\"highcharts-button highcharts-contextbutton\" style=\"cursor:pointer;\" stroke-linecap=\"round\" transform=\"translate(1331,10)\">\n" +
"        <title>Chart context menu</title>\n" +
"        <rect fill=\"#ffffff\" class=\" highcharts-button-box\" x=\"0.5\" y=\"0.5\" width=\"24\" height=\"22\" rx=\"2\" ry=\"2\" stroke=\"none\" stroke-width=\"1\"></rect>\n" +
"        <path fill=\"#666666\" d=\"M 6 6.5 L 20 6.5 M 6 11.5 L 20 11.5 M 6 16.5 L 20 16.5\" class=\"highcharts-button-symbol\" stroke=\"#666666\" stroke-width=\"3\"></path>\n" +
"        <text x=\"0\" style=\"font-weight:normal;color:#333333;fill:#333333;\" y=\"12\"></text>\n" +
"    </g>\n" +
"    <text x=\"678\" text-anchor=\"middle\" class=\"highcharts-title\" style=\"color:#000000;font-size:17pt;font-weight:bold;fill:#000000;\" y=\"19\">\n" +
"        <tspan>Histogram of EffectivenessEfficiency</tspan>\n" +
"    </text>\n" +
"    <text x=\"683\" text-anchor=\"middle\" class=\"highcharts-subtitle\" style=\"color:#666666;fill:#666666;\" y=\"59\"></text>\n" +
"    <g class=\"highcharts-axis-labels highcharts-xaxis-labels \">\n" +
"        <text x=\"121.36462882096\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0</text>\n" +
"        <text x=\"247.46246504097\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.1</text>\n" +
"        <text x=\"373.56030126098\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.2</text>\n" +
"        <text x=\"499.65813748099\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.3</text>\n" +
"        <text x=\"625.755973701\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.4</text>\n" +
"        <text x=\"751.853809921\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.5</text>\n" +
"        <text x=\"877.95164614101\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.6</text>\n" +
"        <text x=\"1004.049482361\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.7</text>\n" +
"        <text x=\"1130.147318581\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.8</text>\n" +
"        <text x=\"1256.245154801\" style=\"color:#666666;cursor:default;font-size:11px;fill:#666666;\" text-anchor=\"middle\" transform=\"translate(0,0)\" y=\"379\" opacity=\"1\">0.9</text>\n" +
"    </g>\n" +
"    <g class=\"highcharts-axis-labels highcharts-yaxis-labels \">\n" +
"        <text x=\"25\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"end\" transform=\"translate(0,0)\" y=\"361\" opacity=\"1\">0</text>\n" +
"        <text x=\"25\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"end\" transform=\"translate(0,0)\" y=\"301\" opacity=\"1\">5</text>\n" +
"        <text x=\"25\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"end\" transform=\"translate(0,0)\" y=\"241\" opacity=\"1\">10</text>\n" +
"        <text x=\"25\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"end\" transform=\"translate(0,0)\" y=\"181\" opacity=\"1\">15</text>\n" +
"        <text x=\"25\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"end\" transform=\"translate(0,0)\" y=\"121\" opacity=\"1\">20</text>\n" +
"        <text x=\"0\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"end\" transform=\"translate(0,0)\" y=\"-9999\">25</text>\n" +
"    </g>\n" +
"    <g class=\"highcharts-axis-labels highcharts-yaxis-labels \">\n" +
"        <text x=\"0\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"start\" transform=\"translate(0,0)\" y=\"-9999\">0</text>\n" +
"        <text x=\"1340\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"start\" transform=\"translate(0,0)\" y=\"301\" opacity=\"1\">5</text>\n" +
"        <text x=\"1340\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"start\" transform=\"translate(0,0)\" y=\"241\" opacity=\"1\">10</text>\n" +
"        <text x=\"1340\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"start\" transform=\"translate(0,0)\" y=\"181\" opacity=\"1\">15</text>\n" +
"        <text x=\"1340\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"start\" transform=\"translate(0,0)\" y=\"121\" opacity=\"1\">20</text>\n" +
"        <text x=\"0\" style=\"color:#969696;cursor:default;font-size:11pt;fill:#969696;\" text-anchor=\"start\" transform=\"translate(0,0)\" y=\"-9999\">25</text>\n" +
"    </g>\n" +
"    <text x=\"1355\" class=\"highcharts-credits\" text-anchor=\"end\" style=\"cursor:pointer;color:#999999;font-size:9px;fill:#999999;\" y=\"395\">Highcharts.com</text>\n" +
"    <g class=\"highcharts-label highcharts-tooltip highcharts-color-undefined\" style=\"cursor:default;pointer-events:none;white-space:nowrap;\" transform=\"translate(453,-9999)\" opacity=\"0\" visibility=\"visible\">\n" +
"        <path fill=\"none\" class=\"highcharts-label-box highcharts-tooltip-box\" d=\"M 3.5 0.5 L 193.5 0.5 C 196.5 0.5 196.5 0.5 196.5 3.5 L 196.5 44.5 C 196.5 47.5 196.5 47.5 193.5 47.5 L 103.5 47.5 97.5 53.5 91.5 47.5 3.5 47.5 C 0.5 47.5 0.5 47.5 0.5 44.5 L 0.5 3.5 C 0.5 0.5 0.5 0.5 3.5 0.5\" isShadow=\"true\" stroke=\"#000000\" stroke-opacity=\"0.049999999999999996\" stroke-width=\"5\" transform=\"translate(1, 1)\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-label-box highcharts-tooltip-box\" d=\"M 3.5 0.5 L 193.5 0.5 C 196.5 0.5 196.5 0.5 196.5 3.5 L 196.5 44.5 C 196.5 47.5 196.5 47.5 193.5 47.5 L 103.5 47.5 97.5 53.5 91.5 47.5 3.5 47.5 C 0.5 47.5 0.5 47.5 0.5 44.5 L 0.5 3.5 C 0.5 0.5 0.5 0.5 3.5 0.5\" isShadow=\"true\" stroke=\"#000000\" stroke-opacity=\"0.09999999999999999\" stroke-width=\"3\" transform=\"translate(1, 1)\"></path>\n" +
"        <path fill=\"none\" class=\"highcharts-label-box highcharts-tooltip-box\" d=\"M 3.5 0.5 L 193.5 0.5 C 196.5 0.5 196.5 0.5 196.5 3.5 L 196.5 44.5 C 196.5 47.5 196.5 47.5 193.5 47.5 L 103.5 47.5 97.5 53.5 91.5 47.5 3.5 47.5 C 0.5 47.5 0.5 47.5 0.5 44.5 L 0.5 3.5 C 0.5 0.5 0.5 0.5 3.5 0.5\" isShadow=\"true\" stroke=\"#000000\" stroke-opacity=\"0.15\" stroke-width=\"1\" transform=\"translate(1, 1)\"></path>\n" +
"        <path fill=\"rgba(247,247,247,0.85)\" class=\"highcharts-label-box highcharts-tooltip-box\" d=\"M 3.5 0.5 L 193.5 0.5 C 196.5 0.5 196.5 0.5 196.5 3.5 L 196.5 44.5 C 196.5 47.5 196.5 47.5 193.5 47.5 L 103.5 47.5 97.5 53.5 91.5 47.5 3.5 47.5 C 0.5 47.5 0.5 47.5 0.5 44.5 L 0.5 3.5 C 0.5 0.5 0.5 0.5 3.5 0.5\" stroke=\"#e3e3e3\" stroke-width=\"1\"></path>\n" +
"        <text x=\"8\" style=\"font-size:12px;color:#333333;fill:#333333;\" y=\"20\">\n" +
"            <tspan style=\"font-size: 10px\">0.34</tspan>\n" +
"            <tspan style=\"fill:#e3e3e3\" x=\"8\" dy=\"15\">?</tspan>\n" +
"            <tspan dx=\"0\"> EffectivenessEfficiency: </tspan>\n" +
"            <tspan style=\"font-weight:bold\" dx=\"0\">17.0</tspan>\n" +
"        </text>\n" +
"    </g>\n" +
"</svg>";        
        Parser parser=new Parser();
        String path="./src/test/resources/output";
        String image=path+"/Latex-OutputFolder/Image0.pdf";
        File f=new File(image);
        if(f.exists())
            f.delete();
        try {
            parser.parse(content, path);
        } catch (FatalErrorException ex) {
            Logger.getLogger(SVGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(f.exists());
    }
}
