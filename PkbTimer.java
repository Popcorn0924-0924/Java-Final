package peekaboo;

import java.util.ArrayList;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import peekaboo.props.*;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.awt.Toolkit;

/*
 * 倒數計時
 */
public class PkbTimer  {
    // 創建計時器
    Timer timergame = new Timer();
    public int num = 0,t;
    public Timer time2;
    public boolean run = true;
    public GameFrame gf;
    public long midTime=20000;
    public long hh=0,mm=0,ss=0;
    public PkbTimer(GameFrame gf) {
        
        
    }
    public void TimeGame() {
        //System.out.println("Time");
        TimerTask gametest = new TimerTask() {
            @Override
            public void run() {
                //System.out.println("跑Time");
                if(midTime>0)
                {
                    midTime--;
                hh = midTime / 100 / 60 % 60;
                mm = midTime / 100 % 60;
                ss = midTime % 100;
                Toolkit.getDefaultToolkit().beep();
                //timer.cancel();
                //timergame.purge();
                }
                else
                timergame.purge();

            }
            
        };

        timergame.schedule(gametest, 1000);
        run = false;
    }

}