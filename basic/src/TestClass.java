import java.util.Arrays;

public class TestClass {
    Aaa aaa = new Aaa();
    TestClass() {
        aaa.setName("1","2","3");
    }
}


class Aaa {
    void setName(String... name) {
        System.out.println(Arrays.toString(name));
        for(int i=0;i<name.length;i++) {
            System.out.println(name[i]);
        }
    }
}
