import java.util.List;

public class Position extends OrganizationStructure{
    private String name;
    private String profession;
    private Integer salary;

    public Position(String name, String profession, int salary){
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProfession() {
        return profession;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public List<OrganizationStructure> getList() {
        return null;
    }

    @Override
    public void print() {
        System.out.println(" " + getName() +", " + getProfession() + ", " + getSalary());
    }

    @Override
    public String toString() {
        return name;
    }

}
