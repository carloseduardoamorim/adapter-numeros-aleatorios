
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;


public class RealDistribuitionAdapter implements AlvoAleatorios {

    @Override
    public double randomDouble() {
        return new NormalDistribution().sample();
    }

    @Override
    public double randomSeed(long seed) {
        System.out.println("Random normalRandom.reseedRandomGenerator(seed)");
        RealDistribution normalRandom = new NormalDistribution();
        normalRandom.reseedRandomGenerator(seed);
        return normalRandom.sample();
    }

    @Override
    public double[] randomArray(int qtdNumeros) {
        RealDistribution normalRandom = new NormalDistribution();
        return normalRandom.sample(qtdNumeros);
    }
    
}
