ingresarBooleanstatic boolean ingresarBoolean(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        boolean valor= sc.nextBoolean();
        return valor;
    }