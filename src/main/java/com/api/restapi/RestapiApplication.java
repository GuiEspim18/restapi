package com.api.restapi;

import com.api.restapi.model.DataViaCep;
import com.api.restapi.services.ConsumptionApi;
import com.api.restapi.services.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumption = new ConsumptionApi();
		var json = consumption.getData("https://viacep.com.br/ws/02075040/json/");
		System.out.println(json);
		ConvertData converter = new ConvertData();
		DataViaCep data = converter.getData(json, DataViaCep.class);
		System.out.println(data);
	}

}
