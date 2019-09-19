/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockapp;

import java.util.Arrays;

public class ClockApp {

    
    public static void main(String[] args) {
      Clock time1 = new Clock();
      System.out.println(time1.toString()+"\n");
      
      Clock time2 = new Clock(8);
      System.out.println(time2.toString()+"\n");
      
      Clock time3 = new Clock(12,30);
      System.out.println(time3.toString()+"\n");
      
      Clock time4 = new Clock(time3);
      System.out.println(time4.toString()+"\n");
      
      Clock time5 = new Clock(17,8);
      System.out.println(time5.toString()+"\n");
      
      Clock[] myTime1 = new Clock[5];
      myTime1[0] = time3;
      myTime1[1] = time5;
      myTime1[2] = time1;
      myTime1[3] = time4;
      myTime1[4] = time2;
      System.out.println(Arrays.toString(myTime1)+"\n");
      
      Clock time6 = new Clock(5,30);
      time6.addTo(6,30);
      System.out.println(time6+"\n");
      
      Clock time7 = new Clock(6,45);
      time7.subtractFrom(9,30);
      System.out.println(time7+"\n");
      
      Clock[] myTime2 = new Clock[4];
      myTime2[0] = time3;
      myTime2[1] = time5;
      myTime2[2] = time5;
      myTime2[3] = time2;
      System.out.println(Arrays.toString(myTime2)+"\n"+"\n");
      
      sortTime(myTime2);
      System.out.println(Arrays.toString(myTime2)+"\n");
      
      sortTime(myTime1);
      System.out.println(Arrays.toString(myTime1)+"\n");
      
      System.out.println(medianTime(myTime2)+"\n");
      
      System.out.println(medianTime(myTime1)+"\n");
      
      Clock[] myTime3 = new Clock[4];
      myTime3[0] = time3;
      myTime3[1] = time3;
      myTime3[2] = time5;
      myTime3[3] = time2;
      System.out.println(Arrays.toString(myTime3)+"\n");
      
      sortTime(myTime3);
      System.out.println(Arrays.toString(myTime3)+"\n");
      
      System.out.println(medianTime(myTime3)+"\n");
     
    }
    public static void sortTime(Clock[]x){
        Clock temp;
        for (int r = 0; r<x.length;++r){
            for (int i = 0;i<x.length-1;++i){
                if(x[i].getHours()>x[i+1].getHours()){    
                    temp = x[i];
                    x[i] = x[i+1];
                    x[i+1] = temp;
                }
                if(x[i].getHours()==x[i+1].getHours()){
                    if(x[i].getMinutes()>x[i+1].getMinutes()){
                        temp = x[i];
                        x[i] = x[i+1];
                        x[i+1] = temp;
                    }
                }
            }
        }
    }
    public static Clock medianTime(Clock[]y){
        Double medHourMin;
        Double medMin;
        int medianHour;
        int medianMin;
        if(y.length%2==0){
            if(y[y.length/2].getHours()==y[y.length/2-1].getHours()){
               medianHour=(y[y.length/2].getHours());
               medianMin=(y[y.length/2].getMinutes()+y[(y.length/2)-1].getMinutes())/2;
               Clock medTime = new Clock(medianHour,medianMin);
               return medTime;
            }
            else{   
               medHourMin=((y[y.length/2].getHours()-y[(y.length/2)-1].getHours())/2.0)*60;
               medHourMin+=(y[y.length/2].getMinutes()+y[(y.length/2)-1].getMinutes())/2;
               medHourMin=medHourMin/60;
               medMin=(medHourMin-medHourMin.intValue())*60;
               medianMin=medMin.intValue();
               medianHour=y[(y.length/2)-1].getHours()+medHourMin.intValue();
               Clock medTime = new Clock(medianHour,medianMin);
               return medTime;
            }
        }
        else{
            return y[(y.length/2)];
        }
    }
} 











































