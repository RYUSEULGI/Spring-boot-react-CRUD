package springmvc.mission.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	private long id;
	private String wirter;
	private String email;
	private String subject;
	private String content;
	private Date rdate;
}
