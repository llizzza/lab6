import java.lang.reflect.Field;
public class ToStringLine {


    public static String toAnnotatedString(Object obj) {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(ToString.class)) {
            return obj.toString();
        }

        StringBuilder sb = new StringBuilder(clazz.getSimpleName()).append("{");
        Field[] fields = clazz.getDeclaredFields();
        boolean first = true;

        for (Field f : fields) {
            ToString ann = f.getAnnotation(ToString.class);

            if (ann != null && ann.value() == ToString.Mode.NO) continue;

            try {
                f.setAccessible(true);

                if (!first) sb.append(", ");
                sb.append(f.getName()).append("=").append(f.get(obj));

                first = false;

            } catch (IllegalAccessException ignored) {}
        }

        return sb.append("}").toString();
    }
}

