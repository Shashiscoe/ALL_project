import java.util.Timer;
import java.util.TimerTask;

public class Test{

    public static String t(String str){
        return str;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Timer timer= new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                for(int i=0;i<2;i++){
                    System.out.println("Sending - "+"Timer1A"+i);
                   /* System.out.println("Sending - "+"Timer1B"+i+" ---- > got - "+Test.t("Timer1B"+i+""));
                    System.out.println("Sending - "+"Timer1C"+i+" ---- > got - "+Test.t("Timer1C"+i+""));
                    
        */        
                    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
                
            }
            
            
        },0,1);
        /*timer.schedule(new TimerTask(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Sending - "+"Timer2D"+i+" ---- > got - "+Test.t("Timer2D"+i+""));
                    System.out.println("Sending - "+"Timer2E"+i+" ---- > got - "+Test.t("Timer2E"+i+""));
                    System.out.println("Sending - "+"Timer2F"+i+" ---- > got - "+Test.t("Timer2F"+i+""));
                }
            }
        },1000,10);
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Sending - "+"Timer3G"+i+" ---- > got - "+Test.t("Timer3G"+i+""));
                    System.out.println("Sending - "+"Timer3H"+i+" ---- > got - "+Test.t("Timer3H"+i+""));
                    System.out.println("Sending - "+"Timer3I"+i+" ---- > got - "+Test.t("Timer3I"+i+""));
                }
            }
        },1000,10);*/
    }
}