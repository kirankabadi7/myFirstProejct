
public class dataPremetiveConversion {
    public static void main(String[] args) {
        int carSpeed = 100;
        float carCC = 800.43f;
        int carCost = 50005115;
        char carGrade ='C';
        int carSeats =300;
        String carOwnerName = "Kiran Kabadi";

        System.out.println("My Widening conversion is BYTE >> SHORT & CHAR >> INT >> LONG >> FLOAT >> DOUBLE");
        System.out.println("My Narrowing conversion is BYTE < SHORT & CHAR << INT << LONG << FLOAT << DOUBLE");


        System.out.println("CONVERSION>>>>>>>>>>>>>>>>>>>>>");
        byte newCarSeats = (byte) carSeats;
        System.out.println("My new Car NUmber of seats are " + newCarSeats);
        long newCarCost = carCost;
        System.out.println("Here is my NEW Car Cost >>" + newCarCost);

        byte newCarSeatsNarrow = (byte) carSeats;
        System.out.println("THIS IS MY NARROW RESULT OF CAR SEATS >>>>> " + newCarSeatsNarrow);
    }
}
