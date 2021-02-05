package cn.yifansun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/2,21:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    //Autowired是byType的,如果找不到对应的type,就会转向byName,byName还找不到就会返回空指针错误
    //也可以手动使用@Qualifier(value="xxx")强制要求byName.
/*    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;*/
//    也可以使用@Resource,这个是先byName再byType,也可以使用@Resource(name="cat2")来规定要装配的类
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    private String str;


}
