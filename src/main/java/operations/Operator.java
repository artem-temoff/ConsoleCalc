package operations;

import states.NoSuchOperationInputException;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Eremenko on 06.04.2015.
 */
public abstract class Operator {
    private final Map<String,OperationFactory> factoryMap =
            Collections.unmodifiableMap(new HashMap<String, OperationFactory>() {{
                put("/" , new OperationFactory() {
                    public Operator create() {
                        return new Div();
                    }
                });
                put("+" , new OperationFactory() {
                    public Operator create() {
                        return new Sum();
                    }
                });
                put("-" , new OperationFactory() {
                    public Operator create() {
                        return new Sub();
                    }
                });
                put("*" , new OperationFactory() {
                    public Operator create() {
                        return new Mul();
                    }
                });
                put("^" , new OperationFactory() {
                    public Operator create() {
                        return new Pow();
                    }
                });
            }});

    public Operator createOperator(String action) {
        OperationFactory factory = factoryMap.get(action);
        if (factory == null) {
            throw new NoSuchOperationInputException();
        }
        return factory.create();
    }
    public abstract double calculate(double first, double second);
}
