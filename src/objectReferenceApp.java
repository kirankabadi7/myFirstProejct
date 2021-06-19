public class objectReferenceApp {

    public static void main(String[] args) {
        Byte carDoors =4;
        Short carHorsePower =100;
        Integer carCost =14999;
        Long carRegistrationNumber =232323331221322L;
        Float carMileage = 19.4F;
        Boolean carDamaged =true;
        Character energyEfficiencyCategory = 'E';
        String carModel ="Maruti Suzuki Baleno Xs";
        String carModelNew = new String("Maruti Suzuki Baleno Xs");
        System.out.println(carDoors);
        System.out.println(carHorsePower);
        System.out.println(carCost);
        System.out.println(carRegistrationNumber);
        System.out.println(carMileage);
        System.out.println(carDamaged);
        System.out.println(energyEfficiencyCategory);
        System.out.println(carModel);
        System.out.println(carModelNew);
        System.out.println(carModel.toLowerCase());
        System.out.println(carModel.toUpperCase());
        System.out.println(carModel.charAt(3));
        System.out.println(carCost.floatValue());
        System.out.println(carMileage.intValue());
        System.out.println(carModelNew.contains("Maruti"));

    }
}
