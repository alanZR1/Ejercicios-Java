class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int myInt = Integer.parseInt("123a"); // Esto arrojara NumberFormatException
            System.out.println(myInt);
        } catch (NumberFormatException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
        
    }
}