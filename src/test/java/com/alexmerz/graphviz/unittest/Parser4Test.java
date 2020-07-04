
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

import com.alexmerz.graphviz.ParseException;
import com.alexmerz.graphviz.Parser;
import com.alexmerz.graphviz.objects.Graph;
import junit.framework.TestCase;

import java.io.*;
import java.util.ArrayList;

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
public class Parser4Test extends TestCase {

	public void testXDot() throws ParseException {
        Reader in=null;
        try {
            InputStream inputStream = this.getClass().getClassLoader()
                    .getResourceAsStream("testfiles/xdot.viz");
            in = new InputStreamReader(inputStream);
            Parser p = new Parser(in);            
            assertTrue(p.parse(in));
            ArrayList<Graph> graphs = p.getGraphs();
            graphs = null;

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }               
	}
	
}
