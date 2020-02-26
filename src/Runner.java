import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        OrganizationStructure organization = new Department("Some Organization Ltd");
        OrganizationStructure administrativeManagement = new Department("Administrative Management");
        OrganizationStructure commercialDepartment = new Department("Commercial Department");
        OrganizationStructure financialDepartment = new Department("Financial and Economic Department");
        OrganizationStructure humanResourcesDepartment = new Department("Human Resources Department");
        OrganizationStructure warehouseDepartment = new Department("Warehouse Department");

        organization.add(warehouseDepartment);
        organization.add(financialDepartment);
        organization.add(humanResourcesDepartment);
        organization.add(administrativeManagement);
        organization.add(commercialDepartment);

        commercialDepartment.add(new Position("Leslie Hudson", "Commercial Director", 650_000));
        commercialDepartment.add(new Position("Sophie Smith", "Manager", 150_000));
        commercialDepartment.add(new Position("Christopher White", "Leading Manager", 300_000));

        warehouseDepartment.add(new Position("Harry Webb", "Department Head", 210_000));
        warehouseDepartment.add(new Position("Kenneth Hancock", "Storekeeper", 175_000));
        warehouseDepartment.add(new Position("Scott Lyons","Loader", 170_000));

        administrativeManagement.add(new Position("Olivia Page", "Secretary", 100_000));
        administrativeManagement.add(new Position("Denis Blankenship", "Director", 800_000));

        financialDepartment.add(new Position("Betty Berry", "Financial Director", 500_000));
        financialDepartment.add(new Position("Grace Kennedy", "Accountant",180_000));

        humanResourcesDepartment.add(new Position("Caren Melton", "HR Manager", 140_000));
        humanResourcesDepartment.add(new Position("Suzanna Sheffield", "HR Director", 300_000));

        organization.print();

        System.out.println("\n");
        System.out.println("AFTER SORT BY NAME");
        System.out.println("\n");

        organization.sortByName();
        organization.print();

        System.out.println("\n");
        System.out.println("AFTER SORT BY PROFESSION");
        System.out.println("\n");

        organization.sortByProfession();
        organization.print();

        System.out.println("\n");
        System.out.println("AFTER SORT BY SALARY");
        System.out.println("\n");

        organization.sortBySalary();
        organization.print();
    }
}
