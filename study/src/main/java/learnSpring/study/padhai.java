package learnSpring.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class padhai {

    public moj maja;
    
    @Autowired
    public void setMaja(moj maja)
    {
     this.maja=maja;
    }
    public void padhaiMethod() {
        System.out.println("main padhai kar raha hoon");
    }
}