package one.digitalinovation.personapi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
