package mis.nccu.clubinfoplatform.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FollowRequest {
	@NotBlank
	@JsonProperty("user_id")
	private Long userId;
	@NotBlank
	@JsonProperty("activity_id")
	private Long activityId;

	public FollowRequest(Long userId, Long activityId) {
		this.userId = userId;
		this.activityId = activityId;
	}
}