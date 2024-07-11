import java.util.Arrays;
public class merge{
    public static void main(String[] args)
    {
        int[] A1={1,2,3,4};
        int[] A2={2,3,5,7};
        int[] M= new int[A1.length+A2.length];
        int j=0;
        for(int i=0;i<M.length;i++)
        {
            if (i<A1.length)
            {
                M[i]=A1[i];
            }
            else
            {
                M[i]=A2[j];
                j+=1;
            }
        }
    Arrays.sort(M);
    for (int n:M)
    {
        System.out.print(n);
    }
    }
}