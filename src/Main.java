import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 ,n2,select;


        Scanner inp = new Scanner(System.in);

        System.out.println("ilk sayiyi giriniz");
        n1=inp.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        n2=inp.nextInt();

        System.out.println("1-toplam\n2-cikarma\n3-carpma\n4-bolme");
        System.out.println("seciminiz");
        select = inp.nextInt();


        switch (select)
        {
            case 1:
                System.out.println("toplama" + (n1+n2));
                break;
            case 2:
                System.out.println("cikarma" + (n1-n2));
                break;
            case 3:
                System.out.println("carpma" + (n1*n2));
                break;
            case 4:
                System.out.println("bolme" + (n1/n2));
                break;
            default:
                System.out.println("hatalı secim");
        }


    }
}