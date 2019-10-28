# project-3

 Section 1:
  DateTimeOne:
  1. getValueOfSecond() - get second from The LocalDateTime created
  2. dateTimeNow() - get the current LocalDateTime and Print it out using DateTimeFormatter.
  3. sleepForFiveSec() - stop the program for 5 second using Thread.sleep(5000L).
  4. dateTimeOfOtherCity() - add or subtrcting hours to get the Date and time of GMT and BST time zones.
  5. timeZoneHashMap() - using the DateTimeFormatter to put the date and time in the format privided and put that in a hash map
                        with the name of the region being key and the date and time format as value. Sort it using TreeMap and print out its contents.
                        Create the scond tree map with key from the content of the first one, sort it using TreeMap and print out the keys.
                        Create an array and put the LocalDateTime of those zones in it, sort it and pring it out.
  Section 2:
    DateTimeTwo:
    1. daysOfCurrentMonth() - get the dateNumber of current month and get the day of the week from that.
    2. daysOfAnyMonth() - set local date from the month and year of the inout and get the 15th and last day of that mongh. To get the last day of the month, get the length of the input month and get that value as the last day.
    3. CompareYear() - read the dates in the file and turn that into LocalDate, put it in a HashMap,calculate the differnece between that date and current date then see if they are leap year or not, and put them into the correct output form,.
    4. dateHashMap() - print out the content of the HashMap createed before.
    5. dateHashMapSorted() - sort map using TreeMap and print out the contents.
   The sorted List in this one is different from the sorted list in part 1 is due to the fact that part 1 uses String as keys and part 2 use LocalDate as keys. However, they both can be sort using TreeMap.
  Section 3: 
    1. MesoAsciiCal - calculate the average ascii value of the input station's stid, them calculate the average between that and the ascii value average of "NRMN".
    2. MesoEquivalent - read through the file, trim, replace spaces, turn it into MesoStation and put it all into a array list od MesoStation.
                        Go through that list and calculate the ascii average of each of the station, it it match with the input station ascii average, it it into a HashMap with the stID being the key and its average as the value.
    3. MesoLexicographical - Sort the input array using TreeMap.
  Section 4:
    DateSortingUsingAlgorithm
    1. DateSortingUsingAlgorithm() - read the file and turn its contents into Localdates, and put them into a HashMap
    2. dateHashMapSortedDescending() - Using TreeMap and Collections.reverseOrder() to sort the dates in a decending order, then print out it's contents.
    3. dateHashMapSorted() - Sort using TreeMap and print out the contents.
    
    dateHashMapSortedDescending() tend to takes just around 0.1 ms to 0.3 ms more than dateHashMapSorted(). The reason for this is because it has to go through Collections.reverseOrder() method to sort in decending order while dateHashMapSorted() does not have to.
