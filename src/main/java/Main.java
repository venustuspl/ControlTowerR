class Main {
    public static void main(String[] args) {
        Airport warsaw = new Airport(1,"Warsaw");
        Airport praga = new Airport(2,"Praga");
        Airport berlin = new Airport(3,"Berlin");
        Airport barcelona = new Airport(4,"Barcelona");
        Airport newyork = new Airport(5,"newyork");

        warsaw.addToAirports(praga);
        warsaw.addToAirports(berlin);
        warsaw.addToAirports(barcelona);

        berlin.addToAirports(praga);
        berlin.addToAirports(newyork);

        System.out.println(Flight.findFlight(warsaw,newyork));



        System.out.println("End of program.");
    }
}