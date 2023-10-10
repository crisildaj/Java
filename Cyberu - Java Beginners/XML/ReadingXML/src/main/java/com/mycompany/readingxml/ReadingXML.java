
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
            
            // AIM: print out all of Jane's cars

            // Get the root (outermost) element of the XML document --> <cars>
            Element doc = dom.getDocumentElement();

            //Acquire both Billy's and Jane's cars - all the owner elements first
            NodeList ownersList = doc.getElementsByTagName("owner");

            // Iterate through the list of owners
            for(int i = 0; i < ownersList.getLength(); i++) {
                Element owner = (Element)ownersList.item(i);

                // If the owner's name attribute is Jane 
                if(owner.getAttribute("name").equals("Jane")) {
                    // Get the car element
                    NodeList carsList = owner.getElementsByTagName("car");

                    // Call the PrintCars method and print out the details
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

    public static void PrintCars (NodeList cars) {
        for (int i = 0; i < cars.getLength(); i++) {
            Element carNode = (Element)cars.item(i);
            Car carObj = new Car();
            carObj.color = carNode.getElementsByTagName("color").item(0).getTextContent();
            carObj.make = carNode.getElementsByTagName("make").item(0).getTextContent();
            carObj.model = carNode.getElementsByTagName("model").item(0).getTextContent();
            carObj.year = Integer.parseInt(carNode.getElementsByTagName("year").item(0).getTextContent());
            carObj.vin = carNode.getAttribute("vin");
            System.out.println(carObj.toString());
        }
    }
}
