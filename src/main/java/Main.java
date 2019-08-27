class Main {
    public static void main(String[] args) {
        Airport warsaw = new Airport("Warsaw");
        Airport praga = new Airport("Praga");
        Airport berlin = new Airport("Berlin");
        Airport barcelona = new Airport("Barcelona");
        Airport newyork = new Airport("newyork");

        warsaw.addToAirports(praga);
        warsaw.addToAirports(berlin);
        warsaw.addToAirports(barcelona);

        berlin.addToAirports(praga);
        berlin.addToAirports(newyork);

        Flight flight1 = new Flight();

        System.out.println("Czy lot może się odbyć? " + flight1.findFlight(warsaw, newyork));


        System.out.println("End of program.");
    }
}