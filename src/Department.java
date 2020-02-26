import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends OrganizationStructure {
    ArrayList structure = new ArrayList();
    private String name;

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
    public String getName() {
        return name;
    }

    @Override
    public String getProfession() {
        return null;
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
    public String toString() {
        return name;
    }

    @Override
    public List <OrganizationStructure> sortByName(){
        structure.sort(new NameSorter());

        Iterator iterator = structure.iterator();
        while (iterator.hasNext()){
            OrganizationStructure organizationStructure = (OrganizationStructure) iterator.next();
            organizationStructure.getList().sort(new NameSorter());
            System.out.println("111111111111111111"+ organizationStructure);

            if (organizationStructure instanceof Department){
            Iterator iterator2 = organizationStructure.getList().iterator();
            while (iterator2.hasNext()) {
                OrganizationStructure organizationStructure2 = (OrganizationStructure) iterator2.next();
                if (organizationStructure2.getList()!=null) {
                    System.out.println("22222222222222"+ organizationStructure);
                    organizationStructure2.getList().sort(new NameSorter());
                }
            }
            }
        }
        return structure;
    }

//    @Override
//    public List <OrganizationStructure> sortByProfession() {
////        structure.sort(new ProfessionSorter());
//
//        Iterator iterator = structure.iterator();
//        while (iterator.hasNext()){
//            OrganizationStructure organizationStructure = (OrganizationStructure) iterator.next();
//            System.out.println("111111111111111111"+ organizationStructure);
//            if (organizationStructure.getProfession()!=null) {
//                organizationStructure.getList().sort(new ProfessionSorter());
//            }
//
//            if (organizationStructure instanceof Department){
//            Iterator iterator2 = organizationStructure.getList().iterator();
//            while (iterator2.hasNext()) {
//                OrganizationStructure organizationStructure2 = (OrganizationStructure) iterator2.next();
//                if (organizationStructure2.getProfession()!=null && organizationStructure2.getList()!=null) {
//                    System.out.println("22222222222222"+ organizationStructure);
//                    organizationStructure2.getList().sort(new ProfessionSorter());
//                }
//            }
//            }
//        }
//        return structure;
//    }
}
