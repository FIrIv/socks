package pro.sky.socks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SocksDto {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("color")
    private String color;

    @JsonProperty("cotton_part")
    private Integer cottonPart;

    @JsonProperty("quantity")
    private Integer quantity;
}
