/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpleexcel.bkp;

import org.apache.poi.xssf.model.SharedStringsTable;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTRst;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class SheetHandler_old extends DefaultHandler {

    private SharedStringsTable sst;
    private String lastContents;
    private boolean nextIsString;

    SheetHandler_old(SharedStringsTable sst) {
        this.sst = sst;
    }

    public void startElement(String uri, String localName, String name,
            Attributes attributes) throws SAXException {
    	if(name.equals("worksheet")) {
    		//System.out.println(attributes.getValue("ref"));
    	}
    	
    	//reads row
        if(name.equals("row")) {
        	String rowString = attributes.getValue("r");
        	//System.out.println();
        }
        
      //reads column
/*        if(name.equals("col")) {
        	String rowString = attributes.getValue("r");
        	System.out.println(attributes.getValue("min"));
        }
        */
        
    	//read cell
        if(name.equals("c")) {
            System.out.print(attributes.getValue("r") + " - ");
            String cellType = attributes.getValue("t");
            if(cellType != null && cellType.equals("s")) {
                nextIsString = true;
            } else {
                nextIsString = false;
            }
        }
        
        // Clear contents cache
        lastContents = "";
        
       /* System.out.println(name);
        for(int i = 0 ; i<attributes.getLength(); i++) {
        	System.out.print(attributes.getQName(0)+ " , ");
        	
        }
        */
        //System.out.println();
    }

    public void endElement(String uri, String localName, String name)
            throws SAXException {
        // Process the last contents as required.
        // Do now, as characters() may be called more than once
        if(nextIsString) {
            int idx = Integer.parseInt(lastContents);
            lastContents = new XSSFRichTextString(sst.getEntryAt(idx)).toString();
            CTRst a = sst.getEntryAt(idx);
            nextIsString = false;
        }

        // v => contents of a cell
        // Output after we've seen the string contents
        if(name.equals("v")) {
            System.out.println(lastContents);
        }
    }

    public void characters(char[] ch, int start, int length)
            throws SAXException {
        lastContents += new String(ch, start, length);
    }

}
