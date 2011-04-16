package jp.opensquare.sandbox.cxf.jaxws.provider;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculate {
	@WebMethod
	int sum(List<Integer> values);

}