import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        /**String**/
        //构造方法
        String s1 = new String("dsytql");
        String s2 = "lbwNB";
        String s3 =  new String();//空字符串
        String s4 = "dsytql";
        String s5 = "dsytql";
        String s6 = new String("dsytql");
        String s7 = "lbwnb";
        String s8 = "  tql,dsy,ddw!  ";
        //直接比较
        System.out.println(s1 == s4);
        //不同对象（String本质是类）
        System.out.println(s4 == s5);
        //当用String string="...";方法创建时，创建的是常量字符串。如多个String的值相同，则只创建一个对象。
        System.out.println(s6 == s1);
        //同s1，s4的比较
        System.out.println(s1.equals(s6));
        //单纯比较字符串是否相等请用equals
        System.out.println(s1.compareTo(s6));
        //返回int值比较字符串大小
        System.out.println(s2.compareTo(s7));
        System.out.println(s2.compareToIgnoreCase(s7));
        //无视大小写
        System.out.println(s1.length());
        //长度
        System.out.println(s2.indexOf('w'));
        //查找char第一次出现的位置
        System.out.println(s2.indexOf("NB"));
        //查找String第一次出现的位置
        System.out.println(s2.charAt(4));
        //返回指定索引位置的char值
        System.out.println(s2.codePointAt(4));
        //返回索引位置的ASCII码值
        s1.concat(s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1);
        //字符串连接
        System.out.println(s1.contains("dsy"));
        //查找是否存在
        System.out.println(s2.contentEquals("lbw"));
        System.out.println(s2.contentEquals("lbwNB"));
        //指定的比较
        s6 = s6 + ",ddw";
        System.out.println(s6);
        System.out.println(s6.lastIndexOf('d'));
        //查找最后出现的char位置
        System.out.println(s6.lastIndexOf("dd"));
        //查找最后出现的String位置
        System.out.println(s6.substring(3));
        System.out.println(s6.substring(3,6));
        //获取从（beginIndex,endIndex]的字符串
        System.out.println(s8 + "!!");
        System.out.println(s8.trim() + "!!");
        //去除前后空格
        System.out.println(s8.toUpperCase());
        //转大写
        System.out.println(s8);
        //本身不改变
        System.out.println(s2.toLowerCase());
        //转小写
        String[] str = s8.split(",");
        System.out.println(Arrays.toString(str));
        //分割字符串数组
        byte[] str2 = s8.getBytes();
        System.out.println(Arrays.toString(str2));
        //转为byte数组。
        System.out.println(s2.endsWith("NB"));
        //判断以指定String结尾
        System.out.println(s2.startsWith("dsy"));
        //判断以指定String开始
        System.out.println(s3.isEmpty());
        //判断是否为空（length==0）
        System.out.println(s2.intern());
        //???返回字符串对象的规范化表示形式
    }
}
