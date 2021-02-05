package cn.yifansun.pojo;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/31,17:46
 */
public class User {
    private String name;

    public User() {
        System.out.println("user无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+ name );
    }
}
