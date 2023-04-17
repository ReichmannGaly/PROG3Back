package school.hei.prog3back.ConcreteClass;

import org.springframework.stereotype.Component;
import school.hei.prog3back.AbstractClass.AbstractClass1;

@Component
public class ConcreteClass2 extends AbstractClass1 {
    @Override
    public void performOperation() {
        getConcreteDependance2().operation2();
    }
}
