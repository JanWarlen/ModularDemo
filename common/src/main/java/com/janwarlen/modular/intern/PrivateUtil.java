package com.janwarlen.modular.intern;

public class PrivateUtil {

    public static void access() {
        System.out.println("this is private class.");
        // 需要指明文件路径，否则异常
        /*InputStream in = new FileInputStream("");
        try (in) {

        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
