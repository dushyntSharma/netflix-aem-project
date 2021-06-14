package com.aem.netflix.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AddingComponent {
	@Inject
	String heading;

	@Inject
	String headingsmall;

	public String getHeading() {
		return heading;
	}

	public String getHeadingSmall() {
		return headingsmall;
	}

}
