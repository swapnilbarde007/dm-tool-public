package com.ericsson.fdp;

import com.ericsson.fdp.ui.Home;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DmToolApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DmToolApplication.class, args);
		Application.launch(Home.class,args);
	}

}
