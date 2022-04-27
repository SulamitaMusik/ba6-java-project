package Encapsulation;

import java.util.Arrays;

public class ChocolateBar {
    private final String brandName="TechChocos";
   private float netWeight;
    private final String manufacturedIN="123 Chocolate Drive, Mclean, VA, 22102";
    private final String  manufacturedBY="Techcenture Chocos Inc";
    private long barCode;
    private String bestBefore;
    private String directions= "After looking, smelling, and snapping, place the chocolate in your mouth";
    private double unitPrice;
    private  int keepCool;
    private int totalFat;
    private int cholesterol;
    private  int  sodium;
    private int  vitaminD;
    private  int calcium;
    private  int  totalCarbohydrates;
    private  int numberOfCalories;
    private  int totalSugar;
    private  int  protein;
    private int servingSize;

    public ChocolateBar() {

    }

    public ChocolateBar( float netWeight,  long barCode, String bestBefore,
                         double unitPrice, int keepCool) {

        this.netWeight = netWeight;
        this.barCode = barCode;
        this.bestBefore = bestBefore;
        this.unitPrice = unitPrice;
        this.keepCool = keepCool;

        this.totalFat = (int) (1+(Math.random()*4));
        this.cholesterol = (int) ((Math.random()*3));
        this.sodium = (int) (1+(Math.random()*5));
        this.vitaminD = (int) (15+(Math.random()*25));
        this.calcium =(int) (25+(Math.random()*30));
        this.totalCarbohydrates = (int) (20+(Math.random()*150));
        this.numberOfCalories = (int) (150+(Math.random()*350));
        this.totalSugar = (int) (4+(Math.random()*20));
        this.protein = (int) (2+(Math.random()*20));
        this.servingSize = (int) (1+(Math.random()*5));
    }

public void  ingredientsAndFacts() {
    String[] ingredients = {"sugar", "cocao", "butter", "hazelnuts", "coconut"};
    String IngredStr = Arrays.toString(ingredients);
    String ingr = IngredStr.replaceAll("[\\[\\]\"]", "");
    System.out.println("INGREDIENTS: "+ingr);
    System.out.println("Manifactured by "+manufacturedBY+" "+manufacturedIN );
    System.out.println("Best before: "+bestBefore);
    System.out.println("Bar Code: "+barCode);
    System.out.println("Direction: "+directions);
    System.out.println("Unit Price : $"+unitPrice );
    System.out.println("Keep cool: "+keepCool+"F");
    System.out.println("NET WEIGHT: " + netWeight+" OZ");

}
public void types() {
    String[] types = {"Milk Hazelnut Classic", " Dark Hazelnut Classic", "OatMilk Classic", " White Chocolate Classic", " Cookie & Creme Classic"};
    String typesStr = Arrays.toString(types);
    System.out.println(typesStr.replaceAll("[\\[\\]\"]", ""));
}
    public float getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(float netWeight) {
        this.netWeight = netWeight;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(String bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getKeepCool() {
        return keepCool;
    }

    public void setKeepCool(int keepCool) {
        this.keepCool = keepCool;
    }





    public double getTotalFat() {
        return totalFat;
    }

    public void setTotalFat(int totalFat) {
        this.totalFat = totalFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public double getVitaminD() {
        return vitaminD;
    }

    public void setVitaminD(int vitaminD) {
        this.vitaminD = vitaminD;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public double getTotalCarbohydrates() {
        return totalCarbohydrates;
    }

    public void setTotalCarbohydrates(int totalCarbohydrates) {
        this.totalCarbohydrates = totalCarbohydrates;
    }

    public int getNumberOfCalories() {
        return numberOfCalories;
    }

    public void setNumberOfCalories(int numberOfCalories) {
        this.numberOfCalories = numberOfCalories;
    }

    public int getTotalSugar() {
        return totalSugar;
    }

    public void setTotalSugar(int totalSugar) {
        this.totalSugar = totalSugar;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getManufacturedIN() {
        return manufacturedIN;
    }

    public String getManufacturedBY() {
        return manufacturedBY;
    }

    @Override
    public String toString() {
        String result="            NUTRITION FACTS\n" +
                "       SERVING SIZE           "+servingSize+" \n" +
                "       CALORIES               "+numberOfCalories+ " \n" +
                "       TOTAL FAT              "+totalFat+ "%\n" +
                "       CHOLESTEROL            " +cholesterol+ "%\n" +
                "       SODIUM                 "+sodium+ "%\n" +
                "       CARBOHYDRATES          " +totalCarbohydrates+  "%\n" +
                "       PROTEIN                " +protein+  "g\n" +
                "       TOTAL SUGARS           "+totalSugar+ " g\n" +
                "       VITAMIN D              " +vitaminD+  " %\n" +
                "       CALCIUM                "  +calcium+ "%";
       return result;
    }





}
