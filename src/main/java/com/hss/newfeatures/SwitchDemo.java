package com.hss.newfeatures;

/**
 * <p>
 *
 * </p>
 *
 * @author Hss
 * @date 2026-07-12
 */
public class SwitchDemo {

    /**
     * 获取用户别名
     */
    private void getUserAlias_V8(){
        String name = "马尔扎哈";
        String alias;
        switch (name){
            case "马尔扎哈":
                alias = "蚂蚱";
                break;
            case "虚空掠夺者":
                alias = "螳螂";
                break;
            default:
                alias = "未知";
                break;
        }
        System.out.println("alias: " + alias);
    }

    /**
     * 获取用户别名
     */
    private void getUserAlias_V12(){
        var name = "马尔扎哈";
        String alias = switch (name){
            case "马尔扎哈" -> "蚂蚱";
            case "虚空掠夺者" -> "螳螂";
            default -> "未知";
        };
        System.out.println("alias: " + alias);
    }

    /**
     * 获取用户国籍
     */
    private void getUserCountry_V17(){
        var name = "盖伦";
        String country = switch (name){
            case "盖伦","赵信" -> "德玛西亚";
            case "德莱文","卡特琳娜" -> "洛克萨斯";
            case "狗熊","凤凰","喜羊羊" -> {
                System.out.println("弗雷尔卓德");
                yield "弗雷尔卓德";
            }
            default -> "未知";
        };
        System.out.println("country: " + country);
    }

    /**
     * 根据类型匹配
     * JDK 17 中的模式匹配 switch 是预览特性，不建议直接用于生产环境
     * @param o
     * @return
     */
    /*private String patternMatchSwitch_V17(Object o){
        return switch (o) {
            case null -> "o is null";
            case Integer i -> String.format("Integer i : %d", i);
            case Long l -> String.format("Long i : %d", l);
            case Double d -> String.format("Double i : %d", d);
            case String i -> String.format("String i : %s", i);
            default -> o.toString();
        };
    }*/

    /**
     * 主类
     * @param args
     */
    public static void main(String[] args) {
        SwitchDemo sd = new SwitchDemo();
        //sd.getUserAlias_V8();
        //sd.getUserAlias_V12();
        sd.getUserCountry_V17();

        /*Object o = null;
        System.out.println(sd.patternMatchSwitch_V17(o));*/
    }
}
