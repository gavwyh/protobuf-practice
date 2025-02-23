package oneof;

import example.oneof.Oneof;

public class OneOfMain {

    public static void main(String[] args) {
        Oneof.Result message = Oneof.Result.newBuilder()
                .setMessage("a message")
                .build();
        System.out.println(message);

        Oneof.Result message2 = Oneof.Result.newBuilder()
                .setId(42)
                .build();
        System.out.println(message2);
    }
}
