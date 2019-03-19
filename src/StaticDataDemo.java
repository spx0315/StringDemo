import static java.lang.Integer.toHexString;
import static java.lang.Integer.toOctalString;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.toBinaryString;

public class StaticDataDemo {
    /*
    Java 提供两种不同的类型：引用类型和原始类型（或内置类型）。Int是java的原始数据类型，Integer是java为int提供的封装类。Java为每个原始类型提供了封装类。
    原始类型封装类
    boolean Boolean
    char Character
    byte Byte
    short Short
    int Integer
    long Long
    float Float
    double Double
    引用类型和原始类型的行为完全不同，并且它们具有不同的语义。引用类型和原始类型具有不同的特征和用法，它们包括：
    大小和速度问题，这种类型以哪种类型的数据结构存储，当引用类型和原始类型用作某个类的实例数据时所指定的缺省值。
    对象引用实例变量的缺省值为 null，而原始类型实例变量的缺省值与它们的类型有关。

    Integer是int的封装类，里面有很多进行处理的静态方法
    Integer是对象而int不是，内存的分配位置也不一样

    int是一种基本数据类型，而Integer是相应于int的类类型，称为对象包装。
    实现这种对象包装的目的主要是因为类能够提供必要的方法，用于实现基本数据类型的数值与可打印字符串之间的转换，以及一些其他的实用程序方法；
    另外，有些数据结构库类只能操作对象，而不支持基本数据类型的变量，包装类提供一种便利的方式，能够把基本数据类型转换成等价的对象，从而可以利用数据结构库类进行处理。
     */
    public static void main(String[] args) {
        Integer integer1 = new Integer("12");
        Integer integer2 = new Integer(30);
        Integer integer3 = new Integer(222);
        Integer integer4 = 30;
        Integer integer5 = 30;
        Integer integer6 = 222;
        Integer integer7 = 222;
        int integer8 = 30;
        int integer9 = 222;

        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer2==integer4);
        System.out.println(integer6==integer3);
        System.out.println(integer4==integer5);
        System.out.println(integer6==integer7);
        System.out.println(integer4==integer8);
        System.out.println(integer7==integer9);

        //方法

        System.out.println("比较大小（数值）");
        System.out.println(integer6.compareTo(integer7));//返回int型
        System.out.println(integer6.byteValue());
        System.out.println(integer6.floatValue());
        System.out.println(integer6.doubleValue());
        System.out.println(integer6.equals(integer7));
        System.out.println(integer6.hashCode());
        System.out.println(valueOf("13"));
        System.out.println(integer4.toString());
        System.out.println(toBinaryString(20));
        System.out.println(toOctalString(20));
        System.out.println(toHexString(20));
    }
}
