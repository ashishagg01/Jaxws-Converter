package org.apache.geronimo.samples.jaxws.publisher;

import javax.xml.ws.Endpoint;

import org.apache.geronimo.samples.jaxws.ConverterService;

public class EndPointPublisher {

	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9999/ws/hello", new ConverterService());
	    }

	
}
