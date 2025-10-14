package org.riproot.fourier_analysis;

import java.io.ByteArrayOutputStream;
import java.io.File;


public class SignalGenerator {
    
    public double[] generateAudioWave(File wavFile) {
        /*
         * Since I am using .wav files, and they are bytes by default, I will just be copying that data into a byte array. 
         */
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //BufferedInputStream in = new BufferedInputStream(wavFile);

        double[] temp = new double[64];
        
        return temp;
    }
    
}
