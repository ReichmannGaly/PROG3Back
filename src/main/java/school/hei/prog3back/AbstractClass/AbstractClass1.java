package school.hei.prog3back.AbstractClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import school.hei.prog3back.ConcreteDependance.ConcreteDependance1;
import school.hei.prog3back.ConcreteDependance.ConcreteDependance2;

@Component
public abstract class AbstractClass1 {
    @Autowired
    protected ConcreteDependance1 concreteDependance1;
    @Autowired
    protected ConcreteDependance2 concreteDependance2;

    public ConcreteDependance1 getConcreteDependance1() {
        return concreteDependance1;
    }

    public ConcreteDependance2 getConcreteDependance2() {
        return concreteDependance2;
    }

    public abstract void performOperation();
}
