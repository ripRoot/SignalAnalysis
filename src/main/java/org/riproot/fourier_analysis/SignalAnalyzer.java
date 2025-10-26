/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.riproot.fourier_analysis;

import java.io.File;
import java.util.Arrays;

public class SignalAnalyzer {

    public static void main(String[] args) {
        File wavFiles = new File("/home/riple/gitProjects/SignalAnalysis/audioFiles/carlitos_way_watchin.wav");
        SignalGenerator a = new SignalGenerator(wavFiles);

        byte[] AudioBytes = a.getAllAudioBytes();
        System.out.println(Arrays.toString(AudioBytes));
    }
}
