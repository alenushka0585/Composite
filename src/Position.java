import java.util.List;

public class Position extends OrganizationStructure{
    public Position(String name, String profession, int salary){
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }
    
    @Override
    public void print() {
        System.out.println(" " + getName() +", " + getProfession() + ", " + getSalary());
    }
}
