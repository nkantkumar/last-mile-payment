package sg.npayment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GithubRepoApp {
    public static void main(String[] args) {
        List<GithubRepo> repos = new ArrayList<>();
        repos.stream().collect(Collectors.toMap(GithubRepo::getName, Function.identity(),
                (ghrPrevious, ghrNew) -> ghrNew));

    }
}
