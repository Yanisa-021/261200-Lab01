public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(0.0, 0.0);
        turtle.speed(15);

        //  Draw the temple body
        turtle.penColor("mediumaquamarine");
        turtle.setDirection(0);               // Set direction to right (0 degrees)
        turtle.forward(100);                  //  Move forward 100 units
        turtle.right(90);                     //  Turn right 90 degrees
        turtle.forward(70);                   //  Move forward 70 units
        turtle.right(90);                     //  Turn right 90 degrees
        turtle.forward(100);                  //  Move forward 100 units
        turtle.right(90);                     //  Turn right 90 degrees
        turtle.forward(70);                   // Move forward 70 units

        // Draw the roof
        turtle.penColor("palegoldenrod");
        turtle.right(45);                     //Turn right 45 degrees
        turtle.forward(70);                   // Move forward 70 units
        turtle.right(90);                     // Turn right 90 degrees
        turtle.forward(70);                   // Move forward 70 units

        // Return to center point
        turtle.penColor("white");
        turtle.right(200);
        turtle.forward(70);
        turtle.right(60);
        turtle.forward(50);

        // Draw line extending from right side of temple
        turtle.penColor("white");
        turtle.setDirection(0);               // Set direction to right (0 degrees)
        turtle.forward(10);                   //  Move forward 10 units

        //  Return to center while drawing
        turtle.backward(100);                 //  Move backward 100 units

        //  Draw sun rays from center point
        turtle.penColor("salmon");
        for(int i=0; i<30; i++) {             //  Loop 30 times
            turtle.setDirection(i*30);        //  Set direction rotating around center
            turtle.forward(80);
            turtle.backward(80);               //  Return to center point
        }
    }
}

// วัดเเละพลุdiy