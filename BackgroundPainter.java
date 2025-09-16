import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

    // Paints the whole GUI, going left to right, row by row
    public void paintEverything(String color) {

        while (canMove()) {
            // Paint going across the row
            while (canMove()) {
                if (hasPaint()) {
                    paint(color);
                }
                move();
            }

            // Paint the last square in the row
            if (hasPaint()) {
                paint(color);
            }

            // At the end of the row, try to go down
            if (isFacingEast()) {
                turnRight(); // face down
                if (canMove()) {
                    move();
                    turnRight(); // now facing West
                }
            } else if (isFacingWest()) {
                turnLeft(); // face down
                if (canMove()) {
                    move();
                    turnLeft(); // now facing East
                }
            }
        }

        // Final row: paint across (no more rows below)
        // Only needed if we moved down on the last loop
        while (canMove()) {
            if (hasPaint()) {
                paint(color);
            }
            move();
        }

        // Paint last square
        if (hasPaint()) {
            paint(color);
        }
    }
}