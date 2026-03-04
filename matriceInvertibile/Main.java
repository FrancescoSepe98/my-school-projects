public class Main {
    public static void main(String[] args) throws Exception {
        double matriceQuadrata [][]={
                {1,1},
                {3,4},
        };
        double matriceTreXTre [][]={
                {1,1,1},
                {3,4,2},
                {-5,-2,6}
        };
        double matriceQuattroXQuattro [][]={
                {1,1,1,2},
                {3,4,2,-5},
                {-5,-2,6,-1},
                {1,2,3,4}
        };
        FunzioniMatrici fun = new FunzioniMatrici();
        double trasposta [][];
        double inversa [][];
        try {
            System.out.println("---------------------Stampa della matrice quadrata iniziale----------------------");
            fun.printMatrice(matriceQuadrata);
            System.out.println("---------------------Stampa della matrice quadrata trasposta----------------------");
            trasposta = fun.caloloTrasposta(matriceQuadrata);
            fun.printMatrice(trasposta);
            System.out.println("---------------------Stampa della matrice quadrata Inversa----------------------");
            inversa = fun.calcoloInversa(matriceQuadrata);
            fun.printMatrice(inversa);
            System.out.println("---------------------Stampa della matrice 3x3 iniziale----------------------");
            fun.printMatrice(matriceTreXTre);
            System.out.println("---------------------Stampa della matrice 3x3 trasposta----------------------");
            trasposta = fun.caloloTrasposta(matriceTreXTre);
            fun.printMatrice(trasposta);
            System.out.println("---------------------Stampa della matrice 3x3 Inversa----------------------");
            inversa = fun.calcoloInversa(matriceTreXTre);
            fun.printMatrice(inversa);
            System.out.println("---------------------Stampa della matrice 4x4 iniziale----------------------");
            fun.printMatrice(matriceQuattroXQuattro);
            System.out.println("---------------------Stampa della matrice 4x4 trasposta----------------------");
            trasposta = fun.caloloTrasposta(matriceQuattroXQuattro);
            fun.printMatrice(trasposta);
            System.out.println("---------------------Stampa della matrice 4x4 Inversa----------------------");
            inversa = fun.calcoloInversa(matriceQuattroXQuattro);
            fun.printMatrice(inversa);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
