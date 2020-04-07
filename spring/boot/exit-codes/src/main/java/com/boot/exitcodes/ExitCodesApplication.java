package com.boot.exitcodes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.ExitCodeExceptionMapper;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

import com.boot.exitcodes.beans.Motor;
import com.boot.exitcodes.exception.UnknownFailureException;

@SpringBootApplication
public class ExitCodesApplication {
	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		ExitCodeGenerator ecg = new ExitCodeGenerator() {
			@Override
			public int getExitCode() {
				return -10;
			}
		};
		return ecg;
	}

	@Bean
	public ApplicationListener<ExitCodeEvent> exitCodeEvent() {
		return new ApplicationListener<ExitCodeEvent>() {
			@Override
			public void onApplicationEvent(ExitCodeEvent event) {
				System.out.println("event listener : " + event.getExitCode());
			}
		};
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return (args) -> {
			throw new UnknownFailureException("startup failed");
		};
	}

	@Bean
	public ExitCodeExceptionMapper exitCodeExceptionMapper() {
		return new ExitCodeExceptionMapper() {
			@Override
			public int getExitCode(Throwable exception) {
				if (exception.getCause() instanceof UnknownFailureException) {
					return -99;
				}
				return 0;
			}
		};
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ExitCodesApplication.class, args);
		try {
			Motor motor = context.getBean("motor", Motor.class);
			motor.start();
		} finally {
			System.exit(SpringApplication.exit(context));
		}

	}

}
