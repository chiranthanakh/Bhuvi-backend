package net.javaguides.Bhuvi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
public class DistrictDto {
    private Long id;
    private String name;
    private String state;


    public DistrictDto(Long id, String name, String state) {
        this.id = id;
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}
