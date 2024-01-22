package com.api.restapi.principal;

import com.api.restapi.model.DataViaCep;
import com.api.restapi.services.ConsumptionApi;
import com.api.restapi.services.ConvertData;

import java.util.Scanner;

public class Principal {

    private Scanner scanner = new Scanner(System.in);

    private ConsumptionApi consumption = new ConsumptionApi();

    private ConvertData converter = new ConvertData();

    private final String ADDRESS = "https://viacep.com.br/ws/";

    private final String API_KEY = "/json/";

    public void show() {
        System.out.println("Digite o um cep: ");
        var cep = scanner.nextLine();
        var json = consumption.getData(ADDRESS + cep + API_KEY);
        DataViaCep dataViaCep = converter.getData(json, DataViaCep.class);
        System.out.println(dataViaCep);
    }

}
