package com.corebanking;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.corebanking.controller.CricketController;
import com.corebanking.service.CricketService;



@ApplicationPath("sports")
public class Myapplication extends ResourceConfig {

//	@Override
//	public Set<Class<?>> getClasses() {
//		Set<Class<?>> classList = new HashSet<Class<?>>();
//		classList.add(CricketController.class);
//		return classList;
//	}
	public Myapplication() {
        register(CricketController.class);
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bindAsContract(CricketService.class);
            }
        });
    }
}
