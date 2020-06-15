package projektas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Vartotojas
 */
public class Greitaveika {
    public static void main(String[] args) {
        
        int objektuKiekis = 4000;
        
        DinaminisSarasas<Automobilis> manoAuto = new DinaminisSarasas();
        List<Automobilis> listoAuto = new ArrayList();
        LinkedList<Automobilis> linkedListoAuto = new LinkedList();
        
        
        
        long t1 = System.nanoTime();
        for(int i = 0; i < objektuKiekis; i++){
            Automobilis auto = Random();
            manoAuto.add(auto);
        }
        manoAuto.shrinkSize(); //Ismetame nenaudojama capacity
        long t2 = System.nanoTime();
        
        
        long t3 = System.nanoTime();
        for (int i = 0; i < objektuKiekis; i++) {
            Automobilis auto = Random();
            listoAuto.add(auto);
        }
        long t4 = System.nanoTime();
        
        long t5 = System.nanoTime();
        for (int i = 0; i < objektuKiekis; i++) {
            Automobilis auto = Random();
            linkedListoAuto.add(auto);
        }
        long t6 = System.nanoTime();
        
        
        
        System.out.format("Laikas per kurį sudaro mano sarašą -> %.4f\n", (t2 - t1) / 1e9);
        System.out.format("Laikas per kurį sudaro List -> %.4f\n", (t4 - t3) / 1e9);
        System.out.format("Laikas per kurį sudaro LinkedList -> %.4f\n\n", (t6 - t5) / 1e9);
        
        t1 = System.nanoTime();
        manoAuto.remove();
        t2 = System.nanoTime();
        
        t3 = System.nanoTime();
        listoAuto.clear();
        t4 = System.nanoTime();
        
        t5 = System.nanoTime();
        linkedListoAuto.clear();
        t6 = System.nanoTime();
        
        System.out.format("Laikas per kurį išvalo mano sarašą -> %.7f\n", (t2 - t1) / 1e9);
        System.out.format("Laikas per kurį išvalo List -> %.7f\n", (t4 - t3) / 1e9);
        System.out.format("Laikas per kurį išvalo LinkedList -> %.4f\n\n", (t6 - t5) / 1e9);
    }
    
    /**
     * Random objekto sukurimo metodas
     * @return Randomly sukurta objekta
     */
    public static Automobilis Random(){
        
        Random rand = new Random();
        
        String[] [] visiAuto =  {
                                 {"Volkswagen", "Golf", "Santana", "Bora", "Passat"}, 
                                 {"BMW", "E30", "E24", "E28", "F60"},
                                 {"Toyota", "Corolla", "Verso", "Yaris"}, 
                                 {"Nissan", "370Z", "GT-R", "Altima", "Juke"}, 
                                 {"Peugeot", "206", "208", "108", "2006"}                                        
                                 };
        
        String[] kuroTipas = {"Benzinas", "Dyzelinas", "Benzinas/Dujos", "Elektra", "Benzinas/Elektra"};
        
        String[] arUzimta = {"Taip", "Ne"};
        
        String[] adresas = {"Studentu g.", "Pašilės g.", "K. Baršausko"};
        
        Automobilis auto;
        
        rand.setSeed(2016);
        
        int ma = rand.nextInt(visiAuto.length);
        int mo = rand.nextInt(visiAuto[ma].length - 1) + 1;
        int kuroTipasInt = rand.nextInt(kuroTipas.length);
        double kuras = rand.nextInt(20) + rand.nextDouble();
        double kaina = rand.nextDouble();
        int uzimta = rand.nextInt(arUzimta.length);
        int adr = rand.nextInt(adresas.length);
        
        auto = new Automobilis(visiAuto[ma][0], visiAuto[ma][mo], kuroTipas[kuroTipasInt], kuras, kaina, arUzimta[uzimta], adresas[adr]);
        
        return auto;
    }
}
