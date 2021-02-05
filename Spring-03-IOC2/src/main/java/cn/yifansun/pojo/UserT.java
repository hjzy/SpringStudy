package cn.yifansun.pojo;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/31,18:28
 */
public class UserT {

    private String name;
    //将原本的无参构造函数变为有参构造函数
    public UserT(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+ name );
    }

}