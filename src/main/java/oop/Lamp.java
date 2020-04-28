package oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Lamp {
    private String type;
    private String color;
    private String light;
    private double powerConsumption;
}
