package lesson4;

public class Park {
    private String attractionName;
    private String sinceThatTime;
    private String untilTime;
    private String breakTime1;
    private String breakTime2;
    private String breakTime3;
    private String breakTime4;
    private int cost1;
    private int cost2;

    public Park(String attractionName, String sinceThatTime, String untilTime, String breakTime1, String breakTime2, String breakTime3, String breakTime4, int cost1, int cost2) {
        this.attractionName = attractionName;
        this.sinceThatTime = sinceThatTime;
        this.untilTime = untilTime;
        this.breakTime1 = breakTime1;
        this.breakTime2 = breakTime2;
        this.breakTime3 = breakTime3;
        this.breakTime4 = breakTime4;
        this.cost1 = cost1;
        this.cost2 = cost2;
    }

    public void infoAttraction() {
        System.out.println(attractionName);
        System.out.println("Часы работы:");
        System.out.println("По будням и выходным с " + sinceThatTime + " до " + untilTime);
        System.out.println("Cтоимость билетов:");
        System.out.println("Взрослый - " + cost1 + "р | Детский - " + cost2 + "р");
        System.out.println("Технические перерывы:");
        System.out.println(breakTime1 + "-" + breakTime2);
        System.out.println(breakTime3 + "-" + breakTime4);
        System.out.println();
    }

    public static void main(String[] args) {
        Park[] attraction = new Park[3];
        attraction[0] = new Park("Американские горки", "10.00", "20.00", "13.00", "13.30", "17.00", "17.30", 250, 150);
        attraction[1] = new Park("Викинги", "10.00", "20.00", "13.30", "14.00", "16:30", "17:00", 200, 100 );
        attraction[2] = new Park("Ракушки", "09:00", "21:00","12:30", "13:30", "17:00", "17:30", 150,100);
        attraction[0].infoAttraction();
        attraction[1].infoAttraction();
        attraction[2].infoAttraction();
    }
}