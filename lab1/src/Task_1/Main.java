package Task_1;


public class Main {
    public static void main(String[] args) {
        Monitor monitor_1 = new Monitor();

        monitor_1.dimension = 15.6f;
        monitor_1.resolution = "1024x768";
        monitor_1.color = "light_black";

        Monitor monitor_2 = new Monitor();

        monitor_2.dimension = 16.2f;
        monitor_2.resolution = "4024x678";
        monitor_2.color = "dark_green";

        System.out.println(monitor_1.dimension == monitor_2.dimension);
        System.out.println(monitor_1.color.equals(monitor_2.color));
        System.out.println(monitor_1.resolution.equals(monitor_2.resolution));
        monitor_1.change_Color("blue");
        System.out.println(monitor_1.get_color());

    }

}
