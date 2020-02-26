import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        OrganizationStructure organization = new Department("Some Organization Ltd");
        OrganizationStructure administrativeManagement = new Department("Administrative Management");
        OrganizationStructure commercialDepartment = new Department("Commercial Department");
        OrganizationStructure dealerSalesDepartment = new Department("Dealer Sales Department");
        OrganizationStructure retailDepartment = new Department("Retail Department");
        OrganizationStructure financialDepartment = new Department("Financial and Economic Department");
        OrganizationStructure humanResourcesDepartment = new Department("Human Resources Department");
        OrganizationStructure warehouseDepartment = new Department("Warehouse Department");
        OrganizationStructure warehouse1 = new Department("Warehouse # 1");
        OrganizationStructure warehouse2 = new Department("Warehouse # 2");

        organization.add(warehouseDepartment);
        organization.add(financialDepartment);
        organization.add(humanResourcesDepartment);
        organization.add(administrativeManagement);
        organization.add(commercialDepartment);

        commercialDepartment.add(retailDepartment);
        commercialDepartment.add(new Position("Leslie Hudson", "Commercial Director", 650_000));
        commercialDepartment.add(dealerSalesDepartment);

        warehouseDepartment.add(warehouse2);
        warehouseDepartment.add(new Position("Harry Webb", "Department Head", 210_000));
        warehouseDepartment.add(warehouse1);

        warehouse1.add(new Position("Kenneth Hancock", "Storekeeper", 175_000));
        warehouse2.add(new Position("Scott Lyons","Storekeeper", 170_000));

        administrativeManagement.add(new Position("Olivia Page", "Secretary", 100_000));
        administrativeManagement.add(new Position("Denis Blankenship", "Director", 800_000));

        dealerSalesDepartment.add(new Position("Sophie Smith", "Manager", 150_000));
        dealerSalesDepartment.add(new Position("Christopher White", "Department head", 300_000));

        retailDepartment.add(new Position("Karen Beasley", "Department head", 290_000));
        retailDepartment.add(new Position("Jack Morrison", "Manager", 125_000));

        financialDepartment.add(new Position("Grace Kennedy", "Accountant",180_000));
        financialDepartment.add(new Position("Betty Berry", "Financial Director", 500_000));

        humanResourcesDepartment.add(new Position("Caren Melton", "HR manager", 140_000));

        organization.print();

//        System.out.println("\n");
//        System.out.println("AFTER SORT BY NAME");
//        System.out.println("\n");
//
//        organization.sortByName();
//        organization.print();

        System.out.println("\n");
        System.out.println("AFTER SORT BY PROFESSION");
        System.out.println("\n");

        organization.sortByProfession();
        organization.print();



    }
}
