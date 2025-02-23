package complex;

import example.complex.ComplexOuterClass;

import java.util.Arrays;

public class ComplexMain {
    // intiate a dummy message
    private static ComplexOuterClass.Dummy newDummy(int id, String name) {
        return ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }
    public static void main(String[] args) {
        ComplexOuterClass.Complex message = ComplexOuterClass.Complex.newBuilder()
                .setOneDummy(newDummy(55, "dummy 1"))
                .addAllDummies(
                        Arrays.asList(newDummy(56, "dummy 2"),
                                newDummy(57, "dummy 3"),
                                newDummy(58, "dummy 4"))
                )
                .build();
        System.out.println(message);
    }
}
