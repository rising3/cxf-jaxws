package jp.opensquare.sandbox.cxf.jaxws.provider;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(
		endpointInterface="jp.opensquare.sandbox.cxf.jaxws.provider.Calculate",
		serviceName="CalculateService",
		portName="CalculatePort",
		targetNamespace="http://provider.jaxws.cxf.sandbox.opensquare.jp/")
@SOAPBinding(
		style=Style.DOCUMENT,
		use=Use.LITERAL,		
		parameterStyle=ParameterStyle.BARE)
public class CalculateImpl implements Calculate {
	@Override
	@WebMethod
	public int sum(List<Integer> values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
}
