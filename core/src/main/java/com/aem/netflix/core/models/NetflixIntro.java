package com.aem.netflix.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NetflixIntro {

	@Inject
	String heading;

	@Inject
	String headingsmall;

	@Inject
	String headingsmaller;

	@Inject
	String fileReference;

	public String getHeading() {
		return heading;
	}

	public String getHeadingSmall() {
		return headingsmall;
	}

	public String getHeadingSmaller() {
		return headingsmaller;
	}

	public String getFileReference() {
		return fileReference;
	}

}
