public class matmul{
    public static void main(String[] args)
    {
        int[][] mat1={{1,2},{5,3}};
        int[][] mat2={{2,3},{4,1}};
        int[][] result={{0,0},{0,0}};
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat2.length;j++)
            {
                for(int k=0;k<mat2.length;k++)
                {
                    result[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int j=0;j<mat2.length;j++)
            {
                for(int k=0;k<mat2.length;k++)
                {
                 System.out.print(result[j][k]+" ");
                }
                System.out.println();
            }
        
    }
}