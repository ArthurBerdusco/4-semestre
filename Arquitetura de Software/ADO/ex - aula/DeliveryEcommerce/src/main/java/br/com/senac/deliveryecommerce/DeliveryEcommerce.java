package br.com.senac.deliveryecommerce;

/*

Usando o padrão stategy como ficaria a arquitetura, use java: 
Uma loja virtual oferece várias opções de entrega, por empresas diferentes. 
E que, por sua vez, cobram valores distintos.
Vamos considerar uma lista com três empresas: XPTO 10%, ABC 20% e CBA30%.   
O cálculo é realizado assim: distancia*taxa

 */
// Interface para as estratégias de entrega
interface DeliveryStrategy {
    double calculateCost(double distance);
}

// Implementações específicas para cada empresa
class XPTODeliveryStrategy implements DeliveryStrategy {

    private static final double TAX_RATE = 0.1;

    @Override
    public double calculateCost(double distance) {
        return distance * TAX_RATE;
    }
}

class ABCDeliveryStrategy implements DeliveryStrategy {

    private static final double TAX_RATE = 0.2;

    @Override
    public double calculateCost(double distance) {
        return distance * TAX_RATE;
    }
}

class CBADeliveryStrategy implements DeliveryStrategy {

    private static final double TAX_RATE = 0.3;

    @Override
    public double calculateCost(double distance) {
        return distance * TAX_RATE;
    }
}

// Classe que utiliza a estratégia de entrega
class ShoppingCart {

    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calculateDeliveryCost(double distance) {
        if (deliveryStrategy == null) {
            throw new IllegalStateException("A estratégia de entrega não foi definida.");
        }

        return deliveryStrategy.calculateCost(distance);
    }
}

// Exemplo de uso
public class DeliveryEcommerce {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Escolher a estratégia de entrega desejada (XPTO, ABC, CBA)
        cart.setDeliveryStrategy(new ABCDeliveryStrategy());

        // Calcular o custo de entrega para uma determinada distância
        double distance = 100.0; // substitua pela distância real
        double deliveryCost = cart.calculateDeliveryCost(distance);

        System.out.println("Custo de entrega: $" + deliveryCost);
    }
}
