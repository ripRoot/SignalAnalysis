package org.riproot.fourier_analysis;

//Imported Packages
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;


public class SignalGenerator {
    
    public static byte[] generateAudioWave(File wavFile) {
        /*
         * Since I am using .wav files, and they are bytes by default, I will just be copying that data into a byte array. 
         * 
         * 
         * A WAV file contains a header followed by raw data, so in order to get the raw data we will use the getBytes method from the 
         * AudioInputStream class. 
         */
        AudioInputStream audio = null;

        //The line below will help write data into a byte array. 
        ByteArrayOutputStream ba = new ByteArrayOutputStream();


        try {
            audio = AudioSystem.getAudioInputStream(wavFile); // I think that this is the line that it will fail on. 
            
            byte[] Buffer = new byte[4096]; //52000 bytes is about 52 kilobytes which is how much storage the Carlitos_Way_Watching file is. 
            //While loop will run until there are no more bytes in Carlitos_Way_Watching. 

            int bytesRead; //temp variable
            
            while((bytesRead = audio.read(Buffer)) != -1){ 
                // What audio.read(byte[] b) does is that it reads the bytes all the way until the length of the array inputed as bytes. 
                ba.write(Buffer, 0, bytesRead); // Here, I am taking my bytesRead func and putting it into my Buffer array. 
            }

            byte[] allAudioBytes = ba.toByteArray();
            return allAudioBytes;

        } catch (Exception e) {
            e.getStackTrace();
        }

        return null;
    }
    
}
