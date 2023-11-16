public class Clock{
    int hours;
    int minutes;
    int seconds;
    public void set(int h,int m,int s){
        this.hours=h;
        this.minutes=m;
        this.seconds=s;
    }
    public void geter(){
        System.out.println("H : "+this.hours);
        System.out.println("M : "+this.minutes);
        System.out.println("S : "+this.seconds);
    }

    public int convert_to_sec(int hour){
        int sec = hour*60*60;
        return sec;
    }
    public int convert_to_sec(int hour,int minute){
        int sec = hour*60*60;
        int m_s= minute*60;
        sec = sec+m_s;
        return sec;
    }

    public int convert_to_hour(int sec){
        int h = (sec/60)/60;
        return h;
    }
    public int convert_to_hour(int sec,int minute){
       int h = (sec/60)/60;
        int m_h= minute/60;
        h = h+m_h;
        return h;
    }




    public static void main(String[] args) {
      
    }
}