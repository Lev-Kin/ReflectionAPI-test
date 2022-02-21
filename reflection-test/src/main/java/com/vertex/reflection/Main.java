package com.vertex.reflection;

import com.sun.org.glassfish.gmbal.Description;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class Main {

  public static void main(String[] args)
      throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
    Car car = new Car(100, "AA180A1");
    Class<? extends Car> carClass = car.getClass();

    Method logAndReturnMethod = carClass.getMethod("logAndReturn", Object.class);

    System.out.println(logAndReturnMethod.getParameterCount()); //output: 1

    Parameter[] parameters = logAndReturnMethod.getParameters();
    System.out.println(Arrays.toString(parameters)); //output: [T arg0]

    Class<?>[] parameterTypes = logAndReturnMethod.getParameterTypes();
    System.out.println(Arrays.toString(parameterTypes)); //output:  [class java.lang.Object]

    Type[] genericParameterTypes = logAndReturnMethod.getGenericParameterTypes();
    System.out.println(Arrays.toString(genericParameterTypes)); //output: [T]

    TypeVariable<Method>[] typeParameters = logAndReturnMethod.getTypeParameters();
    System.out.println(Arrays.toString(typeParameters)); //output: [T]

    Annotation[][] parameterAnnotations = logAndReturnMethod.getParameterAnnotations();
    System.out.println(Arrays.deepToString(parameterAnnotations)); //output: [[@java.lang.Deprecated(forRemoval=false,

  }


}
