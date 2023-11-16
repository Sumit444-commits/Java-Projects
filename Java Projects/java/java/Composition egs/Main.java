
class Television{

    int no_of_channels;
    int resolution;

    int tv_size;

    int usb_ports;

    int hdmi_ports;

    String bt_support;


  Television(int no_of_channels,int resolution,int tv_size,int usb_ports,int hdmi_ports,String bt_support){
      this.bt_support=bt_support;
      this.hdmi_ports=hdmi_ports;
      this.no_of_channels=no_of_channels;
      this.tv_size=tv_size;
      this.usb_ports=usb_ports;
      this.resolution=resolution;


  }

  public void power_on(){

      System.out.println("The tv has turned on");
  }

    public void power_off(){

        System.out.println("The tv has turned off");
    }

    public void change_channel(){

        System.out.println("The channel is changed");
    }

    public void volume_up(){

        System.out.println("Volume up");
    }

    public void volume_down(){

        System.out.println("Volume Down");
    }

    public void change_setting(){

        System.out.println("setting changed");
    }


}

class remote{

    Television television;

remote(Television television){
    this.television=television;
}
    public void power_on(){

        television.power_on();
    }

    public void power_off(){

        television.power_off();
    }


    public void change_channel(){

        television.change_channel();
    }

    public void volume_up(){

        television.volume_up();
    }
    public void volume_down(){

        television.volume_down();
    }
    public void change_setting(){

        television.change_setting();
    }

}

public class Main {
    public static void main(String[] args) {

        Television te=new Television(90,40,50,6,7,"yes");

        remote ro=new remote(te);

        ro.change_channel();
        ro.change_setting();
        ro.power_off();
        ro.power_on();
        ro.volume_up();
        ro.volume_down();


    }

}