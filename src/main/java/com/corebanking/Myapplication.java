package com.corebanking;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.corebanking.controller.CricketController;
import com.corebanking.service.CricketService;
import com.corebanking.service.DrinksService;



@ApplicationPath("sports")
public class Myapplication extends ResourceConfig {
	public Myapplication() {
        register(CricketController.class);
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindAsContract(CricketService.class);
                bindAsContract(DrinksService.class);

            }
        });
    }
}
