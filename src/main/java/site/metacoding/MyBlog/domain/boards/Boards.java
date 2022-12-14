package site.metacoding.MyBlog.domain.boards;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.MyBlog.web.dto.request.boards.UpdateDto;

@NoArgsConstructor
@Getter
@Setter
public class Boards {

	private Integer id;
	private String title;
	private String content;
	private Integer usersId;
	private Timestamp createdAt;
	
	public Boards(String title, String content, Integer usersId) {
		this.title = title;
		this.content = content;
		this.usersId = usersId;
	}
	public void updateBoards(UpdateDto updateDto) {
		this.title=updateDto.getTitle();
		this.content=updateDto.getContent();
	}
	

	
	
}
