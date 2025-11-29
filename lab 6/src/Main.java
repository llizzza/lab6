//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("1 Задание. Задача 1");
        InvokeClass demo = new InvokeClass();
        InvokeProcessor.process(demo);

        System.out.println("1 Задание. Задача 2");
        DefaultProcessor.printDefaultClass(DefaultHuman.class);

        System.out.println("1 Задание. Задача 3");
        ToStringHuman h = new ToStringHuman("Иван", 180);
        System.out.println(ToStringLine.toAnnotatedString(h));

        System.out.println("1 Задание. Задача 4");
        ValidateProcessor.process(ValidateClass.class);

        System.out.println("1 Задание. Задача 5");
        TwoProcessor.process(TwoClass.class);

        System.out.println("1 Задание. Задача 6");
        CacheProcessor.process(CacheClass.class);




    }
}