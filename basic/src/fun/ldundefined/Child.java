package fun.ldundefined;

public class Child extends extend{
    Child() {
        System.out.println("Child构造方法");
    }
    String name = "李三狗";
    public void extendMaster() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Child child1 = new Child();
        Child child2 = new Child();
        Child child3 = new Child();
        child1.extendMaster();
    }
}
