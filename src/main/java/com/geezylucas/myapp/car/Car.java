package main.java.com.geezylucas.myapp.car;

public sealed interface Car permits Tesla, Toyota {

    public void startEngine();
    
}
