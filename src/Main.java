import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int notc = in.nextInt();
        for(int i=0 ; i<notc ;i++){
            in.nextLine();

            int N = in.nextInt();
            int K = in.nextInt();
            int case_no = i+1;
            int arr[][]= new int[N][N];
            if(K%N==0){
                System.out.print("Case #"+case_no+": POSSIBLE\n");
                for(int j = 0;j<N;j++)
                {
                    arr[j][j]=K/N;
                }
                for(int c =0;c<N;c++) {
                    int m ;
                    if(Math.pow(N,2)==K){
                        m=1;
                    }else{m=0;}

                    int n = N-1;
                    for (int d = c + 1; d < N; d++) {
                         // System.out.println("c.d"+c+" "+d);
                        if((N-m)==(K/N)){
                           // System.out.println("N-m ==N/K");
                            m++;
                            //System.out.println("Value of m"+m);
                        }
                        if((N-n)==(K/N)){
                            n--;
                            //System.out.println("Value of n"+n);
                        }
                       // System.out.println("Value of N-m"+(N-m));

                        arr[c][d] = N-m;
                       // System.out.println("Value of N-n"+(N-n));


                        arr[d][c] = N-n;
                        m++;

                        n--;
                    }
                }

                for(int y = 0;y<N;y++)
                {
                    for(int z =0;z<N;z++){
                        System.out.print(arr[y][z]+" ");
                    }
                    if(y!=N-1) {
                        System.out.print("\n");
                    }
                }




            }
            else{System.out.print("Case #"+case_no+": IMPOSSIBLE\n");}

        }
    }
}
