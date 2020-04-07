package com.dps.annon;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/*@Component
@DependsOn("rocket")*/
public class LaunchPad {

	public LaunchPad() {
		System.out.println("launchPad()");
	}

}
