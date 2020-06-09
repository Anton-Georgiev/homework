package inf.informatics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Machine[] machines = {new Machine(15, 25, "Blue", new Person("Qskata")), new Machine(35, 2, "Blue", new Person("Misho"))};

        print(machines);


        HeatManager[]managers={new HeatManager(List.of(new HeatEngine(5, 85.2), new HeatEngine(500, 2000)),
                List.of(new WrapperEngine(167), new WrapperEngine(232))),
                new HeatManager(List.of(new HeatEngine(13123, 42.138), new HeatEngine(497616, 38489)),
                        List.of(new WrapperEngine(78615), new WrapperEngine(64684)))};


        print(managers);
    }


    private static void print(Printer[]data){
        for (Printer m : data) {
            m.print();
        }
    }
}
