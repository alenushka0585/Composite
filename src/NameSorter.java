import java.util.Comparator;

public class NameSorter implements Comparator<OrganizationStructure> {
    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
