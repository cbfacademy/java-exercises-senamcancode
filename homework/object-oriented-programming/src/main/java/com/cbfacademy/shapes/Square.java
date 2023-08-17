package src.main.java.com.cbfacademy.shapes;

public class Square implements Enclosure {
    private double width; 

    public Square(double width){
        this.width = width; 
    }

    @Override
    public double calculateArea(){
        return width * width; 
    }
    
}
