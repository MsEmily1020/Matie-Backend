package com.ost.matie.dto.team;

import com.ost.matie.domain.image.Image;
import com.ost.matie.domain.point.Point;
import com.ost.matie.domain.team.Team;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class TeamResponse {
    private final Long id;
    private final String title;
    private final String description;
    private final LocalDateTime startDate;
    private final LocalDateTime finishDate;
    private final List<Long> userList;
    private final Image image;

    public TeamResponse(Team team) {
        this.id = team.getId();
        this.title = team.getTitle();
        this.description = team.getDescription();
        this.startDate = team.getStartDate();
        this.finishDate = team.getFinishDate();
        this.userList = team.getUserList();
        this.image = team.getImage();
    }
}
