package Task_1;

class Monitor {
    String color;
    float dimension;
    String resolution;


    void change_Color(String color) {
        this.color = color;
    }

    String get_color(){
       return this.color;
    }
    boolean equal_dimension(float dim_monitor_1, float dim_monitor_2) {

        return dim_monitor_1 == dim_monitor_2;
    }
}
