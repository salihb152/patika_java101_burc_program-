import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
    int month,day;
    Scanner sc = new Scanner(System.in);

    System.out.println("Doğduğunuz ay : ");
    month=sc.nextInt();

    System.out.println("Doğduğunuz gün : ");
    day=sc.nextInt();
    String burc=null;
    boolean isError= false;

    if(month==1){
        if(day<=31&&day>0){
            if(day<22){
                burc="Oğlak";
            }else{
                burc="Kova";
            }
        } else{
            isError=true;
        }
    } else if(month==2){
        if(day<=28&&day>0){
            if(day<20){
                burc="Kova";
            }else{
                burc="Balık";            }
        } else{
            isError=true;
        }
    } else if(month==3){
        if(day<=31&&day>0){
            if(day<21){
                burc="Balık";
            }else{
                burc="Koç";
            }
        } else{
            isError=true;
        }
    }else if(month==4){
        if(day<=30&&day>0){
            if(day<21){
                burc="Koç";
            }else{
                burc="Boğa";
            }
        } else{
            isError=true;
        }
    }else if(month==5){
        if(day<=31&&day>0){
            if(day<22){
                burc="Boğa";
            }else{
                burc="İkizler";
            }
        } else{
            isError=true;
        }
    }else if(month==6){
        if(day<=30&&day>0){
            if(day<23){
                burc="İkizler";
            }else{
                burc="Yengeç";
            }
        } else{
            isError=true;
        }
    }else if(month==7){
        if(day<=31&&day>0){
            if(day<23){
                burc="Yengeç";
            }else{
                burc="Aslan";
            }
        } else{
            isError=true;
        }
    }else if(month==8){
        if(day<=31&&day>0){
            if(day<23){
                burc="Aslan";
            }else{
                burc="Başak";
            }
        } else{
            isError=true;
        }
    }else if(month==9){
        if(day<=30&&day>0){
            if(day<23){
                burc="Başak";
            }else{
                burc="Terazi";
            }
        } else{
            isError=true;
        }
    }else if(month==10){
        if(day<=31&&day>0){
            if(day<23){
                burc="Terazi";
            }else{
                burc="Akrep";
            }
        } else{
            isError=true;
        }
    }else if(month==11){
        if(day<=30&&day>0){
            if(day<22){
                burc="Akrep";
            }else{
                burc="Yay";
            }
        } else{
            isError=true;
        }
    }else if(month==12){
        if(day<=31&&day>0){
            if(day<22){
                burc="Yay";
            }else{
                burc="Oğlak";
            }
        } else{
            isError=true;
        }
    }
    
    if(isError){
        System.out.println("Hatalı giriş yaprınız, tekrar deneyiniz.");
    }else{
        System.out.println("Merhaba, burcunuz : "+burc);
    }
    sc.close();

}
}
