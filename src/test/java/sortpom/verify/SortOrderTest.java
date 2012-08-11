package sortpom.verify;

import org.junit.Test;
import sortpom.verify.util.VerifyOrderFilesUtil;

public class SortOrderTest {

    @Test
    public final void testSortDifferentClassPathShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .defaultOrderFileName("difforder/differentOrder.xml")
                .testVerifyXmlIsOrdered("/full_differentorder_expected.xml");
    }

    @Test
    public final void testSortXmlCharacterShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsOrdered("/Character_expected.xml");
    }

    @Test
    public final void testSortXmlComplexShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsOrdered("/Complex_expected.xml");
    }

    @Test
    public final void testSortXmlFullFromAlfabeticalOrderShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsOrdered("/full_expected.xml");
    }

    @Test
    public final void testSortXmlReal1ShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsOrdered("/Real1_expected.xml");
    }

    @Test
    public final void testSortXmlSimpleShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsOrdered("/Simple_expected.xml");
    }

    @Test
    public final void testSortWithIndentShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .nrOfIndentSpace(4)
                .testVerifyXmlIsOrdered("/Simple_expected_indent.xml");
    }

    @Test
    public final void testSortWithDependencySortSimpleShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .sortDependencies()
                .sortPlugins()
                .testVerifyXmlIsOrdered("/Simple_expected_sortDep.xml");
    }

    @Test
    public final void testSortWithDependencySortFullShouldNotAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .sortDependencies()
                .sortPlugins()
                .testVerifyXmlIsOrdered("/SortDep_expected.xml");
    }


    
    @Test
    public final void testSortDifferentClassPathShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .defaultOrderFileName("difforder/differentOrder.xml")
                .testVerifyXmlIsNotOrdered("/full_unsorted_input.xml", "The xml element <parent> should be replaced with <modelVersion>");
    }

    @Test
    public final void testSortXmlCharacterShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsNotOrdered("/Character_input.xml", "The xml element <artifactId> should be replaced with <modelVersion>");
    }

    @Test
    public final void testSortXmlComplexShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsNotOrdered("/Complex_input.xml", "The xml element <artifactId> should be replaced with <modelVersion>");
    }

    @Test
    public final void testSortXmlFullFromAlfabeticalOrderShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsNotOrdered("/full_alfa_input.xml", null);
    }

    @Test
    public final void testSortXmlFullShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsNotOrdered("/full_unsorted_input.xml", null);
    }

    @Test
    public final void testSortXmlReal1ShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsNotOrdered("/Real1_input.xml", null);
    }

    @Test
    public final void testSortXmlSimpleShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .testVerifyXmlIsNotOrdered("/Simple_input.xml", null);
    }

    @Test
    public final void testSortWithDependencySortFullShouldAffectVerify() throws Exception {
        VerifyOrderFilesUtil.create()
                .sortDependencies()
                .sortPlugins()
                .testVerifyXmlIsNotOrdered("/SortDep_input.xml", null);
    }
}