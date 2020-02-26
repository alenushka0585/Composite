import java.util.Comparator;

public class ProfessionSorter implements Comparator<OrganizationStructure> {
    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return o1.getProfession().compareTo(o2.getProfession());
    }
}
