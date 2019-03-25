package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by castilloespinolar on 25.03.2019.
 */
@ApplicationScoped
public class GreetingService {

	public String greeting(String name) {
		return "hello " + name;
	}

}
