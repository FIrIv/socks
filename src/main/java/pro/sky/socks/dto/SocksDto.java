package pro.sky.socks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import pro.sky.socks.model.Color;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Builder
@Data
public class SocksDto {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("color")
    private Color color;

    @JsonProperty("cotton_part")
    private Integer cottonPart;

    @JsonProperty("quantity")
    private Integer quantity;
}
