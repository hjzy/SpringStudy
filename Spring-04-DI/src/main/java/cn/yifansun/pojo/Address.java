package cn.yifansun.pojo;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/2,11:41
 */
public class Address {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}