package com.cbfacademy.shapes;

public class PaintShapes {
    
    public static void main(String[] args){
        Rectangle deck = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        System.out.println(deck.toString());

        Paint duluxPaint = new Paint(5);
        Paint homebasePaint = new Paint(15);

        System.out.println(duluxPaint.amount(deck));
        System.out.println(homebasePaint.amount(deck));

        double totalAmountNeeded = duluxPaint.amount(deck) + duluxPaint.amount(ball) + duluxPaint.amount(tank); 

        System.out.println(totalAmountNeeded);

    }

}
