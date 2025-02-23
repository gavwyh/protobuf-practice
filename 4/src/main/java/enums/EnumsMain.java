package enums;

import example.enumerations.EnumsOuterClass;

public class EnumsMain {

    public static void main(String[] args) {
        EnumsOuterClass.Enums message = EnumsOuterClass.Enums.newBuilder()
                .setEyeColor(EnumsOuterClass.EyeColor.BROWN)
                .build();
        System.out.println(message);
    }
}
