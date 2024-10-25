package net.javaguides.Bhuvi.dto;

import lombok.*;


@Data
@NoArgsConstructor
public class TalukDto {
    private Long id;
    private Long districtId;
    private String name;

    public TalukDto(Long id, Long districtId, String name ) {
        this.id = id;
        this.districtId = districtId;
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public String getName() {
        return name;
    }
}
