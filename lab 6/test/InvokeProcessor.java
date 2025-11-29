import java.lang.reflect.Method;

public class InvokeProcessor {

    public static void process(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
