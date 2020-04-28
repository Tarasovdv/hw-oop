package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Kettle {
    private String model;
    private double volume;
    private String color;
    private double powerConsumption;
}
