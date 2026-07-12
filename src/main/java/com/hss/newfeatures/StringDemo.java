package com.hss.newfeatures;

/**
 * <p>
 *
 * </p>
 *
 * @author Hss
 * @date 2026-07-12
 */
public class StringDemo {

    /**
     * 获取json字符串
     */
    private void getJsonStr_V8(){
        String jsonStr = "{\n" +
                "    \"name\": \"hss\",\n" +
                "    \"sex\": \"未知\"\n" +
                "}";
        System.out.println(jsonStr);
    }

    /**
     * 获取json字符串
     */
    private void getJsonStr_V15(){
        String jsonStr = """
                {
                    "name": "hss",
                    "sex": "未知"
                }
                """;
        System.out.println(jsonStr);
    }

    /**
     * 获取json字符串
     * \ :置于行尾，用来将两行连接为一行
     * \s :单个空白字符
     */
    private void getJsonStr_V17(){
        String jsonStr = """
                {\
                    "name": "hss",\s
                    "sex": "%s"
                }
                """;
        System.out.println(String.format(jsonStr,"男"));
    }

    /**
     * 主类
     * @param args
     */
    public static void main(String[] args) {
        StringDemo demo = new StringDemo();
        //demo.getJsonStr_V8();
        //demo.getJsonStr_V15();
        demo.getJsonStr_V17();
    }
}
