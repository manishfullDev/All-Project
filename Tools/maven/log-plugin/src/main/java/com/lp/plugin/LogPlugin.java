package com.lp.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "log")
@Execute(goal = "log")
public class LogPlugin extends AbstractMojo {
	@Parameter(alias = "message", required = true)
	public String message;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		super.getLog().info("log plugin running... with message : " + message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
