package com.api.restapi.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Neighborhood(@JsonAlias("bairro") String name, @JsonAlias("localidade") String city, @JsonAlias("uf") String uf) {
}
