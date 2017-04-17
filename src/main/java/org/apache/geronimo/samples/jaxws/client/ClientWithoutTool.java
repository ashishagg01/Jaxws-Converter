package org.apache.geronimo.samples.jaxws.client;
 
import java.math.BigDecimal;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.apache.geronimo.samples.jaxws.Converter;
 
public class ClientWithoutTool{
 
	public static void main(String[] args) throws Exception {
 
	//URL url = new URL("http://localhost:9999/ws/hello?wsdl");
	//http://localhost:8080/Jaxws-Converter/converter?wsdl
		URL url = new URL("http://localhost:8080/Jaxws-Converter/converter?wsdl");
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://jaxws.samples.geronimo.apache.org", "Converter");
 
        Service service = Service.create(url, qname);
 
        Converter hello = service.getPort(Converter.class);
 
        System.out.println(hello.dollarToRupees(new BigDecimal(1)));
 
    }
 
}