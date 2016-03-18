import exception.NonPositiveNumberException;

/*
Job of the class
-All operations related to square behaviours dependent on side .
*/
public class Square extends Rectangle{

    private Square(double side) {
        super(side,side);
    }

    public static Square createSquare(double side) throws NonPositiveNumberException {
        if(side <= 0){
            throw new NonPositiveNumberException("Expected positive value for square side but found "+side);
        }
        return new Square(side);
    }
}
