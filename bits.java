import java.util.Scanner;

public class bits {
    public static void main(String[] args) {


        //get bit
        int n=5; //0101
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask & n)==0)
        {
            System.out.println("the value is 0");
        }
        else
        {
            System.out.println("the value is 1");
        }

        //set bit
        int newnumber=bitmask | n;
        System.out.println(newnumber);

        //clear bit
        int notbitmask=~bitmask;
        int number=notbitmask &n;
        System.out.println(number);

        //update bit
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the operation 0 or 1");
        int oper=sc.nextInt();
        int posi=1;

        int bit=1<<posi;
        if(oper==1)
        {
            int newnumbe=bit | n;
            System.out.println(newnumbe);
        }
        else
        {
        int notbit=~bit;
        int numbe=notbit &n;
        System.out.println(numbe);

        }
    
    }
    
}