package edu.miu.ea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        MyShape obj = new MyShape();

//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyShape obj = context.getBean("myShape", MyShape.class);

        obj.printer();
    }
}
