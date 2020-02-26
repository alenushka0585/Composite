import java.util.List;

public abstract class OrganizationStructure {
    String name;
    Integer salary;
    String profession;
    public void add(OrganizationStructure organizationStructure){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationStructure organizationStructure){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public String getProfession(){
        return profession;
    }

    public Integer getSalary(){
        return salary;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public List<OrganizationStructure> getList(){
        return null;
    }

    public List <OrganizationStructure> sortByName(){
        throw new UnsupportedOperationException();
    }

    public List <OrganizationStructure> sortByProfession(){
        throw new UnsupportedOperationException();
    }
    public List <OrganizationStructure> sortBySalary(){
        throw new UnsupportedOperationException();
    }
}
