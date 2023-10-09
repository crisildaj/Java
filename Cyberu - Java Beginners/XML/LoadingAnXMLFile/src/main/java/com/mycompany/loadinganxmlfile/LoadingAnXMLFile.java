
package com.mycompany.loadinganxmlfile;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoadingAnXMLFile {
    public static void main(String[] args) {
        Document dom; // Store the XML document here
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();


        try {
            // Write code that can throw errors here...

            // DocumentBuilder object to parse XML documents - PARSING = analysing and extracting structured information from a doc
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the 'cars.xml' file and store it in the Document object 
            dom = builder.parse("cars.xml");

            // Call the PrintXmlDocument method to print the XML document
            PrintXmlDocument(dom);
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
    
    // Method to print XML document to the console
    private static void PrintXmlDocument(Document xml)
    {
        try{
            // Create a Transformer object to convert the XML document to a string
            // The TransformerFactory is a factory used to create transformers  
            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            // Result object for Transformation
            // StringWriter object = an in-memory buffer for characters - temporarily stores characters before it is written to a file 
            // StreamResult = type of result that allows you to write the transformed output to various output streams (e.g. StringWriter)
            StreamResult result = new StreamResult(new StringWriter());
            // Transformed output will be written to a StringWriter

            // Prepares source of XML data you want to transform
            DOMSource source = new DOMSource(xml);

            // Transform the XML source into a string representation
            transformer.transform(source, result); // source = input you want to transform; result = output where transformation will be written (StringWriter)

            // Print the XML string to the console
            System.out.println(result.getWriter().toString());
        }
        catch(TransformerConfigurationException e)
        {   
            // Handle transformer configuration errors
            System.err.println("XML Printing Failed");
        }
        catch(TransformerException e)
        {   
            // Handle transform errors 
            System.err.println("XML Printing Failed");
        }
    }
}
