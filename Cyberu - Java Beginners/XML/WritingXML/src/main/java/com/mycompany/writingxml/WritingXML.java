
package com.mycompany.writingxml;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class WritingXML {
    public static void main(String[] args) {

        // Define a File object representing the XML file, "cars.xml"
        File xmlFile = new File("cars.xml");

        // Load the XML document and store it in dom
        Document dom = LoadXMLDocument(xmlFile);   
        
        // Retrieve a list of all elements with the tag name "owner"
        NodeList owners = dom.getElementsByTagName("owner");

        // Loop through each "owner" element
        for(int i = 0; i < owners.getLength(); i++)
        {
            // Get the current "owner" element
            Element owner = (Element)owners.item(i);

            // Set the "name" attribute to the "owner" element to "Mike"
            owner.setAttribute("name", "Mike");
        }


        // Write the modified XML document back to the same file
        WriteXMLDocument(dom, xmlFile);
    }
    
    // Method to write the XML document back to the file
    private static void WriteXMLDocument(Document doc, File destination)
    {
        try{
            // Write doc to destination file here...
            TransformerFactory tf = TransformerFactory.newInstance();

            Transformer transformer = tf.newTransformer();

            StreamResult result = new StreamResult(destination);

            DomSource source = new DomSource(doc);

            transformer.transform(source, result);



        }
        catch(TransformerConfigurationException e)
        {
            System.err.println("XML writing failed.");
        }
        catch(TransformerException e)
        {
            System.err.println("XML writing failed.");
        }
    }
    
    // Method to load the XML document from a file
    private static Document LoadXMLDocument(File source)
    {
        Document dom = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try {
            //DocumentBuilder to parse XML file
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file and store the resulting document in dom
            dom = builder.parse(source);
        }
        catch (ParserConfigurationException e) {
             System.err.println("XML loading failed.");
        } 
        catch (SAXException e) {
             System.err.println("XML loading failed.");
        } 
        catch (IOException e) {
            System.err.println("XML loading failed.");
        }
        
        return dom;
    }
}

