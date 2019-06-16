package com.corebanking.controller;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.corebanking.service.CricketService;
import com.corebanking.service.DrinksService;

@Path("/cricket")
@Singleton
public class CricketController {

	@Inject
	private CricketService cricketService;
	@Inject
	private DrinksService drinksService;
//	@Inject
//    public CricketController(CricketService cricketService) {
//        this.cricketService = cricketService;
//    }
	
	int count = 0;
	//private CricketService cricketService= new CricketService();
	
	@GET
	@Path("/{country}")
	public String getCricket(@PathParam("country") String countryName) {
		cricketService.hitFour();
		drinksService.getCoolDrinks();
		System.out.println("country "+countryName);
		System.out.println(countryName);
		System.out.println("count "+count);
		count++;
		return "cricket only1227";
	}
}
