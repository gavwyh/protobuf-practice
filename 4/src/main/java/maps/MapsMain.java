package maps;

import example.maps.Maps;

import java.util.Map;

public class MapsMain {

    private static Maps.IdWrapper newIdWrapper(int id) {
        return Maps.IdWrapper.newBuilder().setId(id).build();
    }
    public static void main(String[] args) {
        Maps.MapExample message = Maps.MapExample.newBuilder()
                .putIds("myid", newIdWrapper(41))
                .putAllIds(Map.of("myid2", newIdWrapper(42),
                        "myid3", newIdWrapper(43))
                )
                .build();
        System.out.println(message);
    }
}
