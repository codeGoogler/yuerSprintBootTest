package com.yuer.SprintBootTest.yuerSprintBootTest.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 这里简单解释下这个类里面的东西的含义：
 *
 * 首先是@RestController这个注解：用过spring的大佬估计知道是什么东西，当我们其他类要通过spring引用该类时，第一步就是要将该类注册到spring中，
 * @RestController就是相当于将这个类注册到spring容器的意思当然，还有一种比较常用的就是@Controller，具体他们两区别后面再讨论吧。
 * 然后就是@RequestMapping，通过设置这个注解里面面的path属性，就可以声明相对于项目根路径（localhost:8080）的访问路径。
 *
 *  https://www.cnblogs.com/lcplcpjava/p/7406253.html
 */

@RestController
public class HelloSpringBoot {
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }

    /**
     * url传参，访问的路径类似这样：localhost:8080/getParamDemo1/1
     * 方法体中的参数要在前面加注释，@PathVariable，代表url中的参数
     *
     *  https://www.cnblogs.com/lcplcpjava/p/7406253.html
     */
    @RequestMapping(path = {"/getParamDemo1/{id}"})
    public String getParamDemo1 (@PathVariable("id") int userId){
        System.out.println("get param " + userId);
        return "success get param";
    }
    /**
     * 当然，你也可以通过这种传参方式：localhost:8080/getParamDemo?param1=1或者直接表单提交参数
     * 当然，同时方法中参数声明的注释也要变成@RequestParam，代表请求参数，required属性说明了参数是否是必须的
     */
    @RequestMapping(path = {"/getParamDemo2"})
    public String getParamDemo2 (@RequestParam(value="param1",required = false) int param){
        System.out.println("get param " + param);
        return "success get param";
    }
}