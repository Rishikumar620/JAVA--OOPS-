class Mul {
    int num1;
    int num2;
    int num3;
    int num4;
    Mul(int n1,int n2){
        this.num1=n1;
        this.num2=n2;   
    }
    double soln(){
        return num1*num2;
    }

    Mul(int n1,int n2,int n3){
        this.num1=n1;
        this.num2=n2;
        this.num3=n3;   
    }
    double soln1(){
        return num1*num2*num3;
    }
    
    Mul(int n1,int n2,int n3,int n4){
        this.num1=n1;
        this.num2=n2;
        this.num3=n3;
        this.num4=n4;
    }
    double soln2(){
        return num1*num2*num3*num4;
    }
    
}
public class Multiply{
    public static void main (String[] args){
        
    }
}

// class Mul1 extends Mul {
//     int num1;
//     int num2;
//     Mul1(int n1,int n2){
//         this.num1=n1;
//         this.num2=n2;   
//     }
//     double soln(){
//         return num1*num2;
//     }
// }

// public class Multiply(int i, int j){
//     this.i=num1;
//     this.j=num2;
//     return num1*num2;
// }
// public Multiply(int i, int j,int k, int l){
//     this.num1=i;
//     this.num2=j;
//     this.num3=k;
    
//     return num1*num2*num3;

// }
// public Multiply(int i, int j,int k){
//     this.num1=i;
//     this.num2=j;
//     this.num3=k;
//     return num1*num2*num3;
// }