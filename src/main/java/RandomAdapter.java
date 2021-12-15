
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class RandomAdapter implements AlvoAleatorios {
    @Override
    public double randomDouble() {
        return new Random().nextDouble();
    }

    @Override
    public double randomSeed(long seed) {
        System.out.println("Random nextDouble(seed)");
        return new Random(seed).nextDouble();
    }

    @Override
    public double[] randomArray(int qtdNumeros) {
        return new Random().doubles(qtdNumeros).toArray();
    }
    
}
