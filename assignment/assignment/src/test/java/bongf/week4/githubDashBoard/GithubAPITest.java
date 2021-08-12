package bongf.week4.githubDashBoard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class GithubAPITest {
    private static final String accessToken = "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";
    private static final String repoName = "bong6981/JAVAAPI";
    private GithubAPI githubAPI;

    @BeforeEach
    void set() {
        githubAPI = new GithubAPI(accessToken, repoName);
    }

    @Test
    @DisplayName("삭제된 이슈들 외에 이슈 넘버를 Set<Integer>으로 반환해야 한다")
    void getIssueNum() {
        Set<Integer> issueNumbers =  githubAPI.getIssueNumbers();
        assertThat(githubAPI.getIssueNumbers().toString()).isEqualTo("[1, 3]");
    }
}
