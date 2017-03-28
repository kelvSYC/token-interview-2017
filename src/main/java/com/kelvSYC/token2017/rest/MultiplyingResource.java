package com.kelvSYC.token2017.rest;

import restx.annotations.GET;
import restx.annotations.RestxResource;
import restx.factory.Component;
import restx.security.PermitAll;

@Component @RestxResource
public class MultiplyingResource {
    @GET("/multiply")
    @PermitAll
	public String multiply(String x, String y) {
		int x1 = Integer.parseInt(x);
		int x2 = Integer.parseInt(y);
		return String.format("%d", x1 * x2);
	}
}
