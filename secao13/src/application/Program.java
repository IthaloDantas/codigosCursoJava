package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date() , OrderStatus.PENDING_PAYMENT); // esse new Date significa que a data de compra foi agora ou seja vai pegar a data e a hora do exato momento da execução

        System.out.println(order); // vai aparecer na var status o status do pedido que nesse caso é pagamento pendente

        // --------------------------------------------------------------------------------------------------------------------------------------------------------------

        // Conversão de String para enum com valueOf

        OrderStatus os1 = OrderStatus.DELIVERED; // instanciou um objeto os1 com o valor delivered

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // instanciou um objeto os2 buscando o enum delivered e o transformando em String se o valor for diferente vai dar erro pq n vai achar

        System.out.println(os1);
        System.out.println(os2);




    }
}
