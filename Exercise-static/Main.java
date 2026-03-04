
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Francesco","Sepe","Via Refoli 9");
        Employee employee2 = new Employee("Mario","Rossi","Piazza mercato 5");
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);
        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
