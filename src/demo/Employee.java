package demo;

public class Employee implements Company {
    private int id;
    private String name;

    private Agency agency;

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String welcome() {
        return "Do your work as directed";
    }

    @Override
    public String getAgencyService() {
        return (agency.advice());
    }
}
