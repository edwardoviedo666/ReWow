package com.soaint.fogacoop.commons.utils.xml.builder;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;

import javax.xml.XMLConstants;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLDecoder;

public class XmlBuilder {

    private static final Logger LOGGER = LogManager.getLogger(XmlBuilder.class);

    private XmlBuilder() { }

    public static String trasnformDocument(final String filePath, Document doc, String encode)
            throws TransformerException, MalformedURLException, UnsupportedEncodingException {

        LOGGER.info("EXECUTE: XmlBuilder - trasnformDocument: - Parameters - filePath: {}, doc {}, encode {}", filePath, doc, encode);

        final String DOCTYPE_SYSTEM_VALUE = "http://java.sun.com/dtd/properties.dtd";

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, DOCTYPE_SYSTEM_VALUE);
        DOMSource source = new DOMSource(doc);

        String pathFinal = filePath.concat(".metadata.properties.xml");
        File xmlMetadataFile = new File(pathFinal);
        StreamResult result = new StreamResult(xmlMetadataFile);
        String pathDestinationXml = URLDecoder.decode(xmlMetadataFile.toURI().toURL().toString(), encode);
        LOGGER.info("EXECUTE: XmlBuilder - trasnformDocument: - Generated path XML: {}", pathDestinationXml);
        pathDestinationXml = pathDestinationXml.replace("%20", " ");
        LOGGER.info("EXECUTE: XmlBuilder - trasnformDocument: - Replace ANSI characters with Spaces on Generated path XML: {}", pathDestinationXml);
        result.setSystemId(pathDestinationXml);
        transformer.transform(source, result);
        LOGGER.info("CORRECT: XmlBuilder - trasnformDocument: - XML File generated on: {}", pathDestinationXml);
        return xmlMetadataFile.getAbsolutePath();


    }
}
