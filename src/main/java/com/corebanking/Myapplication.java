package com.corebanking;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.corebanking.controller.CricketController;



@ApplicationPath("sports")
public class Myapplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classList = new HashSet<Class<?>>();
		classList.add(CricketController.class);
		return classList;
	}

}
