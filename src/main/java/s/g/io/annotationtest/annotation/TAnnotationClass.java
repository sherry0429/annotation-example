package s.g.io.annotationtest.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Created by Sherr on 2018/3/7.
 */
@Target(ElementType.TYPE) // 应用于类、接口、enum、注解类型
@Retention(RetentionPolicy.RUNTIME)
public @interface TAnnotationClass {
    public String name() default "";
}


