package org.scrumbledores.user.dataclass;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ActivityDTO {

    @NotEmpty
    @Size(max = 40)
    private String title;
    @NotEmpty
    private String description;
    private String recommendedSkills;
    private List<String> categories = new ArrayList<>();
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endDate;
}
