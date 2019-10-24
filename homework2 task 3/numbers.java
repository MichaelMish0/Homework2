package homework2;

public class numbers implements numberinterface {
    int a;
    int b;
    private boolean simpleDivisor(int g){
        for (int j=1, k=0; j <= g; j++){
            if (g % j == 0){
                k++;
            }
            if (k > 2){
                return false;
            }
        }
        return true;
    }

    @Override
    public void printNumbers() {
        int a1 = a;
        int b1 = b;
        if (a1 > b1) {
            a1 = a1 + b1;
            b1 = a1 - b1;
            a1 = a1 - b1;
        }
        System.out.format("numbers between the range(%d, %d):\n", a1, b1);
        while (a1 < b1-1) {
            a1+=1;
            System.out.println(a1);
        }


    }

    @Override
    public void divisorsOfA(int x){
        System.out.printf("Divisors of A:");
        for(int i=1;i<=x;i++) if(x%i==0)
            System.out.printf("%d ",i);
    }

    @Override
    public void simpleDivisorsOfB(int y){
        System.out.printf("Simple divisors of B:");
        for(int i=1;i<=y;i++) if(y%i==0 && simpleDivisor(i))
            System.out.printf("%d ",i);
    }
}

