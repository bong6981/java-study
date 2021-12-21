package bongf.week4.githubDashBoard;

import java.util.*;

public class DashBoard {
    private final Map<String, List<Integer>> commenterWithIssue;
    private final GithubAPI githubAPI;

    public DashBoard(GithubAPI githubAPI) {
        this.commenterWithIssue = new HashMap<>();
        this.githubAPI = githubAPI;
    }

    public void insertData() {
        for (Integer issueNumber : githubAPI.getIssueNumbers()) {
            for( String commenter : githubAPI.getCommenterBy(issueNumber)) {
                if ( commenterWithIssue.containsKey(commenter)) {
                    commenterWithIssue.get(commenter).add(issueNumber);
                } else {
                    commenterWithIssue.put(commenter, new ArrayList<Integer>(){{
                        add(issueNumber);
                    }});
                }
            };
        }
    }

    public void showBoard() {
        commenterWithIssue.forEach((key, value) -> System.out.println(key + ":" + value.toString()));
    }
}
