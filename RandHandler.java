package com.liamallen.rpgcli;

import java.util.Random;

public class RandHandler {
    
    private static Random Rand = new Random();

    public static int RollD20()
    {
        int rand = Rand.nextInt(21);

        while(rand == 0)
        {
            rand = Rand.nextInt(21);
            if(rand != 0)
            {
                break;
            }
        }

        return rand; 
    }
}
