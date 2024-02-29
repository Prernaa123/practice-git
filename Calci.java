interface calci{
 public  int Calci_Sum(int n1,int n2);
 public int Calci_sub(int n1,int n2);

}
public class calculater implements calci(){
    @override
    public int Calci_Sum(int n1,int n2){
        return n1+n2;
    }

    @override
    public int Calci_Sub(int n1,int n2){
        return n1-n2;
    }
}
class main(){
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        calculater c=new calculater();
        System.out.prinytln("the sum of the number is"+n1+"+"+n2+ "is"+c.Calci_Sum)
        System.out.prinytln("the difference of the number is"+n1+"+"+n2+ "is"+c.Calci_Sub)

        
    }
}