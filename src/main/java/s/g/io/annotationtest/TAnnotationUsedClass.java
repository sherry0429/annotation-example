package s.g.io.annotationtest;

import s.g.io.annotationtest.annotation.TAnnotationClass;
import s.g.io.annotationtest.annotation.TAnnotationField;

/**
 * Created by Sherr on 2018/3/8.
 */
@TAnnotationClass(name = "sherry")
public class TAnnotationUsedClass {
    @TAnnotationField(field_annotation = "haha")
    static int member;
}
