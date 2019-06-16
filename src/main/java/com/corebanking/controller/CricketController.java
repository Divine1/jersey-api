package com.corebanking.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.process.internal.RequestScoped;

import com.corebanking.service.CricketService;

@Path("cricket")
@ApplicationScoped
public class CricketController {

	@Inject
	private CricketService cricketService;
	//private CricketService cricketService= new CricketService();
	
	@GET
	public String getCricket() {
		cricketService.hitFour();
		return "cricket only1";
	}
}
