import java.util.Scanner;
    public class MangoTree1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if(n<100|| n>999){
        System.out.print("yes");
 }else{
    int mid=(n/10)%10;
    if(mid %3==0){
        System.out.print("no");

    }
}
}

}
