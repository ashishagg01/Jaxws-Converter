package org.apache.geronimo.samples.jaxws;

import java.math.BigDecimal;

import javax.jws.WebService;



@WebService(serviceName = "Converter",
			portName = "ConverterPort",
			endpointInterface = "org.apache.geronimo.samples.jaxws.Converter",
			targetNamespace = "http://jaxws.samples.geronimo.apache.org")
public class ConverterService implements Converter {
	private BigDecimal rupeeRate = new BigDecimal("40.58");
	private BigDecimal euroRate = new BigDecimal("0.018368");

	public BigDecimal dollarToRupees(BigDecimal dollars) {
		BigDecimal result = dollars.multiply(rupeeRate);
		return result.setScale(2, BigDecimal.ROUND_UP);
	}

	public BigDecimal rupeesToEuro(BigDecimal rupees) {
		BigDecimal result = rupees.multiply(euroRate);
		return result.setScale(2, BigDecimal.ROUND_UP);
	}
}