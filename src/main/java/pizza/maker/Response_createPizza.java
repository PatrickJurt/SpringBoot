package pizza.maker;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response_createPizza {
    @JsonProperty("pizza_description")
    public String pizza_description;
    @JsonProperty("pizza_cost")
    public double pizza_cost;
}