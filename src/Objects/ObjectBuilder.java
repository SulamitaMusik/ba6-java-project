package Objects;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ObjectBuilder {
    public static void main(String[] args) {
        House myHouse=new House("Sulya"," 123 beach blvd",150,150,100, 2022,false,150,100,new String[]{"running","playing"});
        System.out.println(myHouse.name + " "+myHouse.address);

        House mySecHouse=new House("Sulya2","123 main street",1000,158,45,2022,false,500,250, new String[]{"running","playing"});
        System.out.println(mySecHouse.old);

        System.out.println(mySecHouse.hobbies);
        House inProject=new House();

        //*****************************************************************************************************************



    }



}
