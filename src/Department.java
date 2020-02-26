import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends OrganizationStructure {
    List structure = new ArrayList();

    public Department(String name){
        this.name = name;
    }

    @Override
    public void add(OrganizationStructure organizationStructure) {
        structure.add(organizationStructure);
    }

    @Override
    public void remove(OrganizationStructure organizationStructure) {
        structure.add(organizationStructure);
    }

    @Override
    public List<OrganizationStructure> getList() {
        return structure;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("---------------------");

        Iterator iterator = structure.iterator();
        while (iterator.hasNext()){
            OrganizationStructure organizationStructure = (OrganizationStructure) iterator.next();
            organizationStructure.print();
        }
        System.out.println("*************************************");
    }

    @Override
    public List <OrganizationStructure> sortByProfession() {
        Iterator iterator = structure.iterator();
        while (iterator.hasNext()) {
            OrganizationStructure organizationStructure = (OrganizationStructure) iterator.next();
            organizationStructure.getList().sort(new ProfessionSorter());
        }
        return structure;
    }

    @Override
    public List <OrganizationStructure> sortBySalary() {
        Iterator iterator = structure.iterator();
        while (iterator.hasNext()) {
            OrganizationStructure organizationStructure = (OrganizationStructure) iterator.next();
            organizationStructure.getList().sort(new SalarySorter());
        }
        return structure;
    }

    @Override
    public List <OrganizationStructure> sortByName() {
        structure.sort(new NameSorter());
        Iterator iterator = structure.iterator();
        while (iterator.hasNext()) {
            OrganizationStructure organizationStructure = (OrganizationStructure) iterator.next();
            organizationStructure.getList().sort(new NameSorter());
        }
        return structure;
    }
}
