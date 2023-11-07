package com.cbfacademy.shapes; 

public interface Enclosure {
    double calculateArea(); 

    default double calculatePerimeter(double[] sides){
        double perimeter = 0; 
        for(double side : sides){
            perimeter = perimeter + side; 
        }

        return perimeter; 

    }
}
