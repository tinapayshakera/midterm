public class User<VariableType> {
    
    private String myName;
    private String myVehicle;
    private VariableType myDetails;

    public void setMyDetails(VariableType myDetails){
        this.myDetails=myDetails;
    }
    public VariableType getMyDetails(){
        return myDetails;
    }

    public void setMyName(String myName){
        this.myName=myName;
    }
    public String getMyName(){
        return myName;
    }
    public void setMyVehicle(String myVehicle){
        this.myVehicle=myVehicle;
    }
    public String getMyVehicle(){
        return myVehicle;
    }
}
