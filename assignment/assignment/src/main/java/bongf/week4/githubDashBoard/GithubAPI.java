package bongf.week4.githubDashBoard;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GithubAPI {
    private final GitHub gitHub;
    private final GHRepository repository;

    public GithubAPI(String accessToken, String repoName) {
        this.gitHub = connect(accessToken);
        this.repository = getRepo(repoName);
    }

    private GitHub connect(String accessToken) {
        try {
            return new GitHubBuilder().withOAuthToken(accessToken)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private GHRepository getRepo(String repoName) {
        try {
            return gitHub.getRepository(repoName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Set<String> getCommenterBy(int issueNum) {
        Set<String> commenter = new HashSet<>();
        List<GHIssueComment> comments = getComments(issueNum);

        if (comments == null) {
            return null;
        }

        for (GHIssueComment comment : comments) {
            try {
                commenter.add(comment.getUser().getLogin());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return commenter;
    }

    public Set<Integer> getIssueNumbers() {
        PagedIterable<GHIssue> allGhIssues = repository.listIssues(GHIssueState.ALL);
        Set<Integer> issueNumbers = new HashSet<>();
        for (GHIssue ghIssue : allGhIssues) {
            issueNumbers.add(ghIssue.getNumber());
        }
        return issueNumbers;
    }

    private List<GHIssueComment> getComments(int issueNum) {
        try {
            return repository.getIssue(issueNum).getComments();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
