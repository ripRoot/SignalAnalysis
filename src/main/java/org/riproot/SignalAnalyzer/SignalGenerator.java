package org.riproot.SignalAnalyzer;

public class SignalGenerator {
    
    public double[] generateSineWave(double amplitude, double frequency, int numSamples){
        double[] sineWave = new double[numSamples];
        double sampleRate = 44100.0;
        double angularFreq = 2 * Math.PI * frequency;

        for(int i = 0; i < numSamples; i++){
            double time = i / sampleRate;
            sineWave[i] = amplitude * Math.sin(angularFreq * time);
        }   
        return sineWave;
    }

    

}
