class Main {
  public static void main(String[] args) {

    //Use the timeMillis variable to extract the number of days, hours, minutes and seconds since Unix time (January 1, 1970)
   
     // 1 day = 86400000
     // 1 hour = 3600000
     // 1 min = 60000
     // 1 sec = 1000

    // Example output:
    // 19143 days 23 hours 10 mins 55 seconds have passed since Unix
    
    
     long timeMillis = System.currentTimeMillis();

     // Extract the amount of days from total millseconds

    //  Get rid of days from total milliseconds to get the remaining milliseconds

    // Extract the amount of hours from remaining milliseconds

    //  Get rid of hours from remaining milliseconds to get the new remaining milliseconds

     // Extract the amount of minutes from remaining milliseconds

    //  Get rid of minutes from remaining milliseconds to get the new remaining milliseconds


     // Extract the amount of seconds from remaining milliseconds
    
     long timeMiles = System.currentTimeMillis();
        System.out.println("Current = " + timeMiles);

        //Extract the amount of days from totalMilesSecond

        long days = timeMiles / 86400000;
        System.out.println("Days " + days);
        long remaining = timeMiles % 86400000;

        long hours = timeMiles / 3600000;
        System.out.println("Hours " + hours);
         remaining = timeMiles % 3600000;

        long mins = timeMiles / 60000;
        System.out.println("mins " + mins
        );
         remaining = timeMiles % 60000;

        long sec = timeMiles / 1000;
        System.out.println("sec " + sec);
         remaining = timeMiles % 1000;

        System.out.println("Days "+ days + "hours" + hours + "mins " + mins + "sec" + sec); 

    }
}

    
    
  
