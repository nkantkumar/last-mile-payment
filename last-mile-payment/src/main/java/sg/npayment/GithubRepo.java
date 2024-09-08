package sg.npayment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GithubRepo {
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    private String description;
    private Boolean fork;
    @JsonIgnore
    private Integer localVersion;
}
