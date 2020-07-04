
/***************************************************************
 *    JPGD - Java-based Parser for Graphviz Documents
 *    Copyright (C) 2006  Alexander Merz
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


package com.alexmerz.graphviz.unittest;

import java.io.*;
import java.util.ArrayList;

import com.alexmerz.graphviz.objects.Graph;
import junit.framework.TestCase;

import com.alexmerz.graphviz.ParseException;
import com.alexmerz.graphviz.Parser;

/**
 * This test suite uses the Graphviz examples
 * from the Gallery on the Graphviz webpage.
 * (An exception is only NodeEdge) 
 * All files are stored in the testfiles directories.
 * 
 * @version $Id: Parser2Test.java,v 1.4 2006/03/20 16:47:49 Alexander Exp $
 * @author Alexander
 *
 */
public class Parser2Test extends TestCase {

	public void testNodeEdge() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/NodeEdge.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);            
            assertTrue(p.parse(in));  
            
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }               
	}
	
	public void testCluster() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/cluster.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));
            
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
	}   
    
    public void testCrazy() throws ParseException {
        Reader in=null;
        try {
          	InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/crazy.viz");
          	in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}
    
    public void testDatastruct() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/datastruct.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}
    
    public void testFdpclust() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/fdpclust.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}    

    public void testFSM() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/fsm.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

    public void testHello() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/hello.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}
   
    public void testInet() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/inet.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

    
       
    public void testProcess() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/process.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

    public void testProfile() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/profile.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

    public void testSdh() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/sdh.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}


    
    public void testSoftmain() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/softmain.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

    public void testSwitch() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/switch.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}    

    
    public void testTransparency() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/transparency.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

    
    public void testUnix() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/unix.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}    
    
    public void testWorld() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/world.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);
            assertTrue(p.parse(in));                
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }        
	}

}
