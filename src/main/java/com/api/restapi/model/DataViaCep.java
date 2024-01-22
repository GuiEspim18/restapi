package com.api.restapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataViaCep(@JsonAlias("logradouro") String street, @JsonAlias("bairro") String neighborhood, @JsonAlias("localidade") String city, @JsonAlias("complemento") String compliment, @JsonAlias({"ddd", "number"}) String ddd) {

}
