package cn.yifansun.pojo;

import org.springframework.stereotype.Component;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/5,18:51
 */
@Component  //将这个类标注为Spring的一个组件，放到容器中！
public class Dog {
    public String name = "dog";

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}