
package com.mycompany.readingxml;

import java.io.IOException;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXML {
    public static void main(String[] args) {
        Document dom; // Store the XML documenet here 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {

            // DocumentBuilder object ot parse XML documents 
            DocumentBuilder docBuilder = factory.newDocumentBuilder();
            dom = docBuilder.parse("cars.xml");
            
            // Now, print out all of Jane's cars...
            Element doc = dom.getDocumentElement();

            //Acquire both Billy's and Jane's - all the owner elements first
            NodeList ownersList = doc.getElementsByTagName("owner");

            for(int i = 0; i < ownersList.getLength(); i++) {
                Element owner = (Element)ownersList.item(i);

                if(owner.getAttribute("name").equals("Jane")) {
                    NodeList carsList = owner.getElementsByTagName("car");

                    PrintCars(carsList);
                }
            }
            
        }
        catch (ParserConfigurationException pce) {
            // Handle configuration issues with the XML parser
            System.out.println("Parser Configuration Error: " + pce.getMessage());
        } 
        catch (SAXException se) {
            // Handle XML parsing errors
            System.out.println("XML Parsing Error " + se.getMessage());
        } 
        catch (IOException ioe) {
            // Handle I/O errrors, such as file not found 
            System.err.println("I/O Error: " + ioe.getMessage());
        }
    }

    public static void(NodeList cars) {
        for (int i = 0; i < cars.getLength(); i++) {
            Element car = (Element)carsList.item(i);
        }
    }
}
