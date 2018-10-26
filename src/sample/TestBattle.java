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
            battle.addAlly(new Farfetch("Саня"));

            battle.addFoe(new Skuntank("Ваня"));
        }else if(i == 2){
            battle.addAlly(new Stunky("Гена"));

            battle.addFoe(new Pichu("Даня"));
        }else if(i == 3){
            battle.addAlly(new Pikachu("Олег"));

            battle.addFoe(new Skuntank("Митя"));
        }else if(i == 4){
            battle.addAlly(new Skuntank("Саша"));

            battle.addFoe(new Stunky("Коля"));
        }else if(i == 5){
            battle.addAlly(new Pichu("Тимур"));

            battle.addFoe(new Skuntank("Женя"));
        }else{
            battle.addAlly(new Raichu("Паша"));

            battle.addFoe(new Skuntank("Артур"));
        }
        battle.go();

        System.setOut(standardOut);
    }
}
