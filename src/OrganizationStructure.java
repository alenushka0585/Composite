import java.util.List;

public abstract class OrganizationStructure {
    public void add(OrganizationStructure organizationStructure){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationStructure organizationStructure){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getProfession(){
        return null;
    }

    public Integer getSalary(){
        throw new UnsupportedOperationException();
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
}
