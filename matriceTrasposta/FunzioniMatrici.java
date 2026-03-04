public class FunzioniMatrici<T>{

    public T [] [] caloloTrasposta(T [] [] matrice, T [] [] matriceNuova){
        for (int j = 0; j < matrice[0].length; j++) {
                for (int i = 0; i < matrice.length; i++) {
                    matriceNuova[j][i] = matrice[i][j];
                }
            }
            return matriceNuova;
        }

        public void printMatrice (T[] []matrice){
            for (int i = 0; i < matrice.length; i++) {
                System.out.print("{");
                for (int j = 0; j < matrice[0].length; j++) {
                    if (j!=0){
                        System.out.print(",");
                    }
                    System.out.print(matrice[i][j]);
                }
                System.out.println("}");
            }
        }

}
