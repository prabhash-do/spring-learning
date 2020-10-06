package demo;

public class Customer implements Company {


    private Agency agency;

    public Customer(Agency agency1){
        agency=agency1;
    }

    public Customer(){
    }

    @Override
    public String welcome() {
       return "welcome you to the new world of gaming";
    }

    @Override
    public String getAgencyService() {
        return agency.advice();
    }

}
