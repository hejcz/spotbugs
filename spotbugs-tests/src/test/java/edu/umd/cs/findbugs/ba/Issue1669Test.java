package edu.umd.cs.findbugs.ba;

import edu.umd.cs.findbugs.AbstractIntegrationTest;
import edu.umd.cs.findbugs.SortedBugCollection;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

public class Issue1669Test extends AbstractIntegrationTest {

    @Test
    public void test() {
        performAnalysis("ghIssues/Issue1669.class");
        SortedBugCollection bugCollection = (SortedBugCollection) getBugCollection();
        assertThat(bugCollection.getErrors(), hasSize(0));
    }

}
