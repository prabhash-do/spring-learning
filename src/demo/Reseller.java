package demo;

public class Reseller implements Company {


    private Agency agency;

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Reseller(){

    }

    @Override
    public String welcome() {
        return "welcome to new world of gaming";
    }

    @Override
    public String getAgencyService() {
        return (agency.advice());
    }
}
