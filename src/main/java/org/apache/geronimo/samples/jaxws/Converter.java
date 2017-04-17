package org.apache.geronimo.samples.jaxws;

import java.math.BigDecimal;

import javax.jws.WebService;

@WebService(name="ConverterPortType", 
			targetNamespace = "http://jaxws.samples.geronimo.apache.org")
public interface Converter {
	public BigDecimal dollarToRupees(BigDecimal dollars);

	public BigDecimal rupeesToEuro(BigDecimal rupees);
}