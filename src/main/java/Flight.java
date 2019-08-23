class Flight{



    public static int findFlight(Airport start, Airport end){

        int result = 0;
        if (start.airports.size() >0){
            for(Airport entry : start.airports){
                if (entry.getAirportId() == end.getAirportId()){
                    result = entry.getAirportId();
                    System.out.println("Jest " + result);
                    return result;
                    //break;

                }else{
                    System.out.println("wchodzę do " + entry.getAirportId());
                    findFlight(entry,end);
                }

            }

        }
        return result;
    }
}