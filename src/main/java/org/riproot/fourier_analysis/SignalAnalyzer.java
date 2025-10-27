/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.riproot.fourier_analysis;

import java.io.File;
import java.util.Arrays;

public class SignalAnalyzer {

    public static void main(String[] args) {
        File wavFiles = new File("/home/elpir/git/fourier_analysis/audioFiles/carlitos_way_watchin.wav");
        
        // Signal Generator Object using .wav file bytes. 
        SignalGenerator a = new SignalGenerator(wavFiles);
        // This byte[] is represented in a time domain. Whenever we compute a fourier transformation on it, we transform it to a frequency domain.
        // Like a white noise signal on the time domain with equal amplitudes at each time will result in a
        // straight line on the frequency domain cause each amplitude is equal.
        byte[] AudioBytes = a.getAllAudioBytes();
        
        // Signal Generator (empty constructor test) using a generated sine wave
        SignalGenerator b = new SignalGenerator();
        double amplitude = 1.0;
        double frequency = 1.0; 
        int numSamples = 100;
        double[] sinewave = b.generateSineWave(amplitude, frequency, numSamples);

        System.out.println(Arrays.toString(sinewave));


        //FourierTransformation ftsine = new FourierTransformation();
        
    }
}
