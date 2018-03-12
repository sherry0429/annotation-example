package s.g.io.annotationtest.handler;

/**
 * Created by Sherr on 2018/3/7.
 */
import s.g.io.annotationtest.annotation.TAnnotationClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class TAnnotationHandler implements Runnable{

    @Override
    public void run() {
        // s.g.io.annotationtest.TAnnotationUsedClass
        // 使用debug调试，可以更清晰的看见获得的注解的结构
        String className = "s.g.io.annotationtest.TAnnotationUsedClass";
        Class<?> cl = null;
        try {
            cl = Class.forName("s.g.io.annotationtest.TAnnotationUsedClass");
            /* 获得一个关于类的注解实例*/
            TAnnotationClass annotation_example = cl.getAnnotation(TAnnotationClass.class);
            System.out.println(annotation_example);
            if (annotation_example == null) {
                System.out.println("No annotations in class " + className);
            }
            /* 获得所有类成员 */
            for (Field field : cl.getDeclaredFields()) {
                String columnName = null;
                /* 获得类成员的注解实例 */
                Annotation[] anns = field.getDeclaredAnnotations();
                for (Annotation ann : anns) {
                    /* 根据注解属性 进行相应操作 */
                    System.out.println(ann);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}