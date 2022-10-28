// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graphics g)
    {
        int width = 980;
        int height = 630;
        int r1 = 10;
        int ry1 = 640;
        int r2 = 990;
        int ry2 = 640;
        g.drawRect(10,10,width,height);

    //bottom right
        int brx1 = 10;
        int bry1 = 640;
        int brx2 = 990;
        int bry2 = 640;
        for( int k= 0; k<49;k++) {

            g.drawLine(brx1,bry1,brx2,bry2);
            brx1 +=20;
            bry2 -=13;


        }
        //bottom left
        int lx1 = 990;
        int ly1 = 640;
        int lx2 = 10;
        int ly2 = 640 ;
        for( int k= 0; k<49;k++) {

            g.drawLine(lx1, ly1, lx2, ly2);
            lx1 -= 20;
            ly2 -= 13;
        }

        //top left
        int tlx1 = 10;
        int tly1 = 10;
        int tlx2 = 990;
        int tly2 = 10 ;
        for( int k= 0; k<49;k++) {

            g.drawLine(tlx1, tly1, tlx2, tly2);
            tlx2 -= 20;
            tly1 += 13;
        }
        //top right
        int trx1 = 10;
        int try1 = 10;
        int trx2 = 990;
        int try2 = 10 ;
        for( int k= 0; k<49;k++) {

            g.drawLine(trx1, try1, trx2, try2);
            trx1 += 20;
            try2 += 13;
        }
        //small rectangle

        g.drawRect(248,175,505,300);
        // 10 = starting x, 10= starting y, 990 = ending x, 640 = ending y
        // small 248 = starting x, 175 = starting y, 753 = ending x, 475 = ending y
        //bottom right
        int brsx1 = 248;
        int brsy1 = 475;
        int brsx2 = 753;
        int brsy2 = 475;
        for( int k= 0; k<25;k++) {

            g.drawLine(brsx1,brsy1,brsx2,brsy2);
            brsx1 +=20;
            brsy2 -=12;


        }
        //bottom left
        int blsx1 = 753;
        int blsy1 = 475;
        int blsx2 = 248;
        int blsy2 = 475;


        for( int k= 0; k<25;k++) {

            g.drawLine(blsx1, blsy1, blsx2, blsy2);
            blsx1 -= 20;
            blsy2 -= 12;
        }
            //top left
            int tlsx1 = 248;
            int tlsy1 = 175;
            int tlsx2 = 753;
            int tlsy2 = 175;

            for(int k = 0; k<25;k++) {

                g.drawLine(tlsx1, tlsy1, tlsx2, tlsy2);
                tlsx2 -= 20;
                tlsy1 += 12;
            }
        //top right
        int trsx1 = 248;
        int trsy1 = 175;
        int trsx2 = 753;
        int trsy2 = 175;

        for(int k = 0; k<25;k++) {

            g.drawLine(trsx1, trsy1, trsx2, trsy2);
            trsx1 += 20;
            trsy2 += 12;
        }















    }















}

