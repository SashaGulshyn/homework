package src.control_work;

import java.util.List;
import java.util.ArrayList;

interface Pizzeria {
    Menu getMenu();

    void createOrder(Pizza pizza);

    Receipt takeAway(Order order);
}

class Menu {
    List<Pizza> pizzas;

    public Menu(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}

class Pizza {
    String name;

    public Pizza(String name) {
        this.name = name;
    }
}

class Order {
    List<Pizza> pizzasInProgress;

    public Order() {
        this.pizzasInProgress = new ArrayList<>();
    }
}

class Receipt {
    long orderTakenTime;
    long pizzaCookingStartTime;
    long orderPackagingStartTime;
    long orderReadyTime;
    int orderNumber;
    long receiptPrintTime;
    long getEstimatedReadyTimeInMinutes;

    public Receipt(long orderTakenTime, long pizzaCookingStartTime, long orderPackagingStartTime, long orderReadyTime,
                   int orderNumber, long receiptPrintTime) {
        this.orderTakenTime = orderTakenTime;
        this.pizzaCookingStartTime = pizzaCookingStartTime;
        this.orderPackagingStartTime = orderPackagingStartTime;
        this.orderReadyTime = orderReadyTime;
        this.orderNumber = orderNumber;
        this.receiptPrintTime = receiptPrintTime;

        this.getEstimatedReadyTimeInMinutes = (orderReadyTime - orderTakenTime) /(1000 * 60) ;
        //long estimatedReadyTimeInMill = (orderReadyTime - orderTakenTime) / (1000 * 60); // Конвертация из миллисекунд в минуты
    }
}
