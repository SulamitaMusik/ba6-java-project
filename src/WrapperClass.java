public class WrapperClass {
    public static void main(String[] args) {
//      String num="12345";
//int parsedNum=Integer.parseInt(num);
//        System.out.println(parsedNum );

        String iphonePrice="$1200.50";
        double actualPr=1200.50;
        double parsedPrice=Double.parseDouble(iphonePrice.replace("$", ""));
        if(parsedPrice==actualPr){
            System.out.println("Prices are equal");
        }


String canTravel="True";
       boolean parsedCanTravel= Boolean.parseBoolean(canTravel);
if(parsedCanTravel){
    System.out.println("yes can travel");
}else {
    System.out.println("cannot travel");
}

int num=2345;
String numStr=String.valueOf(num);
        System.out.println(numStr);
boolean canSwim=true;
String s=String.valueOf(canSwim);
        System.out.println(s);


        }
    }

