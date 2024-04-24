//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int oldLocal = 34;
        int newLocal = 0;
        int truckCapacity = 9;
        int truckLoad = 0;
        do {
            if (truckCapacity < oldLocal){
                truckLoad = truckCapacity;
                oldLocal = oldLocal - truckCapacity;
            } else {
                truckLoad = oldLocal;
                oldLocal = 0;
            }
            System.out.println("un voyage de " + truckLoad + " cartons");
            newLocal = newLocal + truckLoad;
            truckLoad = 0;
        } while (oldLocal > 0);
        System.out.println("L'ancien dépot est vide !");
    }
}