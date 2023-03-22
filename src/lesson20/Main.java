package lesson20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть Ваше слово: Вітаю, Доброго дня, Бувай, Як справи, Чим ти займаєшся, жити, радість, світло, Земля, Вода");
        String str = sc.nextLine();

        Map<String, String> map1 = new HashMap<String, String>();

        map1.put("Вітаю", "Congratulations, おめでとう, Glückwunsch");
        map1.put("Доброго дня", "Hello, 良い一日, Guten Tag");
        map1.put("Бувай", "Bye, さよなら, Tschüss");
        map1.put("Як справи", "How are you, 元気ですか, Wie geht es dir");
        map1.put("Чим ти займаєшся", "What do you do, 職業はなんですか, Wie geht's");
        map1.put("життя", "life, 人生, Leben");
        map1.put("радість", "gladness, 喜び, Freude");
        map1.put("світло", "light, ライト, Licht");
        map1.put("Земля", "Earth, 地球, Erde");
        map1.put("Вода", "Water, 水, Wasser");

        System.out.println(map1.get(str));
        sc.close();
    }
}
