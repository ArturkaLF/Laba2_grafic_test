package sample;

import com.artur.lab2.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestBattle {

    public static String getAllStatTest(Pokemon p) {
        return "".concat("HP: ").concat(String.format("%.4g", p.getStat(Stat.HP))).concat("\n").concat("Att: ").concat(String.format("%.4g", p.getStat(Stat.ATTACK))).concat("\n").concat("Def: ").concat(String.format("%.4g", p.getStat(Stat.DEFENSE))).concat("\n").concat("SpecAtt: ").concat(String.format("%.4g", p.getStat(Stat.SPECIAL_ATTACK))).concat("\n").concat("SpecDeff: ").concat(String.format("%.4g", p.getStat(Stat.SPECIAL_DEFENSE))).concat("\n").concat("Speed: ").concat(String.format("%.4g", p.getStat(Stat.SPEED))).concat("\n");
    }

    public static void battleTest(int i) throws FileNotFoundException {
        PrintStream standardOut = System.out;
        PrintStream st = new PrintStream(new FileOutputStream("test_out"));
        System.setOut(st);

        Battle battle = new Battle();

        if (i == 1){
            battle.addAlly(new Farfetch("Хабиб"));

            battle.addFoe(new Skuntank("Макгрегор"));
        }else if(i == 2){
            battle.addAlly(new Stunky("Артур"));

            battle.addFoe(new Pichu("Шварц"));
        }else if(i == 3){
            battle.addAlly(new Pikachu("Саб-Зиро"));

            battle.addFoe(new Skuntank("Скорпион"));
        }else if(i == 4){
            battle.addAlly(new Skuntank("Брюс Ли"));

            battle.addFoe(new Stunky("Джеки Чан"));
        }else if(i == 5){
            battle.addAlly(new Pichu("Рокки"));

            battle.addFoe(new Skuntank("Чак Норрис"));
        }else{
            battle.addAlly(new Raichu("Путин"));

            battle.addFoe(new Skuntank("Трамп"));
        }
        battle.go();

        System.setOut(standardOut);
    }
}
