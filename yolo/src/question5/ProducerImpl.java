package question5;

import java.util.UUID;

public class ProducerImpl implements Producer {
    @Override
    public Cake produce() {
        return new Cake();

    }
}
