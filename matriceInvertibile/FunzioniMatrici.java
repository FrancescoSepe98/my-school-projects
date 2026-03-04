public class FunzioniMatrici {


    /**
     * Metodo che stampa una matrice quadrata di tipo double
     * @param matrice la matrice da stampare
     * @throws RuntimeException eccezione che viene lanciata in caso di matrici non quadrate
     */
    public void printMatrice(double[][] matrice) throws RuntimeException {
            if (isQuadratic(matrice)){
            for (int i = 0; i < matrice.length; i++) {
                System.out.print("{");
                for (int j = 0; j < matrice[0].length; j++) {
                    if (j != 0) {
                        System.out.print(",");
                    }
                    System.out.print(matrice[i][j]);
                }
                System.out.println("}");
                }
            } else throw new RuntimeException("non si accettano matrici non quadrate!");
        }

    /**
     * Metodo che calcola la trasposta di una matrice quadrata di tipo double
     * @param matrice la matrice di cui calcolare la trasposta
     * @return viene ritornata la matrice trasposta, ossia le righe vengono trasformate nelle colonne e viceversa
     */
    public double[][] caloloTrasposta(double[][] matrice) {
        double [][] matriceTrasposta = new double[matrice.length][matrice.length];
        for (int j = 0; j < matrice[0].length; j++) {
            for (int i = 0; i < matrice.length; i++) {
                matriceTrasposta[j][i] = matrice[i][j];
            }
        }
        return matriceTrasposta;
    }

    /**
     * Controlla se la matrice è invertibile
     * @param matrice la matrice di cui controllare l'invertibilita'
     * @return ritorna true se la matrice e' invertibile, false altrimenti
     */
    public boolean isInvertible(double[][] matrice){
        if (isQuadratic(matrice) && calcoloDeterminante(matrice) != 0) {
                return true;
            }
        return false;
    }

    /**
     * Metodo che calcola la matrice inversa di una matrice quadrata di double
     * @param matrice la matrice di cui calcolare l'inversa
     * @return ritorna la matrice inversa
     *@throws RuntimeException eccezione che viene lanciata se la matrice data non è quadrata
     */
    public double[][] calcoloInversa(double[][] matrice) throws RuntimeException {
        if (isQuadratic(matrice)) {
            double[][] matriceComplementiAlgebrici = new double[matrice.length][matrice[0].length];
            double[][] matriceInversa;
            double det = calcoloDeterminante(matrice);
            if (isInvertible(matrice)) {
                for (int i = 0; i < matrice.length; i++) {
                    for (int j = 0; j < matrice[0].length; j++) {
                        matriceComplementiAlgebrici[i][j] = calcoloComplementoAlgebrico(matrice, i, j);
                    }
                }
                matriceInversa = caloloTrasposta(matriceComplementiAlgebrici);
                for (int i = 0; i < matriceInversa.length; i++) {
                    for (int j = 0; j < matriceInversa[0].length; j++) {
                        matriceInversa[i][j] = matriceInversa[i][j] * (1 / det);
                    }
                }
            } else {
                System.out.println("La matrice non e' invertibile");
                return matrice;
            }
            return matriceInversa;
        } else throw new RuntimeException("Non e' possibile calcolare l'inversa di una matrice non quadrata!");
    }

    /**
     * Metodo che calcolo il complemento algebrico dell elemento a[i][j] in una matrice quadrata
     * @param matrice la matrice che contiene a[i][j]
     * @param row la riga su cui si trova l'elemento del quale dobbiamo calcolare il complemento algebrico
     * @param column la colonna su cui si trova l'elemento del quale dobbiamo calcolare il complemento algebrico
     * @return ritorna il complemento algebrico sotto forma di double
     * @throws RuntimeException eccezione che viene lanciata se la matrice data non è quadrata
     */
    public double calcoloComplementoAlgebrico(double matrice[][], int row, int column) throws RuntimeException {
        if (isQuadratic(matrice)){
        double matriceMinoriComplementari[][] = calcoloMatriceMinoreComplementare(matrice, row, column);
        double complementoAlgebrico = (Math.pow(-1, (row + 1 * column)) * (calcoloDeterminante(matriceMinoriComplementari)));
        return complementoAlgebrico;} else throw new RuntimeException("Non e' possibile calcolare il complemeto algebrico di matrici non quadrate!");
    }

    /**
     * Meoto che calcola il determinante di una matrice quadrata
     * @param matrice la matrice di cui calcolare il determinante
     * @return ritorna il determinante della matrice come un double
     * @throws RuntimeException eccezione che viene lanciata se la matrice data non è quadrata
     */
    public double calcoloDeterminante(double[][] matrice) throws RuntimeException {
        if (isQuadratic(matrice)){
            double determinante = 0;
            if (matrice.length == 1 && matrice[0].length == 1) {
                determinante = matrice[0][0];
            } else if (matrice.length == 2 && matrice[0].length == 2) {
                determinante = ((matrice[0][0] * matrice[1][1]) - (matrice[0][1] * matrice[1][0]));
            } else if (matrice.length == 3 && matrice[0].length == 3) {
                double sumDiagonali = (matrice[0][0] * matrice[1][1] * matrice[2][2]) + (matrice[0][1] * matrice[1][2] * matrice[2][0]) + (matrice[0][2] * matrice[1][0] * matrice[2][1]);
                double sumAntiDiagonali = (matrice[0][2] * matrice[1][1] * matrice[2][0]) + (matrice[0][1] * matrice[1][0] * matrice[2][2]) + (matrice[0][0] * matrice[1][2] * matrice[2][1]);
                determinante = sumDiagonali - sumAntiDiagonali;
            } else if (matrice.length > 3 && matrice[0].length > 3) {
                for (int i = 0; i < 1; i++) {
                    int segno = -1;
                    for (int j = 0; j < matrice.length; j++) {
                        determinante = determinante + (((Math.pow(segno, j + 2)) * (matrice[i][j])) * calcoloDeterminante(calcoloMatriceMinoreComplementare(matrice, i, j)));
                    }
                }
            }
            return determinante;
        } else throw new RuntimeException("Non è possibile calcolare il determinante su matrici non quadrate!");
    }

    /**
     * Metodo che calcola la matrice minore complementare dell' elemento a[i][j]
     * @param matrice  la matrice che contiene a[i][j]
     * @param row la riga che contiene l'elemento
     * @param column la colonna che contiene l'elemento
     * @return ritorna una matrice di double di grandezza matrice.lenght-1 , che forma il minore complementare
     * dell'elemento a[i][j]
     * @throws RuntimeException eccezione che viene lanciata se la matrice data non è quadrata
     */
    public double[][] calcoloMatriceMinoreComplementare(double[][] matrice, int row, int column) throws RuntimeException {
        if (isQuadratic(matrice)) {
            double matriceMinoriComplementari[][] = new double[matrice.length - 1][matrice[0].length - 1];
            int indexRows = 0;
            for (int i = 0; indexRows < matriceMinoriComplementari.length; i++) {
                if (i != row) {
                    int indexColumns = 0;
                    for (int j = 0; indexColumns < matriceMinoriComplementari[0].length; j++) {
                        if (j != column) {
                            matriceMinoriComplementari[indexRows][indexColumns] = matrice[i][j];
                            indexColumns++;
                        }
                    }
                    indexRows++;
                }
            }
            return matriceMinoriComplementari;
        } else throw new RuntimeException("Non è possibile calcolare il minore complementare su matrici non quadrate!");

    }

    /**
     * Metodo che controlla che la matrice è quadrata
     * @param matrice la matrice da controllare
     * @return ritorna true se la matrice è quadrata, false altrimenti
     */
    public boolean isQuadratic(double matrice [][]){
        boolean flag = true;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (matrice.length != matrice[i].length){
                    flag= false;
                }
            }
        }
        return flag;
    }
}
