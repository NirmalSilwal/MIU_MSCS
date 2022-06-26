package Lab1;

import java.lang.reflect.*;

import Lab1.exceptions.BeanNotFoundException;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;

public class MyInjector {

    private Map<Class, Object> container;
    private static MyInjector injector;

    private MyInjector() {
        super();
        container = new HashMap<>();
    }

    public Object getBean(Class clazz) throws BeanNotFoundException {

        if (container.containsKey(clazz)) {
            return container.get(clazz);
        }
        return new BeanNotFoundException();
    }

    public void scanForBeans() {
        // search and put in the map
        Reflections ref = new Reflections("Lab1");
        for (Class<?> cl : ref.getTypesAnnotatedWith(MyBean.class)) {
            MyBean findable = cl.getAnnotation(MyBean.class);
           container.put(findable.getClass(), );
        }
    }
}
