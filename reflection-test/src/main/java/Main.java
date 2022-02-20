import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args) {
    MyClass myClass = null;
    try {
      Class clazz = Class.forName(MyClass.class.getName());
      Class[] params = {int.class, String.class};
      myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
      e.printStackTrace();
    }
    System.out.println(myClass);//output created object reflection.MyClass@60e53b93
  }


  public static void printData(Object myClass) {
    try {
      Method method = myClass.getClass().getDeclaredMethod("printData");
      method.setAccessible(true);
      method.invoke(myClass);
    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
      e.printStackTrace();
    }
  }
}
