import java.util.Random;

public class MatriceDeNumere {
    private Complex[][] matrice;
    public MatriceDeNumere(int row,int col)
    {
        this.matrice = new Complex[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                this.matrice[i][j] = new Complex(new Random().nextInt(10),new Random().nextInt(10));
            }
        }
    }
    public void afisareMatrice()
    {
        for(int i=0; i<matrice.length; i++)
        {
            for(int j=0; j<matrice[i].length; j++)
            {
                System.out.print(this.matrice[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public Complex getElement(int i,int j)
    {
        return this.matrice[i][j];
    }
    public void adunareMatrice(MatriceDeNumere matrix)
    {
        for(int i=0; i<matrice.length; i++)
        {
            for(int j=0; j<matrice[i].length; j++)
            {
                this.matrice[i][j].add(matrix.getElement(i,j));
            }
        }
    }

    public void scadereMatrice(MatriceDeNumere matrix)
    {
        for(int i=0; i<matrice.length; i++)
        {
            for(int j=0; j<matrice[i].length; j++)
            {
                this.matrice[i][j].sub(matrix.getElement(i,j));
            }
        }
    }
    public void inmultireMatrice(MatriceDeNumere matrix)
    {
        MatriceDeNumere rez = new MatriceDeNumere(matrice.length,matrice[0].length);
        int commonDim = this.matrice.length;
        for(int i=0; i<rez.matrice[0].length; i++)
        {
            for(int j=0; j<rez.matrice[i].length; j++)
            {
                rez.matrice[i][j] = new Complex(0,0);
                for(int k=0; k<commonDim; k++)
                {
                    Complex temp = new Complex(this.matrice[i][k].getReal(),this.matrice[i][k].getImag());
                    temp.mul(matrix.matrice[k][j]);
                    rez.matrice[i][j].add(temp);
                }
            }
        }
        this.matrice = rez.matrice;
    }


}
