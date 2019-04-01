public class TestString {
    public static void main(String[] args) {
        String a = "qwertyuiopasdfghjklzxcvbnm";
        String h = "***///   复   仇   者联盟";
        String tihuan = "aaaaaabbbbbbccccc";
        String src = " a n lk oi hu   ";
//        System.out.println("调用startWith方法：" + h.startsWith("复仇"));
//        System.out.println("调用subString方法1：" + h.substring(1));//指定开头，构造一个新的字符串
//        System.out.println("调用subString方法2：" + a.substring(2));//指定开头，构造一个新的字符串
//        System.out.println("调用concat方法：" + a.concat("rrrrrrrr"));//在已有的字符串后面添加新的字符串
//        System.out.println("调用repalce方法1：" + a.replace("r","aaaaaa"));//用新字符串替换原字符串中的相应字符串
//        System.out.println("调用repalce方法2：" + h.replace("者","史塔克"));//用新字符串替换原字符串中的相应字符串
//        System.out.println("调用repalce方法：" + tihuan.replace("a","r"));//用新字符串替换原字符串中的相应字符串
//        System.out.println("调用repalceFirst方法：" + tihuan.replaceFirst("a","r"));//用新字符串替换原字符串中的相应字符串
//        System.out.println("调用repalceAll方法1：" + a.replaceAll("r","aaaaaa"));//用新字符串替换原字符串中的相应字符串
//        System.out.println("调用repalceAll方法2：" + h.replaceAll("者","aaaaaa"));//用新字符串替换原字符串中的相应字符串
//        System.out.println("调用trim方法：" + src.trim().length());//删除字符串前后的空格
//        System.out.println("调用trim方法1：" + src.trim());//删除字符串前后的空格
//        System.out.println("调用trim方法2：" + h.trim());//删除字符串前后的空格

//        System.out.println("字符串长度为：" + a.length());
//        System.out.println("调用charAt方法：" + a.charAt(2));
//        String ha = "abcedf";
//        System.out.println("调用hashcade方法：" + ha.hashCode());
//        String shengfen = "湖北省";
//        if ("省".equals(shengfen.charAt(2))){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }

        String aa = "abc";
        String bb = "abc";
        String aaa = "123";
        String aaaa = "987";
        String bbb = "1234";
        System.out.println("调用compareTo方法1：" + aa.compareTo(bb));
        System.out.println("调用compareTo方法2：" + aaa.compareTo(bbb));    //返回-1
        System.out.println("调用compareTo方法3：" + aaa.compareTo(aaaa));
        if(aa.equals(bb)){
//            System.out.println("true");
//            System.out.println("aa的哈希码是：" + aa.hashCode());
//            System.out.println("bb的哈希码是：" + bb.hashCode());
        }else{
            System.out.println("false");
        }
    }
}
