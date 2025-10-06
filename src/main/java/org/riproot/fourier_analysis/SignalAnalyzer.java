/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.riproot.fourier_analysis;

import java.util.Arrays;

public class SignalAnalyzer {

    public static void main(String[] args) {
        double amplitude = 1.0;
        double frequency = 1.0;
        int numSamples = 10;

        double[] sineWave = new SignalGenerator().generateSineWave(amplitude, frequency, numSamples);

        System.out.println(Arrays.toString(sineWave));
    }
}
