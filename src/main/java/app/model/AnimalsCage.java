package app.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private final Animal animal;
    private final Animal animal2;
    private final Timer timer;
    @Autowired
    public AnimalsCage (@Qualifier("cat") Animal animal, @Qualifier ("dog") Animal animal2, @Qualifier("timer") Timer timer)
    {
        this.animal = animal;
        this.animal2 = animal2;
        this.timer = timer;
    }
    public Timer getTimer(){
        return timer;
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
        System.out.println("Say:");
        System.out.println(animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());

    }
}
