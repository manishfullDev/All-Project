package com.ew.runner;

import java.io.File;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Runner {
	private final static String webappDirLocation = "src/main/webapp";
	private final static String webinfClassesDirLocation = "target/classes";

	public static void main(String[] args) throws LifecycleException, ServletException {
		Tomcat tomcat = new Tomcat();
		StandardContext context = (StandardContext) tomcat.addWebapp("/",
				new File(webappDirLocation).getAbsolutePath());
		StandardRoot resource = new StandardRoot(context);

		DirResourceSet dirResourceSet = new DirResourceSet(resource, "/WEB-INF/classes/",
				new File(webinfClassesDirLocation).getAbsolutePath(), "/");
		resource.addPreResources(dirResourceSet);

		context.setResources(resource);

		tomcat.setPort(8081);
		tomcat.start();
		tomcat.getServer().await();
	}
}
