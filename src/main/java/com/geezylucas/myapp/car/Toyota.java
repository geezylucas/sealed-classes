package main.java.com.geezylucas.myapp.car;

/* 
 * Un beneficio de las clases selladas es que pueden ser utilizadas en lugar del patrón de fábrica, ya que 
 * las restricciones en la jerarquía de clases permiten una mejor encapsulación. 
 * 
 * En este ejemplo, la clase sellada Toyota tiene un método de fábrica que crea objetos de las 
 * clases permitidas. Esto proporciona una mejor encapsulación, ya que no se puede crear un objeto 
 * de una clase que no esté permitida para extender o implementar la clase sellada.
 */
public sealed abstract class Toyota implements Car permits RavHybrid, RavGasoline {

    public abstract boolean isHybrid();

    @Override
    public void startEngine() {
        if (isHybrid()) {
            System.out.println("I am Toyota hybrid car, starting electric motor...");
        } else {
            System.out.println("I am Toyota gasoline car, starting gasoline engine...");
        }
    }

    public static Toyota create(String engineType) {
        if (engineType.equals("Hybrid")) {
            return new RavHybrid();
        } else if (engineType.equals("Gasoline")) {
            return new RavGasoline();
        } else {
            throw new IllegalArgumentException("Invalid engine type: " + engineType);
        }
    }

}
