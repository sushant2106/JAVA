package innnerclass.localInnerClass;

public class Hotel {
    private String name;
    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void  reserverRoom(String guestName,int numOfRooms){
        class  ReservationValidator{
            boolean Validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can't be empty!");
                    return false;
                }
                if(numOfRooms <0){
                    System.out.println("Number of rooms should be +ve");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator=new ReservationValidator();

        if(validator.Validate()){
            reservedRooms+=numOfRooms;
            System.out.println("Reservation Confiremd for "+ guestName + " for " + numOfRooms + "rooms.");
        }
        else{
            System.out.println("Reservation Failed");
        }



    }
}
