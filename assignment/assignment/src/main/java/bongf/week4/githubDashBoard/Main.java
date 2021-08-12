package bongf.week4.githubDashBoard;

public class Main {
    private static final String accessToken = "";
    private static final String repoName = "whiteship/live-study";

    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard(new GithubAPI(accessToken, repoName));
        dashBoard.insertData();
        dashBoard.showBoard();
    }
}

