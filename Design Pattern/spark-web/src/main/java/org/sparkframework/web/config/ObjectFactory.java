//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.15 at 07:49:53 PM IST 
//


package org.sparkframework.web.config;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.sparkframework.web.config package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SparkConfig_QNAME = new QName("http://www.sparkframework.org/web/config", "spark-config");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.sparkframework.web.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SparkConfig }
     * 
     */
    public SparkConfig createSparkConfig() {
        return new SparkConfig();
    }

    /**
     * Create an instance of {@link ActionMapping }
     * 
     */
    public ActionMapping createActionMapping() {
        return new ActionMapping();
    }

    /**
     * Create an instance of {@link Actions }
     * 
     */
    public Actions createActions() {
        return new Actions();
    }

    /**
     * Create an instance of {@link Outcome }
     * 
     */
    public Outcome createOutcome() {
        return new Outcome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SparkConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.sparkframework.org/web/config", name = "spark-config")
    public JAXBElement<SparkConfig> createSparkConfig(SparkConfig value) {
        return new JAXBElement<SparkConfig>(_SparkConfig_QNAME, SparkConfig.class, null, value);
    }

}
