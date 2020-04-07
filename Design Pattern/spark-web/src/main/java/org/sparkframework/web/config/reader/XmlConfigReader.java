package org.sparkframework.web.config.reader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.sparkframework.web.config.SparkConfig;
import org.sparkframework.web.exception.SparkConfigException;

public class XmlConfigReader {

	public SparkConfig readConfig(String location) {
		JAXBElement<SparkConfig> jElement = null;
		SchemaFactory schemaFactory = null;
		Schema schema = null;
		SparkConfig sparkConfig = null;
		Unmarshaller unmarshaller = null;
		JAXBContext jContext = null;

		try {
			/*
			 * schemaFactory =
			 * SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); schema =
			 * schemaFactory.newSchema( new
			 * File(this.getClass().getClassLoader().getResource("/META-INF").getPath() +
			 * "/spark-config.xsd"));
			 */
			jContext = JAXBContext.newInstance("org.sparkframework.web.config");

			unmarshaller = jContext.createUnmarshaller();
			//unmarshaller.setSchema(schema);
			jElement = (JAXBElement<SparkConfig>) unmarshaller.unmarshal(new File(location));
			sparkConfig = jElement.getValue();
		} catch (JAXBException e) {
			throw new SparkConfigException("failed reading config file", e);
		}

		return sparkConfig;
	}

}
