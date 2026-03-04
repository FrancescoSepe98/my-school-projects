

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;


    /**
     * Ci permette di incrementare la variabile statica totalNumberOfEmployees, tenendo quindi traccia del totale degli
     * employee
     */
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    /**
     * Genera una stringa del tipo randomstring+surname+name+randomstring
     *
     */
    private String generateBadgeIdCode(){
        return RandomString.getAlphaNumericString(5) + employee.surname + employee.name + RandomString.getAlphaNumericString(5);
    }

    /**
     * ci permette di stampare il numero totale di employee ed i dettagli specifici associati al badge dell'employee
     * che possiede il badge che ha richiamato questo metodo.
     */
    public void showBadgeDetails(){
        System.out.printf(" total number of employee: %d  details of the %s badge Id %s",totalNumberOfEmployees,employee.getEmployeeDetails(),badgeIdCode + "\n");
    }

    /**
     * Metodo costruttore di un nuovo badge
     * @param employeeThatNeedsBadge Sara l'employee al quale assoceremo il nuovo badge
     */
    public Badge(Employee employeeThatNeedsBadge) {
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode=generateBadgeIdCode();
        keepTrackOfEmployeesNumber();
    }
}
