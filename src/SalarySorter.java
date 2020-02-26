import java.util.Comparator;

public class SalarySorter implements Comparator<OrganizationStructure> {
    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
