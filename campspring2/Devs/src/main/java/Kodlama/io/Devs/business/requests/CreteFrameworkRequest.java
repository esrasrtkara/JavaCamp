package Kodlama.io.Devs.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreteFrameworkRequest {
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20)
	private String name;
	@NotNull
	@NotBlank
	private int languageId;
	

}
