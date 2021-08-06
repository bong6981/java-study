package bongf.githubDashBoard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class DashBoardTest {
    private static final String accessToken = "";
    private static final String repoName = "bong6981/JAVAAPI";
    private DashBoard dashBoard;

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void set() {
        dashBoard = new DashBoard(new GithubAPI(accessToken, repoName));
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("대시보드를 정확하게 보여줘야 한다")
    void showBoard() {
        dashBoard.insertData();
        dashBoard.showBoard();
        assertThat(outputStreamCaptor.toString().trim()).isEqualTo("bong6981:[1, 3]");
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
