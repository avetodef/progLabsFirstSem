package lab_2.attacks;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Bite extends PhysicalMove{
    public Bite()
    { super(Type.DARK, 60, 100); }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "Uses Bite";
    }
}
