package src.control_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyPizzeria implements Pizzeria {
    private Menu menu;
    private List<Order> orders;

    public MyPizzeria(Menu menu) {
        this.menu = menu;
        this.orders = new ArrayList<>();
    }

    @Override
    public Menu getMenu() {
        return menu;
    }

    @Override
    public void createOrder(Pizza pizza) {
        Order order = new Order();
        order.pizzasInProgress.add(pizza);
        orders.add(order);
    }

    @Override
    public Receipt takeAway(Order order) {
        long orderTakenTime = System.currentTimeMillis();
        long pizzaCookingStartTime = orderTakenTime + 1_200_000; // Предположим, что потребуется 20 минут на приготовление пиццы
        long orderPackagingStartTime = pizzaCookingStartTime + 300_000; // Предположим, что потребуется 5 минут, чтобы упаковать заказ
        long orderReadyTime = orderPackagingStartTime + 60_000; // Предположим, что потребуется ещё минута, чтобы подготовить заказ к выдаче
        int orderNumber = orders.indexOf(order) + 1;
        long receiptPrintTime = orderReadyTime + 5000; // Предположим, что потребуется 5 секунд, чтобы распечатать чек

        return new Receipt(orderTakenTime, pizzaCookingStartTime, orderPackagingStartTime, orderReadyTime, orderNumber, receiptPrintTime);
    }

    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Маргарита"));
        pizzas.add(new Pizza("Пепперони"));
        pizzas.add(new Pizza("Вегетарианская"));
        pizzas.add(new Pizza("Гавайская"));

        Menu menu = new Menu(pizzas);
        MyPizzeria pizzeria = new MyPizzeria(menu);

        System.out.println("Добро пожаловать в пиццерию Double Cheese!");
        System.out.println("Выберите пиццу, которую вы хотите заказать:");

        for (int i = 0; i < menu.pizzas.size(); i++) {
            System.out.println((i + 1) + ". " + menu.pizzas.get(i).name);
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= menu.pizzas.size()) {
            Pizza chosenPizza = menu.pizzas.get(choice - 1);
            pizzeria.createOrder(chosenPizza);

            Order order = pizzeria.orders.get(pizzeria.orders.size() - 1);
            Receipt receipt = pizzeria.takeAway(order);

            System.out.println("Ваш заказ принят в работу");
            System.out.println("Ваш номер заказа: " + receipt.orderNumber);
            System.out.println("Ожидаемое время (в минутах), за которое заказ будет выполнен: " + receipt.getEstimatedReadyTimeInMinutes);
        } else {
            System.out.println("Нет такой пиццы. Попробуйте ещё раз");
        }
    }
}
