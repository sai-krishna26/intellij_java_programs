package com.saikrishna.day1_1;
import com.saikrishna.day1.Types;

public class Keybunch
{
    Types type;

    public Keybunch(Types type) {
        this.type = type;
    }

    public void showBunch()
    {
        System.out.println("type:"+this.type);

    }
}
